package ams2.linguo.queries;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.interfaces.IExerciseOptionsQueries;
import ams2.linguo.model.Exercise;
import ams2.linguo.model.ExerciseOptions;
import ams2.linguo.util.HibernateUtil;

public class ExerciseOptionsQueries implements IExerciseOptionsQueries {

	@Override
	public ExerciseOptions[] insertExerciseOptions(Exercise exercise, String correctOption, String incorrectOption1, String incorrectOption2) {
		ExerciseOptions[] exerciseOptions = new ExerciseOptions[3];
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			
			exerciseOptions[0] = new ExerciseOptions(exercise, correctOption, true);
			System.out.println(correctOption);
			session.save(exerciseOptions[0]);
			
			exerciseOptions[1] = new ExerciseOptions(exercise, incorrectOption1, false);
			System.out.println(incorrectOption1);
			session.save(exerciseOptions[1]);
			
			exerciseOptions[2] = new ExerciseOptions(exercise, incorrectOption2, false);
			System.out.println(incorrectOption2);
			session.save(exerciseOptions[2]);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exerciseOptions;
	}

}
