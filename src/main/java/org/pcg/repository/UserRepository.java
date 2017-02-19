
package org.pcg.repository;

import java.util.List;

import org.pcg.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByLastName(@Param("name") String name);
	List<User> findByEmailId(@Param("emailId") String emailId);
}
