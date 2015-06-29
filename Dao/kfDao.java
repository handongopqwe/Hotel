package dao;
import roomMannger.kf;
import entity.*;
import DBjavaCon.DBcon;

public class kfDao {
	public void pddCourse(RmesCourse ce){
		DBcon db;
		
		String sql1="insert into Rz1(Rxm,Rsfid,Rtime,Rroom,Rmoney,Rsh) (select *from Ruzhu where Rroom='"+kf.getXxzz()+"')";
		String sql2="delete  Ruzhu where Rroom='"+kf.getXxzz()+"'";
		String sql3="update Rz1  set Rroom='"+ce.getPdxz()+"'  where Rroom='"+kf.getXxzz()+"'";
		String sql4="insert into Ruzhu(Rxm,Rsfid,Rtime,Rroom,Rmoney,Rsh)(select *from Rz1 where Rroom='"+ce.getPdxz()+"')";
		
		try{
			db=new DBcon();
			db.doInsert(sql1);
			db.doDelete(sql2);
			db.doUpdate(sql3);
			db.doInsert(sql4);
			db.close();
		}catch(Exception e){
		}
	}
}
