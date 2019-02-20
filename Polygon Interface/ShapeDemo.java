import java.util.Scanner;

public class ShapeDemo {
	public static void main(String[] args) {
	
	System.out.println("Enter side of square:");
	
	Scanner input = new Scanner(System.in);
		
	float square_length = input.nextFloat();
	
	Polygon square = new Square();
		
	square.area(square_length, square_length);
	
	square.perimeter(square_length, square_length);
	
	System.out.println();
	
	System.out.println("Enter base and height of rectangle:");
	
	float rectangle_length = input.nextFloat(); 
	
	float rectangle_height = input.nextFloat();
	
	Polygon rectangle = new Rectangle();
	
	rectangle.area(rectangle_length, rectangle_height);
	
	rectangle.perimeter(rectangle_length, rectangle_height);
	
	System.out.println();
	
	System.out.println("Enter side of hexagon: ");
	
	float hexagon_side = input.nextFloat();
	
	Polygon hexagon = new Hexagon();
	
	hexagon.area(hexagon_side, hexagon_side);
	
	hexagon.perimeter(hexagon_side, hexagon_side);
	
	}
}
