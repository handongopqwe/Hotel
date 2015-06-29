package dao;

import entity.*;
import DBjavaCon.DBcon;

public class TfDao {
	public void pddCourse(RmesCourse ce){
		DBcon db;
		String sql="delete Ruzhu from  Ruzhu where Rroom='"+ce.getSc()+"'";
		try{
			db=new DBcon();
			db.doDelete(sql);
			db.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
