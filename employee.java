import java.util.Scanner;
 class employee{
	Scanner sc = new Scanner(System.in);
	void employeeclass()
	{
		System.out.println("Enter the department");
		String employeedept = sc.next();
		String employeename[]=new String[20];
		for(int t=0 ; t <= 0 ;t++) 
		{
		System.out.println("Enter the name");
		 employeename[t] = sc.next();
			sc.nextLine();
		}
		System.out.println("Enter the id ");
		int employeeid = sc.nextInt();	
	}
	void display() 
	{
		System.out.println("Data accepted");
	}
	
	public static void main(String[] args) 
	{
		employee k = new employee();
		k.employeeclass();
		k.display();
	}

}