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

//			readStudent(studentDAO)

//			queryStudents(studentDAO)
//			queryStudentsByLastName(studentDAO)

//			updateStudent(studentDAO)

//			deleteStudent(studentDAO)
//			deleteAll(studentDAO)
		}
	}

	private fun deleteAll(studentDAO: StudentDAO) {
		println("Deleting all students")
		val numRowsDeleted = studentDAO.deleteAll()
		println("Deleted row count: $numRowsDeleted")
	}

	private fun deleteStudent(studentDAO: StudentDAO) {
		val studentId = 3
		println("Deleting student id: $studentId")
		studentDAO.delete(studentId)
	}

	private fun updateStudent(studentDAO: StudentDAO) {
		val studentId = 1
		println("Get student with id: $studentId")

		val student = studentDAO.findById(studentId)

		if (student != null) {
			println("Updating student ...")
			student.firstName = "John"
			studentDAO.update(student)

			println("Updated student: $student")
		}

	}

	private fun queryStudentsByLastName(studentDAO: StudentDAO) {
		val theStudents = studentDAO.findByLastName("Doe")
		theStudents.forEach {
			println(it)
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

	private fun readStudent(studentDAO: StudentDAO) {
		println("Creating new student object ...")
		val tempStudent = Student(
			firstName = "Daffy",
			lastName = "Duck",
			email = "daffy@example.com"
		)

		println("Saving new student object ...")
		studentDAO.save(tempStudent)


		val id = tempStudent.id
		println("Saved student. Generated id: $id")

		println("Retrieving student with id: $id")
		val myStudent = studentDAO.findById(id)
		println("Found the student: $myStudent")
	}

	private fun queryStudents(studentDAO: StudentDAO) {
		println(studentDAO.findAll())
	}
}

fun main(args: Array<String>) {
	runApplication<CruddemoApplication>(*args)
}
