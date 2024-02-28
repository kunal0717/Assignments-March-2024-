class Box{

	float height;
	float width;
	float breadth;
		
	float getVolume(){
		return (height*width*breadth);
		
	}		
	
	float getArea(){
		float area = (2*height*breadth + 2*breadth*width + 2*width*height);
		return area;
	}
	
	Box(float h, float w, float b){
		height = h;
		width = w;
		breadth = b;
	}
		

	public static void main(String args[]){
		Box B1 = new Box(10,10,10);
		Box B2 = new Box(5.0f,5.0f,5.0f);
		System.out.println(B1.getVolume());
		System.out.println(B1.getArea());
		System.out.println(B2.getVolume());
		System.out.println(B2.getArea());
		

	}
	
}