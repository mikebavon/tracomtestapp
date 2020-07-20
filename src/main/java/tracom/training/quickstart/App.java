package tracom.training.quickstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection("", "","");
        }catch (SQLException se){

        }catch (Exception ex){

        }finally {

        }

    }
}
