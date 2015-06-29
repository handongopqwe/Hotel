package DBjavaCon;
import java.sql.*;  
import java.util.Properties;  
public class DBcon{  
    private String driver="sun.jdbc.odbc.JdbcOdbcDriver";
    private String url="jdbc:odbc:ppo"; 
    private String user="sa";
    private String password="1234";
    private Connection conn;  
    private Statement stmt; 
    private ResultSet rs;  
    
    
    public DBcon() {          
        setConn();  
    }  
  
    public Connection getConn(){  
        return this.conn;  
    }  
  
    //implement the Connection  
    //CONN  
    private void setConn(){  
        try {  
            Class.forName(driver);  
            this.conn = DriverManager.getConnection(url);  
        } catch(ClassNotFoundException classnotfoundexception) {  
              classnotfoundexception.printStackTrace();  
            System.err.println("db: " + classnotfoundexception.getMessage());  
        } catch(SQLException sqlexception) {  
            System.err.println("db.getconn(): " + sqlexception.getMessage());  
        }  
    }  
    //  
       public void doInsert(String sql) {  
        try {  
            stmt = conn.createStatement();  
            int i = stmt.executeUpdate(sql);  
        } catch(SQLException sqlexception) {  
            System.err.println("db.executeInset:" + sqlexception.getMessage());  
        }finally{  
              
        }  
    }  
    //  
    public void doDelete(String sql) {  
        try {  
            stmt = conn.createStatement();  
            int i = stmt.executeUpdate(sql);  
        } catch(SQLException sqlexception) {  
            System.err.println("db.executeDelete:" + sqlexception.getMessage());  
        }  
    }  
    //  
    public void doUpdate(String sql) {  
        try {  
            stmt = conn.createStatement();  
            int i = stmt.executeUpdate(sql);  
        } catch(SQLException sqlexception) {  
            System.err.println("db.executeUpdate:" + sqlexception.getMessage());  
        }  
    }  
    //  
    public ResultSet doSelect(String sql) {  
        try {  
            stmt = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_READ_ONLY);  
            rs = stmt.executeQuery(sql);  
        } catch(SQLException sqlexception) {  
            System.err.println("db.executeQuery: " + sqlexception.getMessage());  
        }
        return rs;  
        
    }  
    /** 
   
       @Function: Close all the statement and conn int this instance and close the parameter ResultSet 
       @Param: ResultSet 
       @Exception: SQLException,Exception 
      **/  
     public void close(ResultSet rs) throws SQLException, Exception {  
  
       if (rs != null) {  
         rs.close();  
         rs = null;  
       }  
  
       if (stmt != null) {  
         stmt.close();  
         stmt = null;  
       }  
  
       if (conn != null) {  
         conn.close();  
         conn = null;  
       }  
     }  
  
     /** 
    
      * Close all the statement and conn int this instance 
      * @throws SQLException 
      * @throws Exception 
      */  
     public void close() throws SQLException, Exception {  
       if (stmt != null) {  
         stmt.close();  
         stmt = null;  
       }  
  
       if (conn != null) {  
         conn.close();  
         conn = null;  
       }  
     }  
}