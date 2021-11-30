package com.home.save.repository;

import com.home.save.entity.Task;
import com.home.save.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findAllByType(Type type);
}
