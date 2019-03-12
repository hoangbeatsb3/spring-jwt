package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Term;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
public interface TermRepository extends Repository<Term, Integer>{

    List<Term> findAll();

    Term save(Term c);

    @Modifying
    @Transactional
    @Query(value = "update Term set name = ?1 where id = ?2", nativeQuery = true)
    void update(String name, Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from Term where id = ?1", nativeQuery = true)
    void deleteByTermId(Integer id);
}
