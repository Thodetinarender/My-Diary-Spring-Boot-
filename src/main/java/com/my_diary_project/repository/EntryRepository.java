package com.my_diary_project.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.my_diary_project.entity.Entry;


public interface EntryRepository extends JpaRepository<Entry, Long> {

	@Query(value = "SELECT * FROM entrys WHERE userid = :id", nativeQuery = true)
    List<Entry> findByUserid(@Param("id") long id);

}
