package com.task.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.Priority;
import com.task.entity.Status;
import com.task.entity.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);
    List<Task> findByPriority(Priority priority);
}