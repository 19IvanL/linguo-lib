package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "league")
public class League implements Serializable {

	private static final long serialVersionUID = -8408999285478278525L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "start_date")
	private LocalDateTime startDate;
	
	@Column(name = "end_date")
	private LocalDateTime endDate;

	public League() {}

	public League(String title, LocalDateTime startDate, LocalDateTime endDate) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public League(long id, String title, LocalDateTime startDate, LocalDateTime endDate) {
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

}
