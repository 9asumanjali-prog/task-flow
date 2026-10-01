package com.Taskflow.task_flow.repository;
import com.Taskflow.task_flow.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

