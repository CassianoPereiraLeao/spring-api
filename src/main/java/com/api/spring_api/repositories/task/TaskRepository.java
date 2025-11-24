package com.api.spring_api.repositories.task;

import com.api.spring_api.domain.entities.task.Task;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {

}