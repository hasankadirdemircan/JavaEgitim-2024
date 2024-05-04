package com.example.manytomany;

import com.example.manytomany.model.Course;
import com.example.manytomany.model.Student;
import com.example.manytomany.repository.CourseRepository;
import com.example.manytomany.repository.StudentRepository;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		courseRepository.findById(2L);
	}

	private void findStudentsCourse() {
		Optional<Student> studentOptional = studentRepository.findById(2L);
		studentOptional.get().getCourses();
		studentOptional.ifPresent(System.out::println);
	}

	private void insert1() {
		Set<Course> courseSet = new HashSet<>();
		Course course = new Course();
		course.setTitle("fizik");
		Course course2 = new Course();
		course2.setTitle("kimya");
		Course course3 = new Course();
		course3.setTitle("matematik");
		courseSet.add(course);
		courseSet.add(course2);
		courseSet.add(course3);

		Student student = new Student();
		student.setName("hasan");
		student.setCourses(courseSet);

		studentRepository.save(student);
	}

	private void insert2() {
		Set<Course> courseSet = new HashSet<>();
		Course course = new Course();
		course.setId(2L);
		Course course2 = new Course();
		course2.setId(3L);
		Course course3 = new Course();
		course3.setId(4L);
		courseSet.add(course);
		courseSet.add(course2);
		courseSet.add(course3);

		Student student = new Student();
		student.setName("galip");
		student.setCourses(courseSet);

		studentRepository.save(student);
	}
}
