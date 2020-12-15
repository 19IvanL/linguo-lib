package ams2.linguo.interfaces;

import java.util.List;

import ams2.linguo.model.Course;
import ams2.linguo.model.LessonCategory;

public interface ILessonCategoryQueries {
	public List<LessonCategory> getLessonsCategoryByCourseId(long courseId);
	public LessonCategory insertLessonCategoryByTitle(String title, Course course);
}
