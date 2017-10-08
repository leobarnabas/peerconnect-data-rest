
package org.pcg.repository;

import org.pcg.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByLastName(@Param("name") String name);

    List<User> findByEmailId(@Param("emailId") String emailId);

    List<User> findByAreaInAndUserType(@Param("area") List<String> areas, @Param("userType ") String userType);

    User insert(User user);

    List<User> findAll();
}
