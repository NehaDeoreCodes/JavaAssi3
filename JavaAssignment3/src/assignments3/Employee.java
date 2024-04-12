package assignments3;

import java.util.Scanner;

class Employee {
	private double salary;
	private int hoursOfWorkPerDay;

	public void getInfo(double salary, int hoursOfWorkPerDay) {
		this.salary = salary;
		this.hoursOfWorkPerDay = hoursOfWorkPerDay;
	}

	public void addSal() {
		if (salary < 500) {
			salary += 10;
		}
	}

	public void addWork() {
		if (hoursOfWorkPerDay > 6) {
			salary += 5;
		}
	}

	public double getFinalSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter number of hours of work per day:");
		int hoursOfWorkPerDay = sc.nextInt();

		Employee employee = new Employee();

		employee.getInfo(salary, hoursOfWorkPerDay);

		employee.addSal();
		employee.addWork();

		
		double finalSalary = employee.getFinalSalary();
		System.out.println("Final salary: $" + finalSalary);

		sc.close();
	}
}
