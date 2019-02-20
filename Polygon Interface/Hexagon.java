import java.lang.Math;

public class Hexagon implements Polygon {

	@Override
	public void perimeter(float hexagon_side, float extra_parameter) {
		
		float perimeter;

		perimeter = hexagon_side * 6;
		
		String text = Float.toString(perimeter);
		
		System.out.println("Perimeter of shape is " + text);
		
	}

	@Override
	public void area(float hexagon_side, float extra_parameter) {
	
		double area;
		
		area = (3 * Math.sqrt(3) / 2) * (hexagon_side * hexagon_side);
		
		String text = Double.toString(area);
		
		System.out.println("Area of shape is " + text);

	}

}
