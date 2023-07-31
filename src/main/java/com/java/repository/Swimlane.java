package com.java.repository;

import java.util.Objects;

public class Swimlane {
    private Integer swimlane_id;
    private String swimlane_title;

    public Swimlane() {
    }

    public Swimlane(Integer swimlane_id, String swimlane_title) {
        this.swimlane_id = swimlane_id;
        this.swimlane_title = swimlane_title;
    }

    public Integer getSwimlane_id() {
        return swimlane_id;
    }

    public void setSwimlane_id(Integer swimlane_id) {
        this.swimlane_id = swimlane_id;
    }

    public String getSwimlane_title() {
        return swimlane_title;
    }

    public void setSwimlane_title(String swimlane_title) {
        this.swimlane_title = swimlane_title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swimlane swimlane = (Swimlane) o;
        return Objects.equals(swimlane_id, swimlane.swimlane_id) && Objects.equals(swimlane_title, swimlane.swimlane_title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(swimlane_id, swimlane_title);
    }

    @Override
    public String toString() {
        return "Swimlane{" +
                "swimlane_id=" + swimlane_id +
                ", swimlane_title='" + swimlane_title + '\'' +
                '}';
    }
}
