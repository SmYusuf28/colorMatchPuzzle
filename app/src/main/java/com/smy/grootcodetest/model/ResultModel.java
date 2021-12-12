package com.smy.grootcodetest.model;

public class ResultModel {

    String score;
    String status;

    public ResultModel() {
    }

    public ResultModel(String score, String status) {
        this.score = score;
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
