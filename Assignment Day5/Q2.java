// Question No. 2 :-

import java.util.Scanner;
class Q2{
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=5; j>=i; j--){
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		

}

} 