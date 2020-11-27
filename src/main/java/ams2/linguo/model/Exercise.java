package ams2.linguo.model;

import javax.persistence.*;

public class Exercise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long lessonId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long exerciseTypeId;
	
	@Column
	private String sentence;


}
