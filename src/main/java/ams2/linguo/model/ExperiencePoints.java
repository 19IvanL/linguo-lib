package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "experience_points")
public class ExperiencePoints implements Serializable {

	private static final long serialVersionUID = 8129984677512013507L;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
	
	@Column(name = "experience")
	private int experience;

	public ExperiencePoints() {}

	public ExperiencePoints(User user, int experience) {
		this.user = user;
		this.experience = experience;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
