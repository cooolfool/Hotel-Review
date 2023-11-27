package com.project.user.service.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="micro_users")
public class User {		
	@Id
	@Column(name="user_Id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	
	@Column(name = "name")
	private  String name;
	
	@Column(name="email_Id")
	private String emailId;
	
	@Column(name="about")
	private String about;
	
	@Transient
	private List<Rating> ratings;

	public User(String userId, String name, String emailId, String about, List<Rating> ratings) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.about = about;
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public User(String userId, String name, String emailId, String about) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.about = about;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", about=" + about + ", ratings="
				+ ratings + "]";
	}
	
	
	
}
