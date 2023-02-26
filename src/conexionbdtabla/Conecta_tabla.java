package conexionbdtabla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecta_tabla {

	public static void main(String[] args) {
		try {
			
			//1-Crear Conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdprueba","root","");
			
			
			//2-Crear objeto Statament
			Statement miStatament=miConexion.createStatement();
			
			//3- Ejecutar SQL
			ResultSet miResulset=miStatament.executeQuery("SELECT * FROM CLIENTES");
			
			
			//4- Recorrer el Resulset
			while( miResulset.next()) {
				System.out.println(miResulset.getString("CÓDIGOCLIENTE") + "," +
						miResulset.getString("EMPRESA") + ","+ miResulset.getString("RESPONSABLE"));
			}
		}catch(Exception e) {
			System.out.println("No conecta");
			e.printStackTrace();
		}

	}

}
