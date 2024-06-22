package org.example;

public class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
        this.completed = false;
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

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted() {
        return completed;
    }
}
