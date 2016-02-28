package org.sonatype.mavenbook.web;

import org.sonatype.mavenbook.weather.TestService;
import org.sonatype.mavenbook.weather.model.DbConnection;
import org.sonatype.mavenbook.weather.model.TestResponseBean;
import org.sonatype.mavenbook.weather.persist.TestFromXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    public TestService service;

    @Autowired
    public TestFromXml dbConnection;

    @RequestMapping("/test")
    @ResponseBody
    public TestResponseBean getTestResponse() {
        TestResponseBean responseBean = service.getResponse();
        System.out.println("*** TESTING***");
        System.out.println("DB name is " + dbConnection.getMongodbUrl());
        return responseBean;
    }

    @RequestMapping("/set/{code}")
    @ResponseBody
    public TestResponseBean setResponseCode(@PathVariable String code) {
        TestResponseBean responseBean = service.getResponse();
        responseBean.setName(code);
        System.out.println("*** TESTING setter***");
        return responseBean;
    }

}