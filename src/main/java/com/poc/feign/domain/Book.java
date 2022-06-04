package com.poc.feign.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class Book {
    private String id;
    private String title;
    private String publisher;
    private String image;
    private List<String> writers;
    @JsonProperty("updated_on")
    private LocalDateTime updatedOn;
    @JsonProperty("created_on")
    private LocalDateTime createdOn;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImage() {
        return image;
    }

    public List<String> getWriters() {
        return writers;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
}
