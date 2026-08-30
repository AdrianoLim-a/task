package com.book.todo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import jakarta.persistence.Id;


@Entity
@Data
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	@NotNull(message = "{NotNull.Task.name}")
	private String name;
	
	@NotNull(message = "{NotNull.Task.description}")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}