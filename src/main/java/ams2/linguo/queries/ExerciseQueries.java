package ams2.linguo.queries;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.interfaces.IExerciseQueries;
import ams2.linguo.model.Exercise;
import ams2.linguo.model.ExerciseType;
import ams2.linguo.model.Lesson;
import ams2.linguo.util.HibernateUtil;

public class ExerciseQueries implements IExerciseQueries {

	@Override
	public Exercise insertExercise(Lesson lesson, ExerciseType exerciseType, String sentence) {
		Exercise exercise = null;
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			exercise = new Exercise(lesson, exerciseType, sentence);
			session.saveOrUpdate(exerciseType);
			session.save(exercise);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exercise;
	}
	
}
