package model;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable
{
	int patientId;
	String patientName;
	Date admitDate;
	String bloodGroup;
	public Patient(){}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Date getAdmitDate() {
		return admitDate;
	}
	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName="
				+ patientName + ", admitDate=" + admitDate + ", bloodGroup="
				+ bloodGroup + "]";
	}
	
}
