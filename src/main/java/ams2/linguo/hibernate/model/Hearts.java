package ams2.linguo.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "hearts")
public class Hearts {

	@Id
	private Long userId;

	@Column(name = "lives")
	private int lives;

	@Column(name = "lost_heart")
	private LocalDateTime lostHeart;
	
}
