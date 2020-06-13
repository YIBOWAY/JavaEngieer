package Stage3.JDBC.common;

import java.sql.*;

public class DbUtils {
    public static Connection getConnection() throws SQLException,ClassNotFoundException {
        /**
         * 创建新的数据库连接
         * @return 新的Connection对象
         * @throws SQLException
         * @throws ClassNotFoundException
         */
        //1.加载并注册JDBC驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.创建数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://222.223.239.147:3307/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true","root","Xinboway@803");
        return conn;
    }
    /**
     * 关闭连接,释放资源
     * @param rs 结果集对象
     * @param stmt Statement对象
     * @param conn Connection对象
     */
    public static void closeConnection(ResultSet rs , Statement stmt ,Connection conn){
        try {
            if (rs!=null){
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if(stmt!=null){
                stmt.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if(conn!=null&& !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
