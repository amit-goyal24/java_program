    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    class Employee {
        String name;
        String department;
        double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }

    public class EmployeeList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Employee> employees = new ArrayList<>();

            // Add 5 employees to the list
            employees.add(new Employee("John", "IT", 50000));
            employees.add(new Employee("Alice", "IT", 60000));
            employees.add(new Employee("Bob", "HR", 45000));
            employees.add(new Employee("Charlie", "Finance", 55000));
            employees.add(new Employee("David", "IT", 48000));

            System.out.print("Enter department name: ");
            String departmentName = scanner.nextLine();

            List<Employee> departmentEmployees = getEmployeesByDepartment(employees, departmentName);

            if (departmentEmployees.isEmpty()) {
                System.out.println("No employees found in the specified department.");
            } else {
                System.out.println("Employees in " + departmentName + ": " + departmentEmployees);
            }
        }

        public static List<Employee> getEmployeesByDepartment(List<Employee> employees, String departmentName) {
            List<Employee> departmentEmployees = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getDepartment().equalsIgnoreCase(departmentName)) {
                    departmentEmployees.add(employee);
                }
            }
            return departmentEmployees;
        }
    }