package mahim;

import java.sql.*;

/**
 * Created by mahim on 09-Oct-17.
 */
public class DBbean {
    private Connection connection;
    private String driver;
    private String username;
    private String password;
    private String database;
    private String location;
    private String x;
    private String y;
    private String destination;
    private  String xx;
    private String yy;
    private String distance;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getDestination() {
        return destination;
    }

    public String getXx() {
        return xx;
    }

    public String getYy() {
        return yy;
    }

    public String getDistance() {
        return distance;
    }

    public void init_jdbc(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+database,username,password);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void user_jdbc()throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","");
    }

    public void insert_data() throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement("INSERT  INTO project(location,x,y) VALUES (?,?,?)");
        preparedStatement.setString(1,location);
        preparedStatement.setFloat(2,Float.parseFloat(x));
        preparedStatement.setFloat(3,Float.parseFloat(y));
        preparedStatement.executeUpdate();
        //System.out.println("database updated!");
    }

    public void delete_data() throws SQLException{
        PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM project WHERE location=?");
        preparedStatement.setString(1,location);
        preparedStatement.executeUpdate();
    }

    public void find_distance()throws SQLException{
        String sql="select * from project";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        float inpx=Float.parseFloat(x);
        float inpy=Float.parseFloat(y);
        float res=999999999999.9999999999f;

        while (resultSet.next()){
            String desloc=resultSet.getString(1);
            float desx=resultSet.getFloat(2);
            float desy=resultSet.getFloat(2);
            float tmp= (float) Math.sqrt((desx-inpx)*(desx-inpx)+(desy-inpy)*(desy-inpy));

            if (tmp<res){
                res=tmp;
                destination=desloc;
                xx=Float.toString(desx);
                yy=Float.toString(desy);
                distance=Float.toString(res);
            }
        }
    }

}
