package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Patient;
import model.PatientDAO;

public class PatientForm extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblPatientId, lblPatientName, lblAdmitDate, lblBloodGroup;
	JComboBox<Integer> cboPatientId;
	JTextField txtPatientName, txtAdmitDate, txtBloodGroup;
	JButton btnAdd, btnEdit, btnDelete;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	
	public PatientForm()
	{
		panel=new JPanel();
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		lblPatientId=new JLabel("Patient Id");
		lblPatientName=new JLabel("Patient Name");
		lblAdmitDate=new JLabel("Admit Date (dd-MMM-yyyy");
		lblBloodGroup=new JLabel("Blood Group");
		
		cboPatientId=new JComboBox<Integer>();
		txtPatientName=new JTextField(10);
		txtAdmitDate=new JTextField(10);
		txtBloodGroup=new JTextField(10);
		
		btnAdd=new JButton("Add");
		btnEdit=new JButton("Edit");
		btnDelete=new JButton("Delete");
		panel.setLayout(gbl);
		
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=0;
		gbl.setConstraints(lblPatientId, gbc);
		panel.add(lblPatientId);
		
		gbc.gridx=100;
		gbc.gridy=0;
		gbl.setConstraints(cboPatientId, gbc);
		panel.add(cboPatientId);
		
		gbc.gridx=0;
		gbc.gridy=100;
		gbl.setConstraints(lblPatientName, gbc);
		panel.add(lblPatientName);
		
		gbc.gridx=100;
		gbc.gridy=100;
		gbl.setConstraints(txtPatientName, gbc);
		panel.add(txtPatientName);
		
		gbc.gridx=0;
		gbc.gridy=200;
		gbl.setConstraints(lblAdmitDate, gbc);
		panel.add(lblAdmitDate);
		
		gbc.gridx=100;
		gbc.gridy=200;
		gbl.setConstraints(txtAdmitDate, gbc);
		panel.add(txtAdmitDate);
		
		gbc.gridx=0;
		gbc.gridy=300;
		gbl.setConstraints(lblBloodGroup, gbc);
		panel.add(lblBloodGroup);
		
		gbc.gridx=100;
		gbc.gridy=300;
		gbl.setConstraints(txtBloodGroup, gbc);
		panel.add(txtBloodGroup);
		
		gbc.gridx=0;
		gbc.gridy=400;
		gbl.setConstraints(btnAdd, gbc);
		panel.add(btnAdd);
		
		gbc.gridx=100;
		gbc.gridy=400;
		gbl.setConstraints(btnEdit, gbc);
		panel.add(btnEdit);
		
		gbc.gridx=200;
		gbc.gridy=400;
		gbl.setConstraints(btnDelete, gbc);
		panel.add(btnDelete);
		
		btnAdd.addActionListener(this);
		btnEdit.addActionListener(this);
		btnDelete.addActionListener(this);
		cboPatientId.addActionListener(this);
		this.add(panel);
		
		PatientDAO pdao=new PatientDAO();
		Set<Integer> pids= pdao.getAllPatientIds();
		for(Integer i : pids)
		{
			cboPatientId.addItem(i);
		}
		cboPatientId.setEditable(true);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new PatientForm();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		PatientDAO pdao=new PatientDAO();
		Date admitDate=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		
		if(arg0.getSource()==btnAdd)
		{
			//code to add patient
			Patient patient=new Patient();
			patient.setPatientId(Integer.parseInt(cboPatientId.getSelectedItem().toString()));
			patient.setPatientName(txtPatientName.getText());
			try {
				admitDate=sdf.parse(txtAdmitDate.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			patient.setBloodGroup(txtBloodGroup.getText());
			pdao.addPatient(patient);
			JOptionPane.showMessageDialog(this, "Added");
		}else if(arg0.getSource()==cboPatientId)
		{
			JOptionPane.showMessageDialog(this, "changing");
			Patient patient=pdao.findPatientById(Integer.parseInt(cboPatientId.getSelectedItem().toString()));
			if(patient!=null)
			{
				txtPatientName.setText(patient.getPatientName());
				admitDate=patient.getAdmitDate();
				String ad="";
				if(admitDate!=null){
					ad=sdf.format(admitDate);
					txtAdmitDate.setText(ad);
				}else{
					admitDate=new Date();
					ad=sdf.format(admitDate);
					
				}
					txtAdmitDate.setText(ad);
				txtBloodGroup.setText(patient.getBloodGroup());
			}else
			{
				txtPatientName.setText("");
				txtAdmitDate.setText("");
				txtBloodGroup.setText("");
			}
		}
	}

}
