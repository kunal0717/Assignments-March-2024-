// Question No. 2 :-

class MinMaxInArray{
	public static void main(String args[]){
		int a[] = {5,4,3,9,1,7,9};
		int min =0, max=0;
		for(int i=0; i<6; i++){
			if(a[i] > a[i+1]){
				//a[i] = a[i+1];
				min = a[i+1];
				
			}
	
		}
		System.out.println(min);

		for(int i=0; i<6; i++){
			if(a[i] > a[i+1]){
				max = a[i];
			}
			
		}
		System.out.println(max);
		
}

}