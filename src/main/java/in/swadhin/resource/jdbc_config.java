package in.swadhin.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class jdbc_config 
{
	@Bean
   public DriverManagerDataSource drivermanager()
   {
		DriverManagerDataSource dmd=new DriverManagerDataSource();
		dmd.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmd.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dmd.setUsername("system");
		dmd.setPassword("Swadhin9090.");
		return dmd;
   }
	@Bean
	public JdbcTemplate jdbctmplt()
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(drivermanager());
		return jt;
	}
}
