import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EmployeePayroll {
    EmployeePayroll(){
        employees = new ArrayList<>();
    }
    public void displayPayroll(){
        for (Employee employee : employees) {
            try{
                    logger.info(employee.getName() + " " + employee.getSurname() + ": " + employee.calculatePay());
            } catch (Exception e){
                logger.warning(e.getMessage());
            }
        }
    }

    private final Logger logger = Logger.getLogger(Employee.class.getName());
    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    private final List<Employee> employees;
}
