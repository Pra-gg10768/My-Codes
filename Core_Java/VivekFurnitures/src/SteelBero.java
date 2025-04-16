
public class SteelBero extends Bero{

	private int beroHeight;
	
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}

	public int getBeroHeight() {
		return beroHeight;
	}

	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

	public void calculatePrice() {
	    if (beroHeight == 3) {
	        price = 5000;
	    } else if (beroHeight == 5) {
	        price = 8000;
	    } else if (beroHeight == 7) {
	        price = 10000;
	    } else {
	        System.out.println("Invalid bero height. Valid heights: 3, 5, or 7 feet.");
	        price = -1; 
	    }
	}

}
