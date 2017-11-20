package org.pcg.model;

import org.springframework.data.annotation.Id;


public class Mentor {
    @Id
    private String userId;
    private String highestLvlEducation;
    private String school;
    private Integer graduationYear;
    private String organization;
    private String role;
    private String duration;
    private String contribution;
    private String resume;

    private String currentMenteeId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHighestLvlEducation() {
        return highestLvlEducation;
    }

    public void setHighestLvlEducation(String highestLvlEducation) {
        this.highestLvlEducation = highestLvlEducation;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCurrentMenteeId() {
        return currentMenteeId;
    }

    public void setCurrentMenteeId(String currentMenteeId) {
        this.currentMenteeId = currentMenteeId;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "userId='" + userId + '\'' +
                ", highestLvlEducation='" + highestLvlEducation + '\'' +
                ", school='" + school + '\'' +
                ", graduationYear=" + graduationYear +
                ", organization='" + organization + '\'' +
                ", role='" + role + '\'' +
                ", duration='" + duration + '\'' +
                ", contribution='" + contribution + '\'' +
                ", resume='" + resume + '\'' +
                ", currentMenteeId='" + currentMenteeId + '\'' +
                '}';
    }
}
