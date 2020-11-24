package ams2.linguo.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "friend")
public class Friend {

	@Id
	private Long followerId;
	
	@Column(name = "followed_id")
	private Long followedId;
	
	@Column(name = "friendship_date")
	private LocalDateTime friendshipDate;
	
}
