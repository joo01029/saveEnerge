package com.home.save.dto;

import com.home.save.enums.Type;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PostTaskTimeDto {
	private Long totalTaskTime;
	private Long realTaskTime;
	private Date date;
	private Type type;
}
