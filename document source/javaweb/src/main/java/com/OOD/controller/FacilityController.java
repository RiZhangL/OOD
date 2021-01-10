package com.OOD.controller;

import com.OOD.pojo.Facility;
import com.OOD.pojo.Feedback;
import com.OOD.service.impl.FacilityMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/station")
public class FacilityController {

    @Autowired
    FacilityMapperServiceImpl service;

    @RequestMapping(value = "/selectfacility")
    public ModelAndView selectFacility() {
        List<Facility> facilities = service.selectAllFacility();
        ModelAndView mav = new ModelAndView();
        mav.addObject("facilities", facilities);
        mav.setViewName("/WEB-INF/webcontent/facility.jsp");
        return mav;
    }
}
