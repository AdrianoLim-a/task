package com.book.todo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.book.todo.entity.Task;

@RepositoryRestResource(path = "task", collectionResourceRel = "tasks")
public interface TaskRepository extends JpaRepository<Task, Long>, JpaSpecificationExecutor<Task>, QuerydslPredicateExecutor<Task> {

    Page<Task> findByIdIn(@Param("id") List<Long> evenId, Pageable pageable);

    Page<Task> findByNameIn(@Param("name") List<String> names, Pageable pageable);

    @Query(name = "Task.findByName", nativeQuery = true)
    List<Task> findByName(@Param("name") String name);

    Page<Task> findAll(Pageable pageable);

}	