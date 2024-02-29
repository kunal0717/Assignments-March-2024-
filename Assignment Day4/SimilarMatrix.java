// Question No. 5 :-

class SimilarMatrix{
	public static void main(String args[]){
		int a[][] = {{1,2}, {1,2}};
		int b[][] = {{1,2}, {1,3}};
		boolean result = false;

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				if(a[i][j] == b[i][j]){
					result = true;
				}else{
					result = false;
				}
			}

		}
			if(result){
				System.out.println("Matrices are same");
			}else{
				System.out.println("Matrices are not same");
			}
			
		 
		

	}


}