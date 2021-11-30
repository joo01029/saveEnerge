package com.home.save.service;

import com.home.save.dto.PostTaskTimeDto;
import com.home.save.entity.Task;
import com.home.save.enums.Type;

import java.util.List;

public interface TaskService {
	void postTaskTime(PostTaskTimeDto postTaskTimeDto);
	List<Task> getAllTaskTime();
	List<Task> getAllTaskTimeByType(Type type);
}
