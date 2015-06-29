package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.*;
import DBjavaCon.DBcon;

public class RmesDao {
	public void pddCourse(RmesCourse ce){
		DBcon db;
		String sql="insert into Ruzhu (Rsh) values('"+ce.getSh()+"');";
		try{
			db=new DBcon();
			db.doInsert(sql);
			db.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public List<RuzhuCourse> getAll(String sql){
		List<RuzhuCourse> list=new ArrayList<RuzhuCourse>();
		RuzhuCourse c;
		DBcon db;
		ResultSet rs;
	String sql1="select * from Ruzhu";
		try{
			db=new DBcon();
			rs=db.doSelect(sql1);
			while(rs.next()){
				c=new RuzhuCourse(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),Integer.parseInt(rs.getString(5)),rs.getString(6));
				list.add(c);
			}
			db.close(rs);
		}catch (Exception e){
			System.out.print(e.getMessage());
		}
		return list;
	}
}
