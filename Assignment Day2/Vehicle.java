class Vehicle{
		float price;
		String color;
		String model;

		Vehicle(float p, String c, String m){
			price = p;
			color = c;
			model = m;
		}
	
		void display(){
			System.out.println("Price of Vehicle is " +price);
			System.out.println("Color of Vehicle is " +color);
			System.out.println("Model of Vehicle is " +model);
			
		}
		
		


	public static void main(String args[]){
			Vehicle V = new Vehicle(1500000, "Black", "XUV");
				V.display();		
	
	}
		
}