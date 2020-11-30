package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "exercise_options")
public class ExerciseOptions implements Serializable {

	private static final long serialVersionUID = -4453135099308640596L;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    private Exercise exercise;
	
	@Id
	@Column
	private String word;
	
	@Column
	private boolean correct;
	
	@Column
	private int position;

	public ExerciseOptions() {}
	
	public ExerciseOptions(Exercise exercise, String word) {
		this.exercise = exercise;
		this.word = word;
	}

	public ExerciseOptions(Exercise exercise, String word, boolean correct) {
		this.exercise = exercise;
		this.word = word;
		this.correct = correct;
	}

	public ExerciseOptions(Exercise exercise, String word, boolean correct, int position) {
		this.exercise = exercise;
		this.word = word;
		this.correct = correct;
		this.position = position;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
