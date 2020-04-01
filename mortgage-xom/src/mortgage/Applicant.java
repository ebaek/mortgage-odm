package mortgage;

public class Applicant {
	int age;
	String state;
	String citizenship;
	String employmentStatus;
	String employerName;
	String[] coBorrowers;
	String purchasedProperty;
	int numLatePayments;
	int creditScore;
	String residency;
	
	public String getResidency() {
		return residency;
	}
	public void setResidency(String residency) {
		this.residency = residency;
	}
	
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	
	public int getNumLatePayments() {
		return numLatePayments;
	}
	public void setNumLatePayments(Integer numLatePayments) {
		this.numLatePayments = numLatePayments;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String[] getCoBorrowers() {
		return coBorrowers;
	}
	public void setCoBorrowers(String[] coBorrowers) {
		this.coBorrowers = coBorrowers;
	}
	public String getPurchasedProperty() {
		return purchasedProperty;
	}
	public void setPurchasedProperty(String purchasedProperty) {
		this.purchasedProperty = purchasedProperty;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}
	
	
}