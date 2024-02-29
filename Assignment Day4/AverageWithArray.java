//Question NO. 1 :-

class AverageWithArray{
	public static void main(String args[]){
		double a[] = {5,4,3,9,1,7,9};
		double sum = 0;
		for(double aa : a){
			sum = sum+aa;
		}

	System.out.println("The average of the array elements is : " + (sum/7));

}

}