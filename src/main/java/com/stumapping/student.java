package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class student {

	@Id
	private int stId;
	private String stName;
	private String stClass;
	
	@OneToOne
	private bike bike;

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStClass() {
		return stClass;
	}

	public void setStClass(String stClass) {
		this.stClass = stClass;
	}

	public bike getBike() {
		return bike;
	}

	public void setBike(bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "student [stId=" + stId + ", stName=" + stName + ", stClass=" + stClass + ", bike=" + bike + "]";
	}


	
	
}
