package org.pcg.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class User {


    @Id
    public String id;


    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String emailId;
    private String password;
    private String gender;
    private String area;
    private String field;
    private String meetingPreference;
    private String userType;
    private Mentor mentor;
    private Mentee mentee;

    public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

   public String getUserType() {return userType;}

    public void setUserType(String userType) {
        this.userType = userType;
    }



    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMeetingPreference() {
        return meetingPreference;
    }

    public void setMeetingPreference(String meetingPreference) {
        this.meetingPreference = meetingPreference;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", area='" + area + '\'' +
                ", field='" + field + '\'' +
                ", meetingPreference='" + meetingPreference + '\'' +
                ", userType=" + userType +
                ", mentor=" + mentor +
                ", mentee=" + mentee +
                '}';
    }
}
