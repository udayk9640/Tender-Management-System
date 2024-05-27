package models;

public class Tender {
	private int tendorId;
	private String title;
	private String description;
	private String deadline;
	private String creaatedAt;
	public int getTendorId() {
		return tendorId;
	}
	public void setTendorId(int tendorId) {
		this.tendorId = tendorId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getCreaatedAt() {
		return creaatedAt;
	}
	public void setCreaatedAt(String creaatedAt) {
		this.creaatedAt = creaatedAt;
	}
	
	

}
