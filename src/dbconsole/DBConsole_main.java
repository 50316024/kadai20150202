package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, score;
		String name;
		ResultSet rs;

		MySQL mysql = new MySQL();
		rs = mysql.selectAll();

		try{
			while(rs.next()){

                id = rs.getInt("id");

                name = rs.getString("name");

                score = rs.getInt("height");

                System.out.println("ID�F" + id);

                System.out.println("���O�F" + name);

                System.out.println("�g���F" + score);
            }  
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}

