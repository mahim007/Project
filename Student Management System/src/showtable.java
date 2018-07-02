
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashraful
 */
public class showtable extends JFrame{
    private String[] col={"Id","Name","Dept","Cgpa"};
    private Object[][] data;
    String sql="select id,name,dept,cgpa from student order by id";
    private DefaultTableModel tableModel=new DefaultTableModel(data,col);
    private JTable jTable=new JTable(tableModel);
    public showtable() throws SQLException{
        add(new JScrollPane(jTable));
        PreparedStatement ps=(PreparedStatement) practice.connection.prepareStatement(sql);
        ResultSet rs=(ResultSet) ps.executeQuery();
        while(rs.next()){
            tableModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
        }
    }
    public static void mamu() throws SQLException{
        showtable frame=new showtable();
        frame.setTitle("table generator");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    } 
    
}
