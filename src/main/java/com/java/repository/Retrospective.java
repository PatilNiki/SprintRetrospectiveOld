package com.java.repository;

import java.util.Objects;

public class Retrospective {
    private Integer retrospective_id;
    private String retrospective_title;
    private String description;
    private Integer swimlane_id;

    public Retrospective() {
    }

    public Retrospective(Integer retrospective_id, String retrospective_title, String description, Integer swimlane_id) {
        this.retrospective_id = retrospective_id;
        this.retrospective_title = retrospective_title;
        this.description = description;
        this.swimlane_id = swimlane_id;
    }

    public Integer getRetrospective_id() {
        return retrospective_id;
    }

    public void setRetrospective_id(Integer retrospective_id) {
        this.retrospective_id = retrospective_id;
    }

    public String getRetrospective_title() {
        return retrospective_title;
    }

    public void setRetrospective_title(String retrospective_title) {
        this.retrospective_title = retrospective_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Retrospective that = (Retrospective) o;
        return Objects.equals(retrospective_id, that.retrospective_id) && Objects.equals(retrospective_title, that.retrospective_title) && Objects.equals(description, that.description) && Objects.equals(swimlane_id, that.swimlane_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retrospective_id, retrospective_title, description, swimlane_id);
    }

    @Override
    public String toString() {
        return "Retrospective{" +
                "retrospective_id=" + retrospective_id +
                ", retrospective_title='" + retrospective_title + '\'' +
                ", description='" + description + '\'' +
                ", swimlane_id=" + swimlane_id +
                '}';
    }
}
