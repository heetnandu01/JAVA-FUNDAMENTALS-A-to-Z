package challenge79;

public class test {
    public static void main(String[] args) {
        Employee emp = new Employee("Heet", 20, 100000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
