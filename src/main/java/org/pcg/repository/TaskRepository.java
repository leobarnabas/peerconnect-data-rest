
package org.pcg.repository;

import org.pcg.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByMentorId(@Param("mentorId") String mentorId);

    List<Task> findByMenteeId(@Param("menteeId") String menteeId);

    Task insert(Task task);

    Task save(Task task);
}
