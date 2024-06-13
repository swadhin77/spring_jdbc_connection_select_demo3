package in.swadhin.spring_jdbc_connection_dem02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.swadhin.bean.student_bean;
import in.swadhin.mapper.student_mapper;
import in.swadhin.resource.jdbc_config;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbc_config.class);
		JdbcTemplate jt = context.getBean(JdbcTemplate.class);
String query1 = "select * from student";
List<student_bean> l=jt.query(query1, new student_mapper());
for(student_bean k:l)
{
	System.out.println("Roll no :"+k.getRollno());
	System.out.println("Name : "+k.getName());
	System.out.println("Mark :"+k.getMark());
	System.out.println("------------------------------");
}
	}
}
