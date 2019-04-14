package com.agu.pm.phpk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.agu.pm.phpk.model.User;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    List<User> findAll();


    @Modifying
    @Transactional
    @Query(value = "delete from Users where id = ?1", nativeQuery = true)
    void delete(Integer id);

    @Modifying
    @Transactional
    @Query(value = "update Users set name = ?1, username = ?2, email = ?3 where id = ?4" ,nativeQuery = true)
    void updateUser(String name, String userName, String email, Integer id);

    @Modifying
    @Transactional
    @Query(value = "update Users set password = ?1 where id = ?2", nativeQuery = true)
    void resetPassword(String password, Integer id);

    @Modifying
    @Transactional
    @Query(value = "update User_Roles set role_id = ?1 where user_id = ?2", nativeQuery = true)
    void updateRole(Integer roleId, Integer userId);

}