package com.OOD.service.impl;

import com.OOD.mapper.FeedbackMapper;
import com.OOD.pojo.Feedback;
import com.OOD.service.FeedbackMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackMapperServiceImpl implements FeedbackMapperService {

    @Autowired
    FeedbackMapper mapper;

    public void addFeedback(Feedback feedback) {
        // TODO Auto-generated method stub
        mapper.addFeedback(feedback);
    }
}
