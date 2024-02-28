class Room{
	float height = 5.0f;
	float width = 5.0f;
	float breadth = 5.0f;
	
	void volume(){
		System.out.println(height * width * breadth);	
			
	}	
	public static void main(String args[]){
		Room R = new Room();
		R.volume();
	}
}