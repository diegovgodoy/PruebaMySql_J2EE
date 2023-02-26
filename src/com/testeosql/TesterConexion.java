package com.testeosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesterConexion {

	public static void main(String[] args) {
		
		//Comprobamos que el driver  correctamente  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver found / Encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found / no encontrado" + e);
         }

       
      //Creamos la conexion
         String url="jdbc:mysql://localhost:3306/bdprueba";
         String user="root";
         String password="";
         Connection con= null;
         
       //Nos conectamos y testeamos la conexion
         try {
          con=DriverManager.getConnection(url,user,password);
          System.out.println("Conexion exitosa");
      } catch (SQLException e) {
          System.out.println("Error en la conexion" + e);
      }
	}

}
