import java.util.Scanner;

public class FlowerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input flower name:");
		
		Scanner input = new Scanner(System.in);
		
		String flower_name = input.nextLine();
		
		System.out.println("How many petals?");
		
		int petal_number = input.nextInt();
		
		System.out.println("Set the price:");
		
		float price_number = input.nextFloat();
		
		Flower info = new Flower(flower_name, petal_number, price_number);
	
		Flower.output(info);
	}
	
}
