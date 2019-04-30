package servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Usejdbc {
    private String url = "jdbc:mysql://127.0.0.1/new_schema";
    //用户名
    private String user = "root";
    //用户密码
    private String pwd = "123456";
    private Connection ceonnection ;


    /**
     * chaxun db  zhangsong 20180710
     */
    private String username;
    private String content;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String Jdbc(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
            System.out.println("Ok");
            //建立连接
            //数据库地址“jdbc:mysql://服务器域名:端口号/数据库名称”

            Connection connection = DriverManager.getConnection(url, user, pwd);
            this.ceonnection= connection;
            System.out.println("Database connected");
            //创建语句
            Statement statement = connection.createStatement();
            //用executeQuery执行SQL查询语句
               // ResultSet resultSet = statement.executeQuery("   INSERT INTO stu(column_1)VALUES ("+id+")");
                //获取并输出返回结果
   boolean resultSet = statement.execute("   INSERT INTO stu(column_1)VALUES ("+id+")");
                String st="";
            /**    while (resultSet.next()) {
                    System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));

                    st= resultSet.getString(2);
                }**/




            //关闭连接
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

}