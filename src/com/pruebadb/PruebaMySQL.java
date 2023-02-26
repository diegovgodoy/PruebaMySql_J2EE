package com.pruebadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PruebaMySQL {

	public static void main(String[] args) {

		try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver found");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found" + e);
        }
		
		try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdprueba","root","");
           
            Statement s = conexion.createStatement();
            //3- Ejecutar SQL
            ResultSet rs = s.executeQuery ("select * from persona");
         
            //4- Recorrer el Resulset  
            while (rs.next()) {
            	
               //System.out.println (rs.getInt ("Id") + " " + rs.getString (2)+  " " + rs.getDate(3));
                System.out.println (rs.getInt("id"));
                System.out.println (rs.getString("nombre"));
                System.out.println ( rs.getDate("nacimiento"));
            }
            conexion.close();
        }catch (Exception e){
            e.printStackTrace();
        }    
	}

}
