class Person{
	int age;
	float height;
	float weight;

	Person(int a, float h, float w){
		age = a;
		height = h;
		weight = w;
		
	}
		
	Person(int a, float h){
		age  = a;
		height = h;
		weight = 57.8f;
	}
	
	void display(){
		System.out.println("Age of person is " + age);
		System.out.println("Height of person is " + height);
		System.out.println("Weight of person is " + weight);
	}
	
	
	
	public static void main(String args[]){
		Person P1 = new Person(26, 6.0f, 62.3f);
		Person P2 = new Person(35, 5.1f);
			P1.display();
			P2.display();
		
	}

}