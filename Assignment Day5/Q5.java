//Question No. 5 :-

import java.util.Scanner;

class Q5{
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = a[0];
		
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}	
		}
           System.out.println(a[a.length-2]);
	}		
	
}