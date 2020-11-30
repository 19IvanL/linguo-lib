package ams2.linguo.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import ams2.linguo.model.*;

public class HibernateUtil {
    
	private static SessionFactory sessionFactory;
    
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				
				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://90.170.204.160:3306/linguo?createDatabaseIfNotExist=true");
                settings.put(Environment.USER, "java_access");
                settings.put(Environment.PASS, "adMIN1234.");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "create");

                configuration.setProperties(settings);
                
                configuration.addAnnotatedClass(Avatar.class);
                configuration.addAnnotatedClass(Coins.class);
                configuration.addAnnotatedClass(Course.class);
                configuration.addAnnotatedClass(Credentials.class);
                configuration.addAnnotatedClass(Exercise.class);
                configuration.addAnnotatedClass(ExerciseOptions.class);
                configuration.addAnnotatedClass(ExerciseType.class);
                configuration.addAnnotatedClass(ExperiencePoints.class);
                configuration.addAnnotatedClass(Friendship.class);
                configuration.addAnnotatedClass(Hearts.class);
                configuration.addAnnotatedClass(Icon.class);
                configuration.addAnnotatedClass(Inventory.class);
                configuration.addAnnotatedClass(League.class);
                configuration.addAnnotatedClass(LeagueDivision.class);
                configuration.addAnnotatedClass(Lesson.class);
                configuration.addAnnotatedClass(LessonCategory.class);
                configuration.addAnnotatedClass(PlayedCourses.class);
                configuration.addAnnotatedClass(PlayedLessons.class);
                configuration.addAnnotatedClass(ShopItem.class);
                configuration.addAnnotatedClass(User.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}

