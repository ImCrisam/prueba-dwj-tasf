package com.tasf.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasf.entity.Task;

public interface ITaksDao extends JpaRepository<Task, Long> {
	
	Optional<Task> findById(String id);
	Optional<Task> findByName(String name);

}
