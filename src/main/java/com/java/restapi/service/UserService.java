package com.java.restapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;

import com.java.restapi.entity.User;
import com.java.restapi.repository.UserRepository;


public interface UserService {

	User getById(Long id);

	User getOne(Long id);

	void delete(User entity);

	void deleteById(Long id);

	long count();

	List<User> findAll(Sort sort);

	List<User> findAll();

	<S extends User> S save(S entity);
	
}
