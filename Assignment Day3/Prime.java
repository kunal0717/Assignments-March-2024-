// Question No. 16 :-

class Prime{
	public static void main(String args[]){
		int num = 6;
		int count = 0;
		for(int i=2; i<num; i++){
			if(num%i ==0){
				count++;
				break;
			}		   
		} 
		
		if(count == 0){
			System.out.println("Is a prime no.");
		} 
		else {
			System.out.println("Not a prime no.");
		}

}
}