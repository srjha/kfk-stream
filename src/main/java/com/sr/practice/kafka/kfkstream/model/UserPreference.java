package com.sr.practice.kafka.kfkstream.model;

public class UserPreference {

	private String catagory;
	private String opinion;

	public UserPreference(String catagory, String opinion) {
		super();
		this.catagory = catagory;
		this.opinion = opinion;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

}
