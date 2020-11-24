package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "league_division")
public class LeagueDivision {

	@Id
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "league_id")
	private Long leagueId;
	
	@Column(name = "experience")
	private String experience;
	
}
