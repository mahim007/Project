package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Department;
import model.DepartmentDAO;

public class DepartmentForm extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblId, lblName, lblLocation, lblManager;
	JComboBox<Integer> cboId;
	JTextField txtName, txtLocation, txtManager;
	
	public DepartmentForm()
	{
		super("Department Form");
		panel=new JPanel();
		lblId=new JLabel("Department ID");
		lblName=new JLabel("Department Name");
		lblLocation=new JLabel("Location ID");
		lblManager=new JLabel("Manage ID");
		
		cboId=new JComboBox<Integer>();
		txtName=new JTextField(10);
		txtLocation=new JTextField(10);
		txtManager=new JTextField(10);
		
		DepartmentDAO ddao=new DepartmentDAO();
		ArrayList<Integer> ids= ddao.getAllDepartmentIds();
		for(Integer i : ids)
		{
			cboId.addItem(i);
		}
		
		cboId.addActionListener(this);
		
		panel.add(lblId);
		panel.add(cboId);
		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblLocation);
		panel.add(txtLocation);
		panel.add(lblManager);
		panel.add(txtManager);
		
		this.add(panel);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		 new DepartmentForm();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		DepartmentDAO ddao=new DepartmentDAO();
		int id=Integer.parseInt(cboId.getSelectedItem().toString());
		Department dept= ddao.findDepartmentById(id);
		txtName.setText(dept.getDepartment_name());
		txtLocation.setText(dept.getLocation_id()+"");
		txtManager.setText(dept.getManager_id()+"");
	}

}
