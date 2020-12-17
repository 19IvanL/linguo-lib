package ams2.linguo.interfaces;

import ams2.linguo.model.Exercise;
import ams2.linguo.model.ExerciseOptions;

public interface IExerciseOptionsQueries {
	public ExerciseOptions[] insertExerciseOptions(Exercise exercise, String correctOption, String incorrectOption1, String incorrectOption2);
}
