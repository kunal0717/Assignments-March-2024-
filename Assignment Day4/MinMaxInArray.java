// Question No. 2 :-

class MinMaxInArray{
	public static void main(String args[]){
		int a[] = {5,4,3,9,1,7,9};
		int min = a[0];
		int max= a[0];
		for(int i=1; i<7; i++){
			if(a[i] < min){
				//a[i] = a[i+1];
				min = a[i];
				
			}
	
		}
		System.out.println(min);

		for(int i=1; i<7; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println(max);
		
}

}