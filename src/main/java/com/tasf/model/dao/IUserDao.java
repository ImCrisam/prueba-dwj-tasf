package com.tasf.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasf.entity.User;

public interface IUserDao extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
