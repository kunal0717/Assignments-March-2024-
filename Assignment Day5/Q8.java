// Question No. 8 :-

import java.util.Scanner;

class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		//int temp[] = new int[];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		/*for(int i=0; i<n-1; i++){
			
				if(a[i]==a[i+1]){
					continue;
				}else{
					System.out.print(a[i]);
				}
			
		}*/



	}

}