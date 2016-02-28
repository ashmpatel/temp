package org.sonatype.mavenbook.weather.model;

import org.springframework.stereotype.Component;

@Component
public class DbConnection {

    public DbConnection() {
    }

    private String mongodbUrl;

    public DbConnection(String mongodbUrl, String defaultDb) {
        this.mongodbUrl = mongodbUrl;
        this.defaultDb = defaultDb;
    }

    private String defaultDb;

    public String getDefaultDb() {
        return defaultDb;
    }

    public void setDefaultDb(String defaultDb) {
        this.defaultDb = defaultDb;
    }

    public String getMongodbUrl() {
        return mongodbUrl;
    }

    public void setMongodbUrl(String mongodbUrl) {
        this.mongodbUrl = mongodbUrl;
    }


}