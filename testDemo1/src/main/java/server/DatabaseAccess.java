package server;

import java.sql.*;

import javax.jws.WebService;
import javax.servlet.http.HttpServlet;

public class DatabaseAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * // JDBC驱动名和数据库
	 * 
	 * private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; private
	 * static final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";
	 * 
	 * // 数据库的用户名和密码
	 * 
	 * private static final String USER = "root"; private static final String PASS =
	 * "123456";
	 * 
	 * public void init() { try { Class.forName(JDBC_DRIVER);
	 * 
	 * Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 * 
	 * // 执行sql查询 Statement stmt = conn.createStatement(); String sql = ""; sql =
	 * "SELECT uName,uPass From t_user"; ResultSet rs = stmt.executeQuery(sql);
	 * 
	 * 
	 * rs.close(); stmt.close(); conn.close(); } catch (ClassNotFoundException |
	 * SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 */

	// JDBC驱动和数据库
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/dbtest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT&useSSL=false";
	// 数据库用户名和密码
	private static final String USER = "root";
	private static final String PASS = "123456";

	// 注册JDBC驱动
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM  t_user";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("uName");
				String pass = rs.getString("uPass");
				System.out.println(name + " : " + pass);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 执行查询语句
		// 关闭服务
	}
}
