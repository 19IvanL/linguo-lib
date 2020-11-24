package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "experience_points")
public class ExperiencePoints {

	@Id
	private Long userId;
	
	@Column(name = "experience")
	private int experience;
}
