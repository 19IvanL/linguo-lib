package ams2.linguo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ExerciseOptions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long exerciseId;
	
	@Column
	private String word;
	
	@Column
	private boolean correct;
	
	@Column
	private int position;


}
