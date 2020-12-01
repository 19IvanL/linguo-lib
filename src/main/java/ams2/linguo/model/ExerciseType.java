package ams2.linguo.model;

import javax.persistence.*;

@Entity
@Table(name = "exercise_type")
public class ExerciseType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String title;
	
	@Column
	private String objective;

	public ExerciseType() {}
	
	public ExerciseType(String title, String objective) {
		this.title = title;
		this.objective = objective;
	}
	
	public ExerciseType(long id, String title, String objective) {
		this.id = id;
		this.title = title;
		this.objective = objective;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

}
