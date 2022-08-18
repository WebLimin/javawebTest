package entry;

//第一步：导入必须的包
import java.sql.*;

public class Main {

	// 第二步：说明JDBC驱动的名称和数据库地址
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	// 第三步：说明数据库的认证账户和密码
	static final String USER = "root";
	static final String PASS = "123456";

	public static void main(String[] args) {

		// 第四步：注册JDBC驱动
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 第五步：获得数据库连接
		try {
			Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
			// 第六步：执行查询语句
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM crawler_article";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String title = rs.getString("title");
				String author = rs.getString("author");
				System.out.println(title + ":" + author);
			}
			// 第七步：关闭连接资源
			rs.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
