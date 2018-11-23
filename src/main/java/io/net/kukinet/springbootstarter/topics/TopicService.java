package io.net.kukinet.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.net.kukinet.springbootstarter.logger.LoggingController;

@Service
// business service is a singleton
public class TopicService {
	
    Logger logger = LoggerFactory.getLogger(TopicService.class);

    @Autowired
    private TopicRepository repository;
    
	private List<Topic> topics;

	public TopicService() {
		topics = new ArrayList<>();
		topics.add(new Topic("1", "Spring", "Spring FW description"));
		topics.add(new Topic("2", "Java", "Java description"));
		topics.add(new Topic("3", "Ruby", "maybe better"));
	}
	
	
	public List getTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(t -> topics.add(t));
		return topics;
	}


	public Topic getTopic(String id) {
		return repository.findById(id).get();
	}


	public Topic addTopic(Topic topic) {
		repository.save(topic);
		return topic;
	}


	public Topic updateTopic(Topic topic, String id) {
		repository.save(topic);
		return topic;

		
		//		Topic t = getTopic(id);
//		System.out.println("hello");
//        logger.warn("going to update " + id + ".");
//        logger.warn(t.toString());
//		t.setId(topic.getId());
//		t.setName(topic.getName());
//		t.setDescription(topic.getDescription());
//		return t;
	}


	public void deleteTopic(String id) {
		//Topic t = getTopic(id);
		//topics.remove(t);
		//topics.removeIf(t -> t.getId().equals(id));
		
		repository.deleteById(id);
	}


}
