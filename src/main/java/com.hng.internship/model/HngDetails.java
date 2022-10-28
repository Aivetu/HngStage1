package com.hng.internship.model;



public class HngDetails {
    private String slackUsername;
    private Boolean backend;
    private Integer age;
    private String bio;

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public void setBackend(Boolean backend) {
        this.backend = backend;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public Boolean getBackend() {
        return backend;
    }

    public Integer getAge() {
        return age;
    }

    public String getBio() {
        return bio;
    }
}
