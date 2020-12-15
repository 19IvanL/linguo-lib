package ams2.linguo.queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.interfaces.ILessonCategoryQueries;
import ams2.linguo.model.Course;
import ams2.linguo.model.LessonCategory;
import ams2.linguo.util.HibernateUtil;

public class LessonCategoryQueries implements ILessonCategoryQueries {
	
	@Override
	public List<LessonCategory> getLessonsCategoryByCourseId(long courseId) {
		String queryText = "FROM LessonCategory lc WHERE lc.course.id = " + courseId;
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(queryText);
			@SuppressWarnings("unchecked")
			List<LessonCategory> lessons = query.getResultList();
			transaction.commit();
			return (List<LessonCategory>)lessons;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public LessonCategory insertLessonCategoryByTitle(String title, Course course) {
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			LessonCategory lessonCategory = new LessonCategory(title, course);
			session.save(lessonCategory);
			transaction.commit();
			return lessonCategory;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
