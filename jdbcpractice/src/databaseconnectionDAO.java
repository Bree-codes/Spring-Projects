import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseconnectionDAO {

    private Connection conn;
    private Statement st;

    public void connection()throws Exception
    {

        Class.forName("org.mariadb.jdbc.Driver");

        String url = "jdbc:mariadb://127.0.0.1:3306/Students";
        String username = "bree";
        String password = "bree004!!";

        conn = DriverManager.getConnection(url,username,password);
    }


    public void insertion()throws Exception
    {
        String query ="insert into students values" +
                "(10014,'Breesh kabobo','Computer science')," +
                "(10015,'bobi', 'IT')";


        st = conn.createStatement();
        int count = st.executeUpdate(query);

        System.out.println(count + "rows affected!");


    }

    public void select()throws Exception
    {
        studentModel student = new studentModel();

        studentModel student1 = student.studentModel();
        st = conn.createStatement();

        String query = "SELECT * FROM students  WHERE course = 'IT'";

        st.getResultSet();
        ResultSet rs;

        rs = st.executeQuery(query);

        while(rs.next())
        {
            int rollNumber = rs.getInt(1);
            student.setRollNumber(rollNumber);

            String name = rs.getString(2);
            student.setName(name);

            String course = rs.getString(3);
            student.setCourse(course);

            System.out.println(student);
        }

    }



    public void closeConnection()throws Exception
    {

        st.close();
        conn.close();

    }

}
