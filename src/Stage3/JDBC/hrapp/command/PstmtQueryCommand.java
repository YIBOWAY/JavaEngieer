//预编译
package Stage3.JDBC.hrapp.command;

import Stage3.JDBC.common.DbUtils;

import java.sql.*;
import java.util.Scanner;

public class PstmtQueryCommand implements Command{
    @Override
    public void execute() {
        System.out.print("请输入部门名称：");
        Scanner in = new Scanner(System.in);
        String pdname = in.nextLine();
        Connection conn = null;
//        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "select * from employee where dname=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,pdname); //注意:参数索引从1
            //结果集
            rs = pstmt.executeQuery();
            //遍历查询结果
            //rs.next()返回布尔值，代表是否存在下一条记录
            //如果有，返回true,同时结果集提取下一条记录
            //如果没有，返回false，循环就会停止
            while (rs.next()) {
                Integer eno = rs.getInt(1);//JDBC中字段索引从1开始，而非0
                String ename = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println(dname + "-" + eno + "-" + ename + "-" + salary);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           DbUtils.closeConnection(rs,pstmt,conn);
        }
    }
}
