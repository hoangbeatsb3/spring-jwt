package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends org.springframework.data.repository.Repository<Class, Integer> {

    List<Class> findAll();

}
