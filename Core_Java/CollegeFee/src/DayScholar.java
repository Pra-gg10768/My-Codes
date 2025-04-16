
public class DayScholar extends Student{
	
	private int busNumber;
	private float distance;

	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	
	public double calculateTotalFee() {
		
		if(distance>30 && distance <=40) {
			return collegeFee+28000;
		}
		else if (distance>20 && distance <=30) {
			return collegeFee+20000;
		}
		else if (distance>10 && distance<=20) {
			return collegeFee+12000;
		}
		else if (distance<=10 && distance>0) {
			return collegeFee+6000;
		}
		else {
			return 0;
		}
		
	}

}
