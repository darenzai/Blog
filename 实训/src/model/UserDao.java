package model;

import com.mysql.jdbc.Util;

import java.sql.*;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

public class UserDao {

    ResultSet rs=null;

    public Boolean login(String name,String passwd){

        Boolean flag=false;

        String sql="SELECT * FROM  user  WHERE  name='"+name+"' AND passwd='"+passwd+"'";


        try(Connection con=DBUtil.getCon(); PreparedStatement ps=con.prepareStatement(sql)){


            rs=ps.executeQuery();
            if(rs.next()){
                flag=true;
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        return flag;
    }
}
