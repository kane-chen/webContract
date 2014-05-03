package cn.kane.osgi.dao.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
public class TestBase  extends AbstractJUnit4SpringContextTests {
   
   protected static Log logger = LogFactory.getLog(TestBase.class);
   
}
