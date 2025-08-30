public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    public int getId() {
        return employeeId;
    }

    public void setId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return employeeName;
    }

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNet() {
        return netSalary;
    }

    public void setNet(double netSalary) {
        this.netSalary = netSalary;
    }

    public void calculateNet(int percent) {
        double pf = salary * (double) percent / 100.0;
        netSalary = salary - pf;
        System.out.println("Net Salary after deduction" + netSalary);
    }
    
}

class EmployeeSalary {
    public static void main(String[] args) {
        Employee x = new Employee();
        x.setId(1234);
        x.setName("XYZ");
        x.setSalary(20390930.22);
        x.setNet(244783748.22);
        
        System.out.println("Id: " + x.getId());
        System.out.println("Name: " + x.getName());
        System.out.println("Salary: " + x.getSalary());
        System.out.println("NetSalary: " + x.getNet());
        
        x.calculateNet(20);
    }
}