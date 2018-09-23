package com.springcrudop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrudop.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

	User findOne(int id);

}
