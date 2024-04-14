public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String department, double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, email, department, monthlySalary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + "}" + super.toString();
    }

}
