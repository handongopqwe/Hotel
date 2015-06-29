package dao;

import entity.*;
import DBjavaCon.DBcon;

public class RuzhuDao {
	public void pddCourse(RuzhuCourse ce){
		DBcon db;
		String sql="insert into Ruzhu (Rxm,Rsfid,Rtime,Rroom,Rmoney) values('"+ce.getXm()+"','"+ce.getSfid1()+"','"+ce.getRuzhutime()+"','"+ce.getRuzhufj()+"','"+ce.getYj()+"');";
		try{
			db=new DBcon();
			db.doInsert(sql);
			db.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
