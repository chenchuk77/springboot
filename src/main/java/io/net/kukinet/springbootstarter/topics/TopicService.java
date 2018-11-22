package io.net.kukinet.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.net.kukinet.springbootstarter.logger.LoggingController;

@Service
// business service is a singleton
public class TopicService {
	
    Logger logger = LoggerFactory.getLogger(TopicService.class);

	private List<Topic> topics;

	public TopicService() {
		topics = new ArrayList<>();
		topics.add(new Topic("1", "Spring", "Spring FW description"));
		topics.add(new Topic("2", "Java", "Java description"));
		topics.add(new Topic("3", "Ruby", "maybe better"));
	}
	
	
	public List getTopics() {
		return topics;
	}


	public Topic getTopic(String id) {
		return topics.stream()
				.filter(topic -> topic.getId().equals(id))
				.findFirst()
				.get();
	}


	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return getTopic(topic.getId());
		
	}


	public Topic updateTopic(Topic topic, String id) {
		Topic t = getTopic(id);
		System.out.println("hello");
        logger.warn("going to update " + id + ".");
        logger.warn(t.toString());
		t.setId(topic.getId());
		t.setName(topic.getName());
		t.setDescription(topic.getDescription());
		return t;
	}


}
