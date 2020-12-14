package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise implements Serializable {

	private static final long serialVersionUID = 4960681784113933636L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    private Lesson lesson;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_type_id", referencedColumnName = "id")
	private ExerciseType exerciseType;
	
	@Column
	private String sentence;

	public Exercise() {}

	public Exercise(Lesson lesson, ExerciseType exerciseType, String sentence) {
		this.lesson = lesson;
		this.exerciseType = exerciseType;
		this.sentence = sentence;
	}
	
	public Exercise(long id, Lesson lesson, ExerciseType exerciseType, String sentence) {
		this.id = id;
		this.lesson = lesson;
		this.exerciseType = exerciseType;
		this.sentence = sentence;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public ExerciseType getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(ExerciseType exerciseType) {
		this.exerciseType = exerciseType;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

}
