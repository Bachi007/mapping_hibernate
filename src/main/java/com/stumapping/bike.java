package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bike {

	@Id
	private int bikeId;
	private String bikeName;
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	@Override
	public String toString() {
		return "bike [bikeId=" + bikeId + ", bikeName=" + bikeName + "]";
	} 
	
	
}
