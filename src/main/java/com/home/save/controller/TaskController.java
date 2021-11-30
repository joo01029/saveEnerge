package com.home.save.controller;

import com.home.save.dto.PostTaskTimeDto;
import com.home.save.entity.Task;
import com.home.save.enums.Type;
import com.home.save.response.Response;
import com.home.save.service.TaskService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {
	private final TaskService taskService;
	@PostMapping
	@ResponseBody
	public Response addTaskTime(@RequestBody PostTaskTimeDto postTaskTimeDto){
		taskService.postTaskTime(postTaskTimeDto);
		return new Response();
	}

	@GetMapping
	public String getAllTaskTime(Model model){
		List<Task> tasks = taskService.getAllTaskTime();
		model.addAttribute("type","ALL");
		model.addAttribute("tasks", tasks);
		return "index";
	}

	@GetMapping("{type}")
	public String getAllTaskTimeByType(@PathVariable Type type, Model model){
		List<Task> tasks = taskService.getAllTaskTimeByType(type);
		model.addAttribute("type",type.toString());
		model.addAttribute("tasks", tasks);
		return "index";
	}
}
