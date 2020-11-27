package ams2.linguo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PlayedCourses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long userId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long courseId;
	
	@Column
	private String status;


}
