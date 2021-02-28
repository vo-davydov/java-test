package model;

import java.util.Date;

public class Employee extends AbstractModel {
  private String position;
  private Long age;
  private Double salary;

  public Employee() {

  }

  public Employee(String name, String position, Long age, Double salary) {
    super(new Date(), name);
    this.position = position;
    this.age = age;
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    Employee employee = (Employee) o;

    if (position != null ? !position.equals(employee.position) : employee.position != null) {
      return false;
    }
    if (age != null ? !age.equals(employee.age) : employee.age != null) {
      return false;
    }
    return salary != null ? salary.equals(employee.salary) : employee.salary == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (position != null ? position.hashCode() : 0);
    result = 31 * result + (age != null ? age.hashCode() : 0);
    result = 31 * result + (salary != null ? salary.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "position='" + position + '\'' +
      ", age=" + age +
      ", salary=" + salary +
      '}';
  }
}
