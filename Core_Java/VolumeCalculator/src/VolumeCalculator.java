
public class VolumeCalculator {

	public double radius, height;
	public int length, breadth, height1;
	
	public double calculateVolume(double radius, double height) {
		this.radius = radius;
		this.height = height;
		double volume = 3.14*radius*radius*height;
		return volume;
	}
	
	public double calculateVolume(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height1 = height;
		double volume = length*breadth*height;
		return volume;
	}
	
	
	
}
