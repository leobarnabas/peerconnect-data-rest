package org.pcg.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Leo on 11/19/2017.
 */
public class Task {
    @Id
    public String id;
    private String taskName;
    private String taskDescription;
    private Date taskCreatedDate;
    private Date taskDeadlineDate;
    private Date taskUpdatedDate;
    private String taskStatus;
    private String mentorId;
    private String menteeId;
    private String createdBy;
    private String lastUpdatedBy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskCreatedDate() {
        return taskCreatedDate;
    }

    public void setTaskCreatedDate(Date taskCreatedDate) {
        this.taskCreatedDate = taskCreatedDate;
    }

    public Date getTaskDeadlineDate() {
        return taskDeadlineDate;
    }

    public void setTaskDeadlineDate(Date taskDeadlineDate) {
        this.taskDeadlineDate = taskDeadlineDate;
    }

    public Date getTaskUpdatedDate() {
        return taskUpdatedDate;
    }

    public void setTaskUpdatedDate(Date taskUpdatedDate) {
        this.taskUpdatedDate = taskUpdatedDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getMentorId() {
        return mentorId;
    }

    public void setMentorId(String mentorId) {
        this.mentorId = mentorId;
    }

    public String getMenteeId() {
        return menteeId;
    }

    public void setMenteeId(String menteeId) {
        this.menteeId = menteeId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskCreatedDate=" + taskCreatedDate +
                ", taskDeadlineDate=" + taskDeadlineDate +
                ", taskUpdatedDate=" + taskUpdatedDate +
                ", taskStatus='" + taskStatus + '\'' +
                ", mentorId='" + mentorId + '\'' +
                ", menteeId='" + menteeId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                '}';
    }
}
