package com.tts.subscriberlist2.subscriber;

import org.springframework.data.repository.CrudRepository;

//this describes how info will be entered to the db
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

}