package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBintegrityException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");

			st.setInt(1, 2);
			
			int linhasAlteradas = st.executeUpdate();
			
			System.out.println("Done! Linhas alteradas: " + linhasAlteradas);
							
		}
		catch(SQLException s){
			throw new DBintegrityException(s.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	
	}
}
