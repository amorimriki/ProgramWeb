package Project1;

public class Employee {
	//data members
	int id;
	String name;
	String address;
	float salary;
	//methods
	void insert (int empId, String eNome,String adr, float sal ) {
		id = empId;
		name = eNome;
		address = adr;
		salary = sal;
	}
	public static void main (String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insert(1, "Mary James", "Av. ", 5000);
	}

}
