package exercises.oop.test;
import exercises.oop.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.nome = "Kaio";
        employee.idade = 22;
        employee.salario = new double[]{1200, 4100, 3000};

        employee.imprime();
        employee.media();


    }
}
