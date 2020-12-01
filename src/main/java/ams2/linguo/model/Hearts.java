package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "hearts")
public class Hearts implements Serializable {

	private static final long serialVersionUID = -6712090737810438347L;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

	@Column(name = "lives")
	private int lives;

	@Column(name = "lost_heart")
	private LocalDateTime lostHeart;

	public Hearts() {}

	public Hearts(User user, int lives, LocalDateTime lostHeart) {
		this.user = user;
		this.lives = lives;
		this.lostHeart = lostHeart;
	}

}
