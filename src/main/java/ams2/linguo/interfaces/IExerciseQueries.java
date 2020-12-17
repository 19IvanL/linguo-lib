package ams2.linguo.interfaces;

import ams2.linguo.model.Exercise;
import ams2.linguo.model.ExerciseType;
import ams2.linguo.model.Lesson;

public interface IExerciseQueries {
	public Exercise insertExercise(Lesson lesson, ExerciseType exerciseType, String sentence);
}
