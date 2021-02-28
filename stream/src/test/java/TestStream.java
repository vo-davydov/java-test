import java.util.ArrayList;
import java.util.List;
import model.Employee;
import org.junit.Before;
import org.junit.Test;
import util.ObjectUtil;

public class TestStream {

  private ObjectUtil util;

  @Before
  public void init() {
    util = new ObjectUtil();
  }

  @Test
  public void employeeTest() {
    List<Employee> employees = util.getEmployees();
    //filter
    List<Employee> devEmployees = new ArrayList<>();
    employees.stream().filter(e -> e.getPosition().equals("software developer")).forEach(dev -> devEmployees.add(dev));
    devEmployees.forEach(dev -> System.out.println(dev));

  }
}
