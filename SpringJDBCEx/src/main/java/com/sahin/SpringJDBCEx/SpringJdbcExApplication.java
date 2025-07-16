package com.sahin.SpringJDBCEx;

import com.sahin.SpringJDBCEx.model.Student;
import com.sahin.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Sahin");
		s.setMarks(56);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);


		List<Student> students = service.getStudents();
		System.out.println(students);


	}

}
