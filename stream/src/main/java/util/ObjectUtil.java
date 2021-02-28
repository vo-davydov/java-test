package util;

import java.util.ArrayList;
import java.util.List;
import model.AbstractModel;
import model.Employee;

public class ObjectUtil<T extends AbstractModel> {

  public List<Employee> getEmployees() {
    List<Employee> result = new ArrayList<>();
    result.add(new Employee("Jhon", "physician assistant", 35L, 20000D));
    result.add(new Employee("Liam", "software developer", 45L, 10000D));
    result.add(new Employee("Olivia", "software developer", 25L, 40000D));
    result.add(new Employee("Emma", "software developer", 34L, 50000D));
    result.add(new Employee("Noah", "software developer", 36L, 20000D));
    result.add(new Employee("James", "software developer", 38L, 10000D));
    result.add(new Employee("Oliver", "physician assistant", 24L, 40000D));
    result.add(new Employee("William", "nurse", 24L, 67000D));
    result.add(new Employee("Benjamin", "nurse", 35L, 78000D));
    result.add(new Employee("Isabella", "nurse", 24L, 66000D));
    result.add(new Employee("Sophia", "nurse", 55L, 45000D));
    result.add(new Employee("Charlotte", "nurse", 24L, 89000D));
    result.add(new Employee("Mia", "nurse", 55L, 90000D));
    result.add(new Employee("Harper", "statistician", 35L, 90000D));
    result.add(new Employee("Evelyn", "statistician", 35L, 10000D));
    result.add(new Employee("Ethan", "statistician", 35L, 90000D));
    result.add(new Employee("Lucas", "statistician", 35L, 10000D));
    result.add(new Employee("Mason", "data scientist", 55L, 10000D));
    result.add(new Employee("James", "data scientist", 34L, 10000D));
    result.add(new Employee("Jhon", "data scientist", 35L, 90000D));
    result.add(new Employee("Noah", "data scientist", 24L, 10000D));
    result.add(new Employee("Emma", "data scientist", 35L, 10000D));
    result.add(new Employee("Jhon", "data scientist", 24L, 10000D));
    result.add(new Employee("Noah", "data scientist", 40L, 90000D));
    result.add(new Employee("James", "data scientist", 56L, 90000D));
    result.add(new Employee("Emma", "dentist", 36L, 90000D));
    result.add(new Employee("Emma", "dentist", 75L, 50000D));
    result.add(new Employee("James", "dentist", 35L, 10000D));
    result.add(new Employee("Noah", "dentist", 34L, 90000D));
    result.add(new Employee("Jhon", "dentist", 35L, 10000D));

    return result;
  }
}
