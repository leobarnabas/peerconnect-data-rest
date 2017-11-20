package org.pcg.model;

import org.springframework.data.annotation.Id;


public class Mentee {
    @Id
    private String userId;
    private String school;
    private Integer graduationYear;
    private String program;
    private Double cgpa;
    private String essay;
    private String resume;
    private String currentMentorId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCurrentMentorId() {
        return currentMentorId;
    }

    public void setCurrentMentorId(String currentMentorId) {
        this.currentMentorId = currentMentorId;
    }


    @Override
    public String toString() {
        return "Mentee{" +
                "userId='" + userId + '\'' +
                ", school='" + school + '\'' +
                ", graduationYear=" + graduationYear +
                ", program='" + program + '\'' +
                ", cgpa=" + cgpa +
                ", essay='" + essay + '\'' +
                ", resume='" + resume + '\'' +
                ", currentMentorId='" + currentMentorId + '\'' +
                '}';
    }
}
