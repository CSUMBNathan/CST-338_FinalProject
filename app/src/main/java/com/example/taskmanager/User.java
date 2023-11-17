package com.example.taskmanager;

public class User {
    private String mEvent;
    private String mDate;
    private String mDesctiption;

    public User(String mEvent, String mDate, String mDesctiption) {
        this.mEvent = mEvent;
        this.mDate = mDate;
        this.mDesctiption = mDesctiption;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "mEvent='" + mEvent + '\'' +
                ", mDate='" + mDate + '\'' +
                ", mDesctiption='" + mDesctiption + '\'' +
                '}';
    }

    public String getEvent() {
        return mEvent;
    }

    public void setEvent(String mEvent) {
        this.mEvent = mEvent;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }

    public String getDesctiption() {
        return mDesctiption;
    }

    public void setDesctiption(String mDesctiption) {
        this.mDesctiption = mDesctiption;
    }
}
