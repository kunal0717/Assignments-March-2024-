// Question No. 1 :-

import java.util.Scanner;
class Q1{
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		

}

}