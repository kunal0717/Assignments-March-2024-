// Question No. 6 :-

import java.util.Scanner;

class Q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		for(int i=(a.length-1); i>=0; i--){
			System.out.println(a[i]);
		}
	
	}

}