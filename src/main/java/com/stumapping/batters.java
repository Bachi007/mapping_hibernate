package com.stumapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("batsman")
public class batters extends player{

	private String battingHand;
	private int highestScore;
	
		
}
