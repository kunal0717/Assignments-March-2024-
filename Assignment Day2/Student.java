class Student{
	public static void main(String args[]){
		Student Stu = new Student();
		Stu.initialValues("Kunal", 85, 80, 90);
		Stu.average();
		Stu.display();

	}
	String name;
	int m1;
	int m2;
	int m3;
		
	void initialValues(String n, int a, int b, int c){
		name = n;
		m1=a;
		m2=b;
		m3=c;
	}
	
	void average(){
		System.out.println("Average of 3 subject marks is : " + (m1+m2+m3)/3);
	}

	void display(){
		System.out.println("Name of student is "+ name);
		System.out.println("Total marks of the student is "+(m1+m2+m3));
	}
}