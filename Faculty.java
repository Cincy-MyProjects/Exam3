public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String department, double monthlySalary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + "} " + super.toString();
    }
}
