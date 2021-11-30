package com.home.save.entity;

import com.home.save.enums.Type;
import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Builder
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class Task {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private Long totalTaskTime;

	@Column(nullable = false)
	private Long realTaskTime;

	@Column(nullable = false)
	private Date date;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Type type;
}
