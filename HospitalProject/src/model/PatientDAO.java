package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class PatientDAO {
	HashMap<Integer, Patient> patients;
	public void writeToFile()
	{
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("mokid.dat"));
			oos.writeObject(patients);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	public PatientDAO()
	{
		patients=new HashMap<>();
		//check if the file exist?
		File f=new File("mokid.dat");
		if(!f.exists())
		{
			//write an empty Collection to the file
			//To write an object into the file, we need ObjectOutputStream
			writeToFile();
		}else
		{
			//file already exists. So read the (collection) object from the file
			try {
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
				patients= (HashMap<Integer, Patient>) ois.readObject();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void persist(Patient patient)
	{
		patients.put(patient.getPatientId(), patient);
		writeToFile();
	}
	public void addPatient(Patient patient)
	{
		persist(patient);
	}
	public void modifyPatient(Patient patient)
	{
		persist(patient);
	}
	public void removePatient(int patientId)
	{
		patients.remove(patientId);
		writeToFile();
	}
	public Set<Integer> getAllPatientIds()
	{
		return patients.keySet();
	}
	public Patient findPatientById(int patientId)
	{
		return patients.get(patientId);
	}
	public static void main(String[] args) {
		PatientDAO pdao=new PatientDAO();
		Patient p=new Patient();
		p.setPatientId(1);
		p.setPatientName("Mokid");
		p.setBloodGroup("O+ve");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date admitDate=new Date();
		try {
			admitDate=sdf.parse("01-Mar-2017");
			p.setAdmitDate(admitDate);
			pdao.addPatient(p);
			System.out.println("Done");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
