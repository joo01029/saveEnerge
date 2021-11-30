package com.home.save.service;

import com.home.save.dto.PostTaskTimeDto;
import com.home.save.entity.Task;
import com.home.save.enums.Type;
import com.home.save.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{
	private final TaskRepository taskRepository;
	@Override
	public void postTaskTime(PostTaskTimeDto postTaskTimeDto) {
		Task task = postTaskTimeDtoToTask(postTaskTimeDto);
		taskRepository.save(task);
	}

	@Override
	public List<Task> getAllTaskTime() {
		return taskRepository.findAll();
	}

	@Override
	public List<Task> getAllTaskTimeByType(Type type) {
		return taskRepository.findAllByType(type);
	}

	public Task postTaskTimeDtoToTask(PostTaskTimeDto postTaskTimeDto){
		return Task.builder()
				.realTaskTime(postTaskTimeDto.getRealTaskTime())
				.totalTaskTime(postTaskTimeDto.getTotalTaskTime())
				.date(postTaskTimeDto.getDate())
				.type(postTaskTimeDto.getType())
				.build();
	}
}
