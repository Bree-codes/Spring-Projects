import java.sql.* ;
public class Main {
    public static void main(String[] args) throws Exception{
        databaseconnectionDAO database = new databaseconnectionDAO();

        database.connection();
        database.select();



        database.closeConnection();

    }
}
