package com.example.firebaserealtimedatabase24112020;

public class Message {
    private String text;
    private long time;

    public Message(String text, long time) {
        this.text = text;
        this.time = time;
    }

    public Message() {
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
