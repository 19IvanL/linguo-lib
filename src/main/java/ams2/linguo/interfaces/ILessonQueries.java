package ams2.linguo.interfaces;

import java.util.List;

import ams2.linguo.model.Course;
import ams2.linguo.model.Lesson;
import ams2.linguo.model.LessonCategory;

public interface ILessonQueries {
	public List<Lesson> getLessonsByLessonCategoryId(long lessonCategoryId);
	public Lesson insertLesonByNameAndLessonCategory(String name , LessonCategory lessonCategory);
}
