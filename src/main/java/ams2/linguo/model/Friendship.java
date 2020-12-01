package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "friendship")
public class Friendship implements Serializable {

	private static final long serialVersionUID = -4426824883866079814L;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "follower_id", referencedColumnName = "id")
    private User user1;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "followed_id", referencedColumnName = "id")
    private User user2;
	
	@Column(name = "date")
	private LocalDateTime date;

	public Friendship() {}

	public Friendship(User user1, User user2, LocalDateTime date) {
		this.user1 = user1;
		this.user2 = user2;
		this.date = date;
	}	

}
