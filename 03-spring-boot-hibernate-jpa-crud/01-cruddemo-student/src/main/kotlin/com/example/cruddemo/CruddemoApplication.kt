package com.example.cruddemo

import com.example.cruddemo.dao.StudentDAO
import com.example.cruddemo.entity.Student
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CruddemoApplication {
	@Bean
	fun commandLineRunner(studentDAO: StudentDAO): CommandLineRunner {
		return CommandLineRunner {
//			createStudent(studentDAO)
			createMultipleStudents(studentDAO)
		}
	}

	private fun createMultipleStudents(studentDAO: StudentDAO) {
		println("Creating 3 students object ...")
		val student1 = Student(
			firstName = "John",
			lastName = "Doe",
			email = "john@example.com"
		)

		val student2 = Student(
			firstName = "Mary",
			lastName = "Public",
			email = "mary@example.com"
		)

		val student3 = Student(
			firstName = "Bonita",
			lastName = "Applebum",
			email = "bonita@example.com"
		)

		println("Saving 3 students object ...")
		studentDAO.save(student1)
		studentDAO.save(student2)
		studentDAO.save(student3)
	}

	private fun createStudent(studentDAO: StudentDAO) {
		println("Creating new student object ...")
		val tempStudent = Student(
			firstName = "Paul",
			lastName = "Doe",
			email = "doe@example.com"
		)
		println("Saving new student object ...")
		studentDAO.save(tempStudent)

		println("Saved student, generated id: ${tempStudent.id}")
	}
}

fun main(args: Array<String>) {
	runApplication<CruddemoApplication>(*args)
}
