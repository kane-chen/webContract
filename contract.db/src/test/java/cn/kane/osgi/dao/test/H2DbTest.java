package cn.kane.osgi.dao.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/module-context.xml"})
@TestExecutionListeners(value = DependencyInjectionTestExecutionListener.class)
public class H2DbTest {

	@Resource(name="dataSource")
	private DataSource ds ;
	
	@Test
	public void connect(){
		try {
			Connection conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement("select 1 from dual");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				int result = rs.getInt(1) ;
				Assert.assertEquals(1, result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
