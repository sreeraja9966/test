package waste;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import commonSvnFunctions.AccountNumber;
import commonSvnFunctions.KeyValuePair;
import commonSvnFunctions.ProductId;

public class ImplementJson {
	private Integer instructionId;

	@SerializedName("accountNumber")
	@Expose
	private AccountNumber accountNumber;
	//private ProductId productId;
	private String instruction;
	private KeyValuePair status;
	//private Date expiryDate;
	//private Date enteredDate;
	private String enteredby;
	private String reason;
	//private Date modifiedDate;
	private String modifiedBy;
	private String instructionThrough;
	private String instituteId;
	
	
	public Integer getInstructionId() {
		return instructionId;
	}
	public void setInstructionId(Integer instructionId) {
		this.instructionId = instructionId;
	}
	public AccountNumber getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(AccountNumber accountNumber) {
		this.accountNumber = accountNumber;
	}
	/*public ProductId getProductId() {
		return productId;
	}
	public void setProductId(ProductId productId) {
		this.productId = productId;
	}*/
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public KeyValuePair getStatus() {
		return status;
	}
	public void setStatus(KeyValuePair status) {
		this.status = status;
	}
	/*public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}*/
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	/*public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}*/
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getInstructionThrough() {
		return instructionThrough;
	}
	public void setInstructionThrough(String instructionThrough) {
		this.instructionThrough = instructionThrough;
	}
	public String getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

}
