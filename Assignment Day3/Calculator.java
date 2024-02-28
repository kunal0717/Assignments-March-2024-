// Question No. 18 :-

class Calculator{
		public static void main(String args[]){
		int a = 5;
		int b = 10;
		int c = 2;

		switch(c){
			case 1 :
				System.out.println("The addition of two numbers is : " + (a+b));
				break;	
			case 2 :
				System.out.println("The subtraction of two numbers is : " + (a-b));
				break;
			case 3 :
				System.out.println("The multiplication of two numbers is : " + (a*b));
				break;
			case 4 :
				System.out.println("The division of two numbers is : " + (b/a));
				break;
			default: 
				System.out.println("Invalid Input");
			
			
		}
}



}