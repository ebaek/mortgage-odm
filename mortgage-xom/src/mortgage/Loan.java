package mortgage;

public class Loan {
	Integer amount;
	String purpose;
	String term;
	Float appraisedValue;
	Float salesPrice;
	boolean approved = true;
	Float loanToValue;
	String riskGrade;
	Float baseRate;
	Float minimumRate;
	Float maximumRate;
	Float adjustment;
	Float finalRate;
	
	public String getRiskGrade() {
		return riskGrade;
	}
	public void setRiskGrade(String riskGrade) {
		this.riskGrade = riskGrade;
	}
	public Float getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(Float baseRate) {
		this.baseRate = baseRate;
	}
	public Float getMinimumRate() {
		return minimumRate;
	}
	public void setMinimumRate(Float minimumRate) {
		this.minimumRate = minimumRate;
	}
	public Float getMaximumRate() {
		return maximumRate;
	}
	public void setMaximumRate(Float maximumRate) {
		this.maximumRate = maximumRate;
	}
	public Float getAdjustment() {
		return adjustment;
	}
	public void setAdjustment(Float adjustment) {
		this.adjustment = adjustment;
	}
	public Float getFinalRate() {
		return finalRate;
	}
	public void setFinalRate(Float finalRate) {
		this.finalRate = finalRate;
	}
	
	public Float getLoanToValue() {
		if( salesPrice > appraisedValue ) {
			return (float) amount / appraisedValue;
		} else {
			return (float) amount / salesPrice;
		}
	}
	public void setLoanToValue(Float loanToValue) {
		this.loanToValue = loanToValue;
	}
	
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public void reject() {
		this.approved = false;
	}
	
	public String getApprovalStatus() {
		return Boolean.toString(this.approved);
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Float getAppraisedValue() {
		return appraisedValue;
	}
	public void setAppraisedValue(Float appraisedValue) {
		this.appraisedValue = appraisedValue;
	}
	public Float getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(Float salesPrice) {
		this.salesPrice = salesPrice;
	}

}
