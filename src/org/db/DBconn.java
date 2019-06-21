package org.db;
import java.sql.*;

public class DBconn {
    public static Connection conn;     //Connection瀵硅薄锛堥摼鎺ワ級
    //杩炴帴鏁版嵁搴�
    public static Connection getConn(){
        try{
            //鍔犺浇娉ㄥ唽MySQL鐨凧DBC椹卞姩
            Class.forName("com.mysql.jdbc.Driver");
            //缂栧啓閾炬帴瀛楃涓诧紝鍒涘缓骞朵笖鑾峰彇閾炬帴
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/messageboard","root","root");
            return conn;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static void CloseConn(){
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
