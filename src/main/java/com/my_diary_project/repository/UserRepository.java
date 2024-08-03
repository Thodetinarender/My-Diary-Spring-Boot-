package com.my_diary_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my_diary_project.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}
