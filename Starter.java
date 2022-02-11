public class Starter {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		
		computer1.setName("Macbook");
		computer1.setMakeYear(2020);
		computer1.setComputerCost(1200);
		
		
		Computer computer2 = new Computer();
		
		computer2.setName("Chromebook");
		computer2.setMakeYear(2019);
		computer2.setComputerCost(1450);
		
		
		
		// Add at least one static method to your Computer class
		Computer.print(computer1.getName(), computer1.getMakeYear(), computer1.getComputerCost());
		Computer.print(computer2.getName(), computer2.getMakeYear(), computer2.getComputerCost());
		
		
		
		

	}

}