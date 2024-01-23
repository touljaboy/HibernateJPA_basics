package pl.touljaboy.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.touljaboy.cruddemo.dao.StudentDAO;
import pl.touljaboy.cruddemo.entity.Student;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new student object...");

		Student temp = new Student("Miroslav","Heheszka","mirko@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(temp);

		System.out.println("Success. Generated id: " + temp.getId());
	}

}
