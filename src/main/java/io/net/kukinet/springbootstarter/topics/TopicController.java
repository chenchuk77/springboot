package io.net.kukinet.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List getTopics() {
		
		List<Topic> topics = new ArrayList<>();
		topics.add(new Topic(1, "Spring", "Spring FW description"));
		topics.add(new Topic(2, "Java", "Java description"));
		topics.add(new Topic(3, "Ruby", "maybe better"));
		

			
		return topics;	
	}
	
}
