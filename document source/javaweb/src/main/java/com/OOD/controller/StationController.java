package com.OOD.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import com.OOD.pojo.Feedback;
import com.OOD.pojo.Location;
import com.OOD.pojo.Station;
import com.OOD.service.impl.FeedbackMapperServiceImpl;
import com.OOD.service.impl.LocationMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.OOD.service.impl.StationMapperServiceImpl;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/station")
public class StationController {

    @Autowired
    StationMapperServiceImpl service_station;

    @Autowired
    LocationMapperServiceImpl service_location;

    @Autowired
    FeedbackMapperServiceImpl service_feedback;

    @RequestMapping(value = "/selectstation")
    public ModelAndView selectStation() {
        Station station = service_station.selectStation(1);
        ModelAndView mav = new ModelAndView();
        Location location = service_location.selectLocation(1);
        mav.addObject("station", station);
        mav.addObject("location", location);
        mav.setViewName("/WEB-INF/webcontent/station.jsp");
        return mav;
    }

    @RequestMapping(value="/updateFeedback", method= RequestMethod.POST)
    public String updateFeedback(String name_user, String email,String phone, String message) throws IOException {
        Feedback feedback = new Feedback(name_user, email, phone, message);
        service_feedback.addFeedback(feedback);
        return "/station/selectstation";
    }
}

