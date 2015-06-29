package dao;
import entity.*;
import DBjavaCon.DBcon;
public class ShDao {
	public void dddCourse(RmesCourse ce){
		DBcon db;
		String sql1="update Ruzhu set Rsh='"+ce.getSh()+"' where Rroom='"+ce.getXz()+"'";	
		try{
			db=new DBcon();
			db.doUpdate(sql1);
			db.close();
		}catch(Exception e){
		}
	}
}
