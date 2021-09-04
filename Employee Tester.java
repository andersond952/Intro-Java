package problem2;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Billy Bob" , 10);
		System.out.println(employee1.getName());
		System.out.println(employee1.getSalary() + " dollars per hour");
		employee1.raiseSalary(0.03);
		System.out.println(employee1.getSalary() + " dollars per hour");

	}

}
