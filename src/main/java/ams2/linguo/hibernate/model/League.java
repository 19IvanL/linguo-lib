package ams2.linguo.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.*;

public class League {

	@Id
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "start_date")
	private LocalDateTime startDate;
	
	@Column(name = "end_date")
	private LocalDateTime endDate;
	
}
