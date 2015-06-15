package terminal;



public class App {
	
	public static void main(String args[]){
		
		// Read input item string from console
		String str = args[0];

		// Get total price
		float total = processString(str);
		
		// Print total to console
		System.out.println("Total: " + total);
	}
	
	public static float processString(String str){
		
		// Create a terminal
		Terminal terminal = new TerminalImpl();
		terminal.setPricing();
				
		// Scan items one-by-one
		for (int i = 0; i < str.length(); i++) {
			terminal.scan(str.charAt(i) + "");
		}
		
		// Return the total price of the scanned items
		return terminal.total();
		
	}

}
