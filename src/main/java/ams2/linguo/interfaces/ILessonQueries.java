package ams2.linguo.interfaces;

import java.util.List;

import ams2.linguo.model.Lesson;

public interface ILessonQueries {
	public List<Lesson> getLessonsByCourseId(long courseId);
}
