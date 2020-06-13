package Stage3.JDBC.hrapp.command;

import Stage3.JDBC.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCommand implements Command{
    @Override
    public void execute(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工编号：");
        int eno = in.nextInt();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "delete from employee where eno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,eno);
            int cnt = pstmt.executeUpdate();
            if (cnt ==1){
                System.out.println("员工离职手续已完成。");
            }else {
                System.out.println("未找到"+eno+"编号员工数据");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            DbUtils.closeConnection(null,pstmt,conn);
        }


    }
}
