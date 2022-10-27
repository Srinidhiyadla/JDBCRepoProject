package com.evoke.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.evoke.model.UserDemo;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	//Implementation methods for JDbc connection
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/*
	 * public int saveUser(UserDemo e) { String query =
	 * "insert into UserDemo(id,name,age) values(?,?,?)"; int r =
	 * jdbcTemplate.update(query, e.getId(), e.getName(), e.getAge());
	 * 
	 * return r; }
	 */
	

	public int updateUser(UserDemo e){  
	    String query="update UserDemo set name='"+e.getName()+"',Age='"+e.getAge()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} 


	/*
	 * public int updateUser(UserDemo e){ String
	 * query="Update UserDemo(id,name,age) values(?,?,?)"; int
	 * r=jdbcTemplate.update(query,e.getId(),e.getName(),e.getAge()); return r; }
	 */
  public int deleteUser(UserDemo e){ String
  query="delete from UserDemo where id='"+e.getId()+"' ";
  return jdbcTemplate.update(query);
  }
}