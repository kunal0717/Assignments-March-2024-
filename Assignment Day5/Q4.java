//Question No. 4 :-

import java.util.Scanner;
class Q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum=0;

		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}

		for(int arr : a){
			sum = sum+arr;
		}

		System.out.println(sum);
		

}


}