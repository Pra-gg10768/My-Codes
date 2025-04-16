
public class DonorDetails 
{
	private String name;
	private int age;
	private String gender;
	private String blood;
	private long phone;
	
	public DonorDetails(String name, int age, String gender, String blood, long phone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setBloodGroup(String blood) {
		this.blood = blood;
	}
	public String getBloodGroup() {
		return blood;
	}
	public void setPhoneNumber(long phone) {
		this.phone = phone;
	}
	public long getPhoneNumber() {
		return phone;
	}
	

}