package com.seproject.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DatabaseConnection {
        private final String connectionURL = "";
        public String username="";
        public String password="";
        public String driver = "";
       
        private Connection con = null;
       
        public DatabaseConnection() {          
                try {
                       try {
							Class.forName(driver).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                        con = DriverManager.getConnection(connectionURL,username,password);
                } catch (SQLException e) {
                        con = null;                      
                }              
        }

        public Connection getConnection() {
                return con;
        }

        public void destroy() throws SQLException{
        	try{con.close();}
        		catch(SQLDataException e){e.printStackTrace();}
        }
        


	public PreparedStatement prepareStatement(String sql) {
                try {
                        return con.prepareStatement(sql);
                } catch (SQLException e) {
                	
			//handle the exception
                        e.printStackTrace();
                        return null;
                }
        }
        

}