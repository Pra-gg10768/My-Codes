import java.util.*;

public class UserInterface {
    private static Map<String, Double> employeeMap = new HashMap<>();

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> map) {
        employeeMap = map;
    }

    public void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }

    public static EmployeeAudit findEmployee() {
        return (salary) -> {
            ArrayList<String> result = new ArrayList<>();
            for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
                if (entry.getValue() <= salary) {
                    result.add(entry.getKey());
                }
            }
            return result;
        };
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface();
        
        while (true) {
            System.out.println("\n1.Add Employee Details");
            System.out.println("2.Find Employee Details");
            System.out.println("3.Exit");
            System.out.println("\nEnter the choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter the Employee name");
                    String name = scanner.nextLine();
                    System.out.println("\nEnter the Employee Salary");
                    double salary = scanner.nextDouble();
                    ui.addEmployeeDetails(name, salary);
                    break;
                
                case 2:
                    System.out.println("\nEnter the salary to be searched");
                    double searchSalary = scanner.nextDouble();
                    EmployeeAudit audit = findEmployee();
                    ArrayList<String> employees = audit.fetchEmployeeDetails(searchSalary);
                    
                    if (employees.isEmpty()) {
                        System.out.println("\nNo Employee Found");
                    } else {
                        System.out.println("\nEmployee List");
                        for (String emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("\nLet's complete the session");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("\nInvalid Choice");
            }
        }
    }
}
