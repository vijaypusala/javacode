package p1;

public class Employee {
	int id;
	String name;
	String address;
	

	public static void main(String[] args) {
		Employee e=new Employee();
		e.id=1;
		e.name="vijay";
		e.address="hyderabad";
		Employee e1=new Employee();
		e.id=1;
		e.name="mike";
		e.address="qcity";
		Employee e2=new Employee();
		e.id=1;
		e.name="jack";
		e.address="hcity";
		Employee emp[]=new Employee[3];
		emp[0]=e;
		emp[1]=e1;
		emp[2]=e2;
//		for(int i=0;i<emp.length;i++)
//		{
//			System.out.println(e.id:""e.name"+e.address");
//		}
		for(Employee employee:emp) {
			System.out.println(employee.id+":"+employee.name+""+employee.address+"");
		}
	}

}
