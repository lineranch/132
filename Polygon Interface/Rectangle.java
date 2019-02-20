
public class Rectangle implements Polygon {
	
		
	@Override
	public void perimeter(float rectangle_length, float rectangle_height) {

		float perimeter;
		
		perimeter = rectangle_length * 2 + rectangle_height * 2;
		
		String text = Float.toString(perimeter);
		
		System.out.println("Permimeter of shape is " + text);
	}

	@Override
	public void area(float rectangle_length, float rectangle_height) {
	
		float area;
		
		area = rectangle_length * rectangle_height;
		
		String text = Float.toString(area);
		
		System.out.println("Area of shape is " + text);
		
	}

	
	
	
}
