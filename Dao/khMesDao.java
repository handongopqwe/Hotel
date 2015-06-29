package dao;

import entity.khCourse;
import DBjavaCon.DBcon;

public class khMesDao {
	public void addCourse(khCourse ce){
		DBcon db;
		String sql="insert into kh (khName,khSex,khBirth,khID,khAddress) values('"+ce.getXm()+"','"+ce.getXb()+"','"+ce.getCh()+"','"+ce.getSfid()+"','"+ce.getZz()+"');";
		try{
			db=new DBcon();
			db.doInsert(sql);
			db.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
