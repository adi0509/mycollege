package p1;

import java.sql.*;
import java.util.Scanner;

public class P1  implements java.io.Serializable
{
    
    public static void main(String[] args) 
    {
        Connection cn;
		CallableStatement cs;
		Scanner s=new Scanner(System.in);
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			cn=DriverManager.getConnection("jdbc:derby://localhost:1527/test","adi","12345");
			
			String query="{CALL totalcount(?)}";
			cs=cn.prepareCall(query);
			cs.registerOutParameter(1,Types.INTEGER);
			cs.execute();	
			int countc=cs.getInt(1);
			System.out.println("Total customers are"+countc);
			cs.close();
			
		    }
	    catch(ClassNotFoundException e)
		{
			System.out.println("Unable to load driver" +e);
		}
		
		catch(SQLException e)
		{
			System.out.println("Unable to connect"+e);
		}


    }
    
}
/*    STORED PROCEDURE ###### NOT Working in Derby #######
create procedure totalcount(
total out number
)
is
begin
select count(*) into total from customer;
end;
*/

	
