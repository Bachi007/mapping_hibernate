package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class location {

	@Id
	private int locationId;
	private String locationName;
	private String locationState;
	
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationState() {
		return locationState;
	}
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	@Override
	public String toString() {
		return "location [locationId=" + locationId + ", locationName=" + locationName + ", locationState="
				+ locationState + "]";
	}
	
	
	
	
}
