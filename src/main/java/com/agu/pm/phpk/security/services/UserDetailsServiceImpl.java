package com.agu.pm.phpk.security.services;

import com.agu.pm.phpk.repository.UserRepository;
import com.agu.pm.phpk.model.User;
import io.jsonwebtoken.lang.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
    UserRepository userRepository;

	@Autowired
	PasswordEncoder encoder;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));

		return UserPrinciple.build(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void updateUser(User user) {
		userRepository.updateUser(user.getName(), user.getUsername(), user.getEmail(), user.getId());
		System.out.println(user.getRoles().iterator().next().getId());
//		userRepository.updateRole(user.getRoles().iterator().next().getId(), user.getId());
		if (!user.getPassword().equals("")) {
			userRepository.resetPassword(encoder.encode(user.getPassword()), user.getId());
		}
	}

	public void deleteUser(Integer id) {
		userRepository.delete(id);
	}
}