package problem2;

public class Employee
{
	//Variables 
	private String name;
	private double salary;
	private double percent;
	
	//Constructor
	public Employee (String employeeName, double currentSalary)
	{
		name = employeeName;
		salary = currentSalary;
	}
	//Return employees name
	public String getName()
	{
		return name;
	}
	//Return salary
	public double getSalary()
	{
		return salary;
	}
	//Calculate raise and add to salary
	public void raiseSalary(double byPercent)
	{
		salary += (salary * byPercent); 
	}
	
	
}