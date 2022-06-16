package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SurveyDB")
public class Student {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int studentId;
			private String firstName;
			private String lastName;
			private String streetAddress;
			private String city;
			private String state;
			private int zip;
			private String telphone;
			private String email;
			private String dos;
			private String[] likedMost;
			private String interested;
			private String recommendation;
			
			public Student() {
				
			}

			public int getStudentId() {
				return studentId;
			}

			public void setStudentId(int studentId) {
				this.studentId = studentId;
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

			public String getStreetAddress() {
				return streetAddress;
			}

			public void setStreetAddress(String streetAddress) {
				this.streetAddress = streetAddress;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public int getZip() {
				return zip;
			}

			public void setZip(int zip) {
				this.zip = zip;
			}

			public String getTelphone() {
				return telphone;
			}

			public void setTelphone(String telphone) {
				this.telphone = telphone;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getDos() {
				return dos;
			}

			public void setDos(String dos) {
				this.dos = dos;
			}

			public String[] getLikedMost() {
				return likedMost;
			}

			public void setLikedMost(String[] likedMost) {
				this.likedMost = likedMost;
			}

			public String getInterested() {
				return interested;
			}

			public void setInterested(String interested) {
				this.interested = interested;
			}

			public String getRecommendation() {
				return recommendation;
			}

			public void setRecommendation(String recommendation) {
				this.recommendation = recommendation;
			}

			public Student(int studentId, String firstName, String lastName, String streetAddress, String city,
					String state, int zip, String telphone, String email, String dos, String[] likedMost,
					String interested, String recommendation) {
				super();
				this.studentId = studentId;
				this.firstName = firstName;
				this.lastName = lastName;
				this.streetAddress = streetAddress;
				this.city = city;
				this.state = state;
				this.zip = zip;
				this.telphone = telphone;
				this.email = email;
				this.dos = dos;
				this.likedMost = likedMost;
				this.interested = interested;
				this.recommendation = recommendation;
			}

			
			
	}

