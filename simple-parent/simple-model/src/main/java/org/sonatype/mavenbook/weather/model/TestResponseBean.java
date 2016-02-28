package org.sonatype.mavenbook.weather.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.springframework.stereotype.Component;

@Component
@XStreamAlias("book")
public class TestResponseBean {

    @XStreamAlias("name")
    private String name;

    public TestResponseBean() {
        name = "Ash is testing this";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

}
