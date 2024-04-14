import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Student("Stud1", "add1", "123456", "stud1@frcc.edu", "freshman"));
        persons.add(new Student("Stud2", "add2", "123457", "stud2@frcc.edu", "sophomore"));

        persons.add(new Faculty("Prof.John", "add3", "123458", "john@frcc.edu", "Computer Science", 6000, "01/01/2022", "9am-5pm", "junior"));
        persons.add(new Faculty("Prof.Thomas", "add4", "123459", "thomas@frcc.edu", "Mathematics", 7000, "01/01/2020", "9am-5pm", "senior"));

        persons.add(new Staff("Mr.Mathew", "add3", "123458", "mathew@frcc.edu", "Computer Science", 3000, "01/01/2023", "Accountant"));
        persons.add(new Staff("Mr.Varghese", "add4", "123459", "varghese@frcc.edu", "Mathematics", 4000, "01/01/2021", "Librarian"));
        for (Person person : persons) {
            System.out.println(person);
        }
        List<Person> employees = filterEmployees(persons);
        System.out.println("Employees:");
        for (Person employee : employees) {
            System.out.println(employee);
        }
    }

    public static List<Person> filterEmployees(List<Person> persons) {
        List<Person> employees = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add(person);
            }
        }
        return employees;
    }
}
