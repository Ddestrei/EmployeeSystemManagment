package MainBackendPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class,args);
    }
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Mark","comcumber","Elo123"));
        employeeRepository.save(new Employee("elo","tomek","Elo123234"));
    }
}
