package org.example;

public class Task {
    private String title;
    private String description;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setdescription(String desc) {
        this.description = desc;
    }
}
