public class CounterDemo {
	
	public static void main(String[] args) {
		
		Counter c;
		
		c = new Counter();
		
		c.increment(); 	
		
		c.increment(3);	
		
		c.reset();			
		
		Counter d = new Counter(5);	

		d.increment();	
		
		Counter e = d;
		
		e.increment(2);	
		
		int temp = d.getCount(); 
		System.out.println(temp);
				
		
	}
}
