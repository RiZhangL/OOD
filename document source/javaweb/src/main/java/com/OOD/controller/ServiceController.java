package com.OOD.controller;

import com.OOD.pojo.Service;
import com.OOD.service.impl.ServiceMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/station")
public class ServiceController {

    @Autowired
    ServiceMapperServiceImpl service;

    @RequestMapping(value = "/selectservice")
    public ModelAndView selectStation() {
        List<Service> services = service.selectAllService();
        ModelAndView mav = new ModelAndView();
        mav.addObject("services", services);
        mav.setViewName("/WEB-INF/webcontent/service.jsp");
        return mav;
    }
}
