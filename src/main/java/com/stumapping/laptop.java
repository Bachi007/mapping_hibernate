package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.*;
@Entity
public class laptop {

	@Id
	private int laptopId;
	private String laptopName;
	@ManyToMany
	private List<manager> man;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public List<manager> getMan() {
		return man;
	}
	public void setMan(List<manager> man) {
		this.man = man;
	}
	@Override
	public String toString() {
		return "laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", man=" + man + "]";
	}
	
}
