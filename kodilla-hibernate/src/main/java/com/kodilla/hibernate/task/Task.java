package com.kodilla.hibernate.task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tasks")
public final class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public Task() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "id", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "created")
    public Date getCreated() {
        return created;
    }

    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}