package com.rana.sprintbootrest.course.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics(){
        final List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).isPresent() ?  topicRepository.findById(id).get(): null;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void update(Topic topic, String id) {

    }

    public void delete(String id) {
        topicRepository.deleteById(id);
    }
}
