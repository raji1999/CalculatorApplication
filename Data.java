package DataLayer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Data {
	
	public void data1(int a,int b,int c,String s) {
	
	try {
            
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	
	
	Connection con=DriverManager.getConnection("jdbc:Ucanaccess://c:\\Calculator\\Database1.accdb");
        Statement st=con.createStatement();
        System.out.println(a);
	int i=st.executeUpdate("insert into calculator values('"+a+"','"+b+"','"+c+"','"+s+"')");
	
	if(i!=0)
        {
            System.out.println("Record inserted");
        }
        else
        {
                        System.out.println("Record  not inserted");

        }
	}
	catch(SQLException e) {
		e.printStackTrace();
	}   catch (ClassNotFoundException ex) {
                Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        public static void main(String args[])
        {
            
        }
        
}