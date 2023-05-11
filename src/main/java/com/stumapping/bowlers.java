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
@DiscriminatorValue("bowler")
public class bowlers extends player {

	private String bowlingHand;
	private String bestFigures;
	
}
