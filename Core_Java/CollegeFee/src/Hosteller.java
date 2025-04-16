
public class Hosteller extends Student{
	private int roomNumber;
	private char blockName;
	private String roomType;
	
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	@Override
	public double calculateTotalFee() {
		double typeAmt = 0;
		switch(blockName) {
		case 'A':
			if(roomType == "AC") {
				typeAmt = 8000;
				return collegeFee+60000+typeAmt;
			}
			else {
				return collegeFee+60000;
			}
		case 'B':
			if(roomType == "AC") {
				typeAmt = 5000;
				return collegeFee+50000+typeAmt;
			}
			else {
				return collegeFee+50000;
			}
		case 'C':
			if(roomType == "AC") {
				typeAmt = 2500;
				return collegeFee+40000+typeAmt;
			}
			else {
				return collegeFee+40000;
			}
		default:
				return 0;
		}
	}
}
