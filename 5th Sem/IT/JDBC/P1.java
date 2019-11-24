package p1;
import java.sql.*;
import java.util.*;
public class P1 {
    static Connection cn;
    static Statement st;
    
    static void newStudent()
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Roll no: ");
        int roll= s.nextInt();
        System.out.print("Enter Stundent name: ");
        String name= s.next();
        System.out.print("Enter Subject 1 marks: ");
        int sub1= s.nextInt();
        System.out.print("Enter Subject 2 marks: ");
        int sub2= s.nextInt();
        
        String query1 = "insert into student values("+roll+", '"+name+"')";
        String query2 = "insert into result values("+roll+", "+sub1+", "+sub2+")";
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB1","sample","1234");
            st = cn.createStatement();
            int r1 = st.executeUpdate(query1);
            int r2 = st.executeUpdate(query2);
        }
        catch(ClassNotFoundException e){
            System.out.println("Unable to load driver " +e);
        }
        catch(SQLException e){
            System.out.println("Unable to connect " +e);
        }
        
        System.out.println("New student inserted successfully.");
    }
    static ResultSet execute(String query)
    {
        ResultSet rs;
         try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB1","sample","1234");
            st = cn.createStatement();
            rs = st.executeQuery(query);  
            return rs;
//            while(rs.next())  
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getFloat(4)); 
        }
        catch(ClassNotFoundException e){
            System.out.println("Unable to load driver " +e);
        }
        catch(SQLException e){
            System.out.println("Unable to connect " +e);
        }
        
         return null;
    }
   public static void main(String[] args) throws Exception
    {        
        System.out.println("Menu:");
        System.out.println("1. Insert A new Student and marks");
        System.out.println("2. Total no. of students");
        System.out.println("3. Average marks for each subjects");
        System.out.println("4. Name of student getting highest marks");
        System.out.println("5. Students getting 1st, 2nd and 3rd division");
        System.out.println("6. Subject wise toppers");
        System.out.println("7. Average marks");
        System.out.println("8. Student  getting 2nd highest marks");
        System.out.println("\n Choose a option");
        Scanner s= new Scanner(System.in);
        int ch = s.nextInt();
        ResultSet out;
        String query = "";
        switch(ch)
        {
            case 1: newStudent();
                    break;
            case 2: query = "select count(roll) from result";
                    out = execute(query);
                    out.next();
                    System.out.println("Total no. of students: "+out.getInt(1));
                    break;
            case 3: query = "select avg(sub1), avg(sub2) from result";
                    out = execute(query);
                    System.out.println("Average marks for each subjects: ");
                    while(out.next())  
                        System.out.println("Sub1: "+out.getString(1)+" Sub2: "+out.getInt(2)); 
                    break;
            case 4: query = "select name from student where roll= (select roll from result where (sub1+sub2)= (select max(sub1+sub2) from result))";
                    out = execute(query);
                    out.next();
                    System.out.println("Student getting highest marks: "+out.getString(1));
                    break;
            case 5: query = "";
                    out = execute(query);
                    System.out.println("Students getting 1st, 2nd and 3rd division"+out);
                    break;
            case 6: query = "";
                    out = execute(query);
                    System.out.println("Subject wise toppers: "+out);
                    break;
            case 7: query = "select avg(sub1+sub2)/2 from result";
                    out = execute(query);
                    out.next();
                    System.out.println("Average marks: "+out.getInt(1));
                    break;
            case 8: query = "";
                    out = execute(query);
                    System.out.println("Student  getting 2nd highest marks"+out);
                    break;
        }
    }
    
}
