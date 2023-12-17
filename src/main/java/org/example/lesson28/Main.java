package org.example;

import org.example.DAO.CourseDao;
import org.example.DAO.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateSession.Configuration()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            StudentDao studentDao = new StudentDao(session);
            CourseDao courseDao = new CourseDao(session);

            Course course = courseDao.findById(2);
            studentDao.findById(2).addCourse(course);

            Student student = studentDao.findById(3);
            courseDao.findById(2).addStudent(student);

            // [Student(id=3, name=Anton, email=anton@gmail.com)]
            System.out.println(courseDao.findById(2).getStudents());
            // [Course(courseId=4, name=Chemistry), Course(courseId=2, name=Biology)]
            System.out.println(studentDao.findById(2).getCourses());
            // [Course(courseId=2, name=Biology)]
            System.out.println(studentDao.findById(3).getCourses());

            session.getTransaction().commit();

        }
    }
}
