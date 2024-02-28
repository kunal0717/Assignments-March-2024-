// Question No. 15 :-

class SumOfNumbers{
	public static void main(String args[]){
		int num = 567;
		int sum = 0;
		//int i;
		do{
			//i = num % 10;
			sum = sum + num%10;
			num = num/10;
		}while(num !=0);

	System.out.println(sum);
}


}