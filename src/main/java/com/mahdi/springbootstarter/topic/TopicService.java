package com.mahdi.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // this calass is an businessservice
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring", "Spring framework"),
			new Topic("java", "Java", "java des"), 
			new Topic("python", "Python", "python des"))
			);

	public List<Topic> getAllTopic() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		
	}
}
