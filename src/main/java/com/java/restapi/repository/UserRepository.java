package com.java.restapi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.restapi.entity.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

}
