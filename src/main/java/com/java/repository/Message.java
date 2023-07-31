package com.java.repository;

import java.util.Objects;

public class Message {
    private Integer message_id;
    private String message;
    private Integer user_id;
    private Integer retrospective_id;
    private Integer swimlane_id;

    public Message() {
    }

    public Message(Integer message_id, String message, Integer user_id, Integer retrospective_id, Integer swimlane_id) {
        this.message_id = message_id;
        this.message = message;
        this.user_id = user_id;
        this.retrospective_id = retrospective_id;
        this.swimlane_id = swimlane_id;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRetrospective_id() {
        return retrospective_id;
    }

    public void setRetrospective_id(Integer retrospective_id) {
        this.retrospective_id = retrospective_id;
    }

    public Integer getSwimlane_id() {
        return swimlane_id;
    }

    public void setSwimlane_id(Integer swimlane_id) {
        this.swimlane_id = swimlane_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(message_id, message1.message_id) && Objects.equals(message, message1.message) && Objects.equals(user_id, message1.user_id) && Objects.equals(retrospective_id, message1.retrospective_id) && Objects.equals(swimlane_id, message1.swimlane_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_id, message, user_id, retrospective_id, swimlane_id);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", message='" + message + '\'' +
                ", user_id=" + user_id +
                ", retrospective_id=" + retrospective_id +
                ", swimlane_id=" + swimlane_id +
                '}';
    }
}
