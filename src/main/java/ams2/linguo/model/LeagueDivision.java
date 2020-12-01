package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "league_division")
public class LeagueDivision implements Serializable {

	private static final long serialVersionUID = 1639733331088910789L;

	@Id
	private long id;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "league_id", referencedColumnName = "id")
    private League league;
	
	@Column(name = "experience")
	private int experience;

	public LeagueDivision() {}

	public LeagueDivision(long id, User user, League league, int experience) {
		this.id = id;
		this.user = user;
		this.league = league;
		this.experience = experience;
	}

}
