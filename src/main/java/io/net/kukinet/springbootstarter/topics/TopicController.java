package io.net.kukinet.springbootstarter.topics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
    Logger logger = LoggerFactory.getLogger(TopicController.class);

	@Autowired
	// marks as need dependency injection
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List getTopics() {
        logger.warn("getTopics called.");

		return topicService.getTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/topics")
	public Topic addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{id}")
	public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		
        logger.warn("updateTopic called with id: " + id + ".");
//        logger.warn(t.toString());

        
		return topicService.updateTopic(topic, id);
	}
}
