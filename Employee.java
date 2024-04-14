abstract class Employee extends Person {
    private String department;
    private double monthlySalary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, email);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + "department=" + department + ", monthlySalary=" + monthlySalary + ", dateHired=" + dateHired + "} " + super.toString();
    }
}
