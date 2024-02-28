class Practice{
	public static void main(String args[]){
		String s = "a";
		String S = "a";
		switch(s+S){
			case "aa":
				System.out.println("kya baat");
			case "abc":
				System.out.println("hmm");
				break;
			case "abcde":
				System.out.println("galat");
				break;
			default:
				System.out.println("shi hai");
		}
	}
		
}