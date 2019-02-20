
public class Flower {

	String flower;
	int petals;
	float price;
	
	public Flower(String flower_type, int petal_number, float price_number) {
		
		flower = flower_type;
		petals = petal_number;
		price = price_number;
	}
	
	public static void output(Flower flower) {
		int int_petal = flower.petals;
		String str_petal = Integer.toString(int_petal);
		float float_price = flower.price;
		String str_price = Float.toString(float_price);
		
		System.out.println("Flower name: " + flower.flower);
		System.out.println("Number of petals: " + str_petal);
		System.out.println("Price: " + str_price);
	}
	

}
