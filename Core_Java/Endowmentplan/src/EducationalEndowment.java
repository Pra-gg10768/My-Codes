
public class EducationalEndowment extends Endowment{
	
	private String educationalInstitution;
	private String educationalDivision;
	
	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
			String educationalInstitution, String educationalDivision) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.educationalInstitution = educationalInstitution;
		this.educationalDivision = educationalDivision;
	}

	public String getEducationalInstitution() {
		return educationalInstitution;
	}
	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}
	public String getEducationalDivision() {
		return educationalDivision;
	}
	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}

	public double calculateEndowment(){
		double amount = 0;
		if(educationalDivision.equalsIgnoreCase("School")) {
			amount = 30000;
		}
		else if(educationalDivision.equalsIgnoreCase("UnderGraduate")) {
			amount = 60000;
		}
		else if (educationalDivision.equalsIgnoreCase("PostGraduate")) {
			amount = 90000;
		}
		return amount;
		
	}

}
