
public class Square implements Polygon {

	
	public void perimeter(float square_width, float square_height) {
		
		float perimeter;
		
		perimeter = square_width * 4;
		
		String text = Float.toString(perimeter);
		
		System.out.println("Perimeter of shape is " + text);
	}

	public void area(float square_width, float square_height) {
		
		float area;
		
		area = square_width * square_height;
		
		String text = Float.toString(area);
		
		System.out.println("Area of shape is " + text);
		
	}
	
}
