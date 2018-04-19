package view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import model.Product;
import model.ProductDAO;

public class ProductForm extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblProductId, lblProductName, lblProductDescription, lblPrice, lblStock;
	JTextField txtProductName, txtProductDescription, txtPrice, txtStock;
	JComboBox cboProductId;
	JButton btnSave, btnDelete;
	//FlowLayout flayout;
	GridLayout glayout;
	ProductDAO pdao;
	
	public ProductForm()
	{
		super("Product Page");
		pdao=new ProductDAO();
		panel=new JPanel();
		//flayout=new FlowLayout(FlowLayout.CENTER);
		glayout=new GridLayout(6,2);
		lblProductId=new JLabel("Product ID:");
		lblProductName=new JLabel("Product Name:");
		lblProductDescription=new JLabel("Product Description:");
		lblPrice=new JLabel("Price:");
		lblStock=new JLabel("Stock:");
		
		txtProductName=new JTextField(10);
		txtProductDescription=new JTextField(10);
		txtPrice=new JTextField(10);
		txtStock=new JTextField(10);
		
		cboProductId=new JComboBox();	cboProductId.addItem("Select...");
		
		btnSave=new JButton("Save");
		btnDelete=new JButton("Delete");		
		
		//get all keys from the file
		Set<String> productIds= pdao.getAllProductIDs();
		Iterator<String> it=productIds.iterator();
		while(it.hasNext())
		{
			String id=it.next();
			cboProductId.addItem(id);
		}			
			
		panel.setLayout(glayout);
		panel.add(lblProductId);
		panel.add(cboProductId);
		panel.add(lblProductName);
		panel.add(txtProductName);
		panel.add(lblProductDescription);
		panel.add(txtProductDescription);
		panel.add(lblPrice);
		panel.add(txtPrice);
		panel.add(lblStock);
		panel.add(txtStock);
		panel.add(btnSave);
		panel.add(btnDelete);
		
		cboProductId.addActionListener(this);
		btnSave.addActionListener(this);
		this.add(panel);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Object obj= arg0.getSource();
		
		if(obj instanceof JComboBox<?>){
			//JOptionPane.showMessageDialog(this, "Hello world");
			String pid=cboProductId.getSelectedItem().toString();
			//JOptionPane.showMessageDialog(this, pid);
			
			Product product= pdao.findProductById(pid);
			//JOptionPane.showMessageDialog(this, product.toString());
			if(product!=null)
			{
				txtProductName.setText(product.getProductName());
				txtProductDescription.setText(product.getProductDescription());
				txtPrice.setText(product.getPrice()+"");
				txtStock.setText(product.getStock()+"");
			}else
			{
				txtProductName.setText("");
				txtProductDescription.setText("");
				txtPrice.setText("");
				txtStock.setText("");
			}
		}else if(obj instanceof JButton)
		{
			JButton btn=(JButton) obj;
			if(btn==btnSave)
			{
				//add product
				Product product=new Product();
				product.setProductName(txtProductName.getText());
				product.setProductDescription(txtProductDescription.getText());
				product.setPrice(Float.parseFloat(txtPrice.getText()));
				product.setStock(Integer.parseInt(txtStock.getText()));
				pdao.addProduct1(product);
				JOptionPane.showMessageDialog(this, "Done");
				Set<String> productIds= pdao.getAllProductIDs();
				Iterator<String> it=productIds.iterator();
				//remove all items of combobox
				int size=cboProductId.getItemCount();
				for(int i=0;i<size-1;i++)
				{
					cboProductId.removeItemAt(1);
				}	
				while(it.hasNext())
				{
					String id=it.next();
					cboProductId.addItem(id);
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		new ProductForm();
		/*ProductDAO pdao=new ProductDAO();
		
		Product p=pdao.findProductById("P004");
		if(p!=null)
		{
			System.out.println(p.toString());
		}else
			System.out.println("Not found");*/
	}
	
}
