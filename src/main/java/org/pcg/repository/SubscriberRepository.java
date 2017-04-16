package org.pcg.repository;

import org.pcg.model.Subscriber;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Leo on 4/16/2017.
 */
public interface SubscriberRepository extends MongoRepository<Subscriber, String> {
}
