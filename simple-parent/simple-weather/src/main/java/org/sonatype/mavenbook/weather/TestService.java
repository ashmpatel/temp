package org.sonatype.mavenbook.weather;

import org.sonatype.mavenbook.weather.model.TestResponseBean;
import org.sonatype.mavenbook.weather.persist.TestFromXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestFromXml temp2;

    public TestResponseBean getResponse() {
        return new TestResponseBean();
    }

    public TestResponseBean setResponse(String code) {


        TestResponseBean temp = new TestResponseBean();
        temp.setName(code);
        System.out.println("Mongo url is : " + temp2.getMongodbUrl());
        return temp;
    }
}