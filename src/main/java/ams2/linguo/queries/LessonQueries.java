package ams2.linguo.queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.interfaces.ILessonQueries;
import ams2.linguo.model.Course;
import ams2.linguo.model.Lesson;
import ams2.linguo.model.LessonCategory;
import ams2.linguo.util.HibernateUtil;

public class LessonQueries implements ILessonQueries {

	@Override
	public List<Lesson> getLessonsByLessonCategoryId(long lessonCategoryId) {
		String queryText = "FROM Lesson l WHERE l.lessonCategory.id = " + lessonCategoryId;
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(queryText);
			@SuppressWarnings("unchecked")
			List<Lesson> lessons = query.getResultList();
			transaction.commit();
			return (List<Lesson>)lessons;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Lesson insertLesonByNameAndLessonCategory(String name, LessonCategory lessonCategory) {
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			Lesson lesson= new Lesson(name, lessonCategory);
			session.save(lesson);
			transaction.commit();
			return lesson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
