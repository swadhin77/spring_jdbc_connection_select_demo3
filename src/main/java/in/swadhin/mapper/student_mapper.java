package in.swadhin.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.swadhin.bean.student_bean;

public class student_mapper implements RowMapper<student_bean> {

	@Override
	public student_bean mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		student_bean sb=new student_bean();
		sb.setRollno(rs.getInt("std_roll"));
		sb.setName(rs.getString("std_name"));
		sb.setMark(rs.getFloat("std_mark"));
		return sb;
	}

}
