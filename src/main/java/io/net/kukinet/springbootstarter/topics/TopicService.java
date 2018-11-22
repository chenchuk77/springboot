package io.net.kukinet.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
// business service is a singleton
public class TopicService {

	
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


}
