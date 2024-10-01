import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rivaldo", "Sanchez", 324, 55600.24));
        employeeList.add(new Employee("Oiler", "Lozano", 545, 10000.243));
        employeeList.add(new Employee("Lidia", "Pizango", 456, 24000.224));
        employeeList.add(new Employee("Wilfredo", "Sanchez", 545, 143500.234));

        File.saveEmployeesSpecialFormat(employeeList);

    }
}
