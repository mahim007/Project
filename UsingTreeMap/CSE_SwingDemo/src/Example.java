import javax.swing.JFrame;

class StudentForm extends JFrame
{
	public StudentForm(String title)
	{
		super(title);
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setTitle("Student Registration Form");
		this.setVisible(true);
	}
}

public class Example {

	public static void main(String[] args) {
		//System.out.println("Hello world");
		/*JFrame frame=new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Student Registration Form");*/
		StudentForm sform=new StudentForm("Student Registration Form");
	}

}
