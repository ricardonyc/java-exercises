public class Computer {
	
	// create computer class that has 3 variables
	// private instance
	private String name;
	private int makeYear;
	private double computerCost;
	
	
	// empty constructor
	// no args constructor
	public Computer( ) {}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	public double getComputerCost() {
		return computerCost;
	}
	public void setComputerCost(double computerCost) {
		this.computerCost = computerCost;
	}
	
	
	public static void print(String name, int year, double cost) {
		System.out.println("Your computer is a " + name + " computer and it's from " + year + " and it cost you $" + cost);
	}
	
	
	
	
	

}