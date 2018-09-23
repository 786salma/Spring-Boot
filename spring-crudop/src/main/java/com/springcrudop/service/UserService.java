package com.springcrudop.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcrudop.entity.User;
import com.springcrudop.repo.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User save(User user) {
		return repo.save(user);
	}
	
	public User Update(User user) {
		return repo.save(user);
	}
	
	public User findOne(int id) {
		return repo.findOne(id);
	}
	
	public boolean delete(User id) {
		repo.delete(id);
		return true;
	}
}
