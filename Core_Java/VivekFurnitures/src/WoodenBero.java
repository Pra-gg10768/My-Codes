
public class WoodenBero extends Bero{
	
	private String woodType;
	
	public String getWoodType() {
		return woodType;
	}
	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}
	
	public void calculatePrice() {
		if(woodType.equalsIgnoreCase("Ply Wood")) {
			price = 15000;
		}
		else if(woodType.equalsIgnoreCase("Teak Wood")) {
			price = 12000;
		}
		else if (woodType.equalsIgnoreCase("Engineered wood")) {
			price = 10000;
		}else {
			System.out.println("Invalid wood type. Valid types: Ply Wood, Teak Wood, Engineered Wood.");
			price = -1;
		}
	}

}
