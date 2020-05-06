/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.iapi.sql.PreparedStatement;
//import trans_processed;
//import default package.class trans_processed.amtUpdate;

/**
 *
 * @author My
 */

public class db{
   // String cpin; 
    int row;
  //    static  int p;
   //  static double  amu[]=new double[20];
   //  static String tp[]=new String[20];
     int i=0;
     int j=0;
     int k=0;
     int l=0;
     int m=0;
    String pn[]=new String[20];
    double  bal[]=new double[20];
     double  balUpdate[]=new double[20];
    String a[]=new String[20];
   public String name[]=new String[20];
      //  String b[]=new String[20]; 
    
     public String[] db() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  a[i]=rs.getString(1);
                  i++;
              }
              return a;
                   
                  
            }

    
     public  String[] db_name() throws SQLException 
     {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  name[k]=rs.getString(2);
                  k++;
              }
              return name;
        }
     public String[] db_pin() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
              Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  pn[l]=rs.getString(3);
                  l++;
              }
              return pn;
                   
                  
            }
     public  double[] db_bal() throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  bal[j]=rs.getDouble(4);
                  j++;
              }
              return bal;
    }
     public  double[] db_balPut(double amu,String tp) throws SQLException {
       // Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
        try {
            //  System.out.println("Connection Created !!!");
            //     Statement st=con.createStatement();
               
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
             Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
         //   ResultSet rs=st.executeQuery("select * from CUSTOMER");
        //    Statement st=con.createStatement();
        //     ResultSet rs=st.executeQuery("select * from CUSTOMER");
             java.sql.PreparedStatement ps= con.prepareStatement("update CUSTOMER set BALANCE =? where TPIN=? ");
            
             
             
 
             System.out.println(amu);
             System.out.println(tp);
            ps.setDouble(1, amu);
             ps.setString(2,tp);
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
            
              return bal;
      }

     public  int row() throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  m++;
              }
              return m;
    }
}
        
    
   