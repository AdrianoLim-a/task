package com.book.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	@NotNull(message = "{NotNull.Task.name}")
	private String name;
	@NotNull(message = "{NotNull.Task.description}")
	private String description;
	
	

}