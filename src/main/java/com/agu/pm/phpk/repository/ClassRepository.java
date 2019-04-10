package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Class;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ClassRepository extends org.springframework.data.repository.Repository<Class, Integer> {

    List<Class> findAll();

    Class save(Class c);

    @Modifying
    @Transactional
    @Query(value = "update Class set name = ?1 where id = ?2", nativeQuery = true)
    void update(String name, Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from Class where id = ?1", nativeQuery = true)
    void deleteByClassId(Integer id);

}
