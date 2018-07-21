package com.example.springboot_demo.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics=new ArrayList<>( Arrays.asList(
            new Topic("java", "java language", "java language description"),
            new Topic("c", "c language", "c language description"),
            new Topic("c++", "c++ language", "c++ language description"),
            new Topic("javascript", "javascript language", "javascript language description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(e -> e.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id){
        topics.removeIf(e-> e.getId().equals(id));
        topics.add(topic);
    }

    public void deleteTopic(String id){
        topics.removeIf(e-> e.getId().equals(id));
    }
}
