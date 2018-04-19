package model;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookForm extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblBookId, lblTitle, lblAuthor, lblPrice;
	JTextField txtTitle, txtAuthor, txtPrice;
	JComboBox<String> cboBookId;
	JButton btnSave, btnDelete;
	//GridLayout glayout;
	GridBagLayout gbl;
	GridBagConstraints
	
	public BookForm()
	{
		super("Book Form");
		panel=new JPanel();
		lblBookId=new JLabel("Book Id");
		lblTitle=new JLabel("Title");
		lblAuthor=new JLabel("Author");
		lblPrice=new JLabel("Price");
		
		cboBookId=new JComboBox<String>();
		txtTitle=new JTextField(10);
		txtAuthor=new JTextField(10);
		txtPrice=new JTextField(10);
		
		btnSave=new JButton("Save");
		btnDelete=new JButton("Delete");
		glayout=new GridLayout(5,2);
		panel.setLayout(glayout);
	
		//populate combobox
		BookDAO bdao=new BookDAO();
		Set<String> bids= bdao.getBookIds();
		for(String bid : bids)
		{
			cboBookId.addItem(bid);
		}
		
		panel.add(lblBookId);
		panel.add(cboBookId);
		panel.add(lblTitle);
		panel.add(txtTitle);
		panel.add(lblAuthor);
		panel.add(txtAuthor);
		panel.add(lblPrice);
		panel.add(txtPrice);
		panel.add(btnSave);
		panel.add(btnDelete);
		this.add(panel);
		btnSave.addActionListener(this);
		cboBookId.addActionListener(this);
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
			new BookForm();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		BookDAO bdao=new BookDAO();
		
		if(arg0.getSource()==btnSave)
		{
			//JOptionPane.showMessageDialog(this, "button save");
			Book book=new Book();
			book.setBookId(cboBookId.getSelectedItem().toString());
			book.setTitle(txtTitle.getText());
			book.setAuthor(txtAuthor.getText());
			book.setPrice(Float.parseFloat(txtPrice.getText()));
			bdao.addBook(book);
		}else if(arg0.getSource()==cboBookId)
		{
			Book book= bdao.getBookById(cboBookId.getSelectedItem().toString());
			txtTitle.setText(book.getTitle());
			txtAuthor.setText(book.getAuthor());
			txtPrice.setText(book.getPrice()+"");
			
		}
			
	}

}
