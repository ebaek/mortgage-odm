package mortgage;

public class Loan {
	Integer amount;
	String purpose;
	String term;
	Float appraisedValue;
	Float salesPrice;
	boolean approved = true;
	Float loanToValue;
	
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
