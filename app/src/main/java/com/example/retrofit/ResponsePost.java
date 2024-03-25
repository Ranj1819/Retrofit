package com.example.retrofit;

public class ResponsePost {
    String name, job, id, createdAt;

//    public ResponsePost(String name, String job, String id, String createdAt) {
//        this.name = name;
//        this.job = job;
//        this.id = id;
//        this.createdAt = createdAt;
//    }


    @Override
    public String toString() {
        return "ResponsePost{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
