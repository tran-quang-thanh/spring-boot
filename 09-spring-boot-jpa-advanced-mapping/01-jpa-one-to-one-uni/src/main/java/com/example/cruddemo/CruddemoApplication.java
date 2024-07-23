package com.example.cruddemo;

import com.example.cruddemo.dao.AppDAO;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(@Autowired AppDAO appDAO) {
		return runner -> {
//			createInstructor(appDAO);
//			findInstructor(appDAO);
			deleteInstructor(appDAO);
		};
	}

	private void deleteInstructor(AppDAO appDAO) {
		int id = 1;
		System.out.println("Deleting instructor id: " + id);
		appDAO.deleteInstructorById(id);
		System.out.println("Done");
	}

	private void findInstructor(AppDAO appDAO) {
		int id = 1;
		System.out.println("Finding instructor id: " + id);

		Instructor instructor = appDAO.findInstructorById(id);
		System.out.println("Instructor: " + instructor);
		System.out.println("Instructor detail only: " + instructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {
//		Instructor instructor = new Instructor("Chad", "Darby", "darby@example.com");
//		InstructorDetail instructorDetail = new InstructorDetail(
//				"http://www.luv2code.com/youtube",
//				"Luv 2 code"
//		);
//		instructor.setInstructorDetail(instructorDetail);

		Instructor instructor = new Instructor("Madhu", "Patel", "madhu@example.com");
		InstructorDetail instructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube",
				"Guitar"
		);
		instructor.setInstructorDetail(instructorDetail);

		// save the instructor
		// this will also save instructor detail because of Cascade.ALL
		System.out.println("Saving instructor: "+ instructor);
		appDAO.save(instructor);
	}
}
