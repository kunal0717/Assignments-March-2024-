//Question No. 3 :-


import java.util.Scanner;

class MultipleOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0, sum = 0;
		int t=0;
	
		while(i<n){
			t = 2*(i-1);
		
			if( t%3 == 0){
				sum = sum + i;
			}
			i++;		
		}
		System.out.println(sum);
	

}


}

