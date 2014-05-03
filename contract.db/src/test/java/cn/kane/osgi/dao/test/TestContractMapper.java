package cn.kane.osgi.dao.test;
/*
 * 
 * @Company <Opportune Technology Development Company LTD.>
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kane.domain.Contract;
import cn.kane.dao.ContractMapper;



/**
 * @version <1.0>
 * @description 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_test.xml")
@TransactionConfiguration(transactionManager="transcationManager",defaultRollback=true)
public class TestContractMapper extends TestBase {

    @Autowired
    private ContractMapper contractMapper ;
    
    private Integer id = 0 ;
    
    @Before//should run once before every test-case
//    @BeforeClass should run once with multi-testcase,but setup-method must be static
//    @Rollback
    public void setup(){
        logger.debug("----------setup----------");
        Contract cont = new Contract();
        cont.setListingNumber(id);
        cont.setFirstName("kane");
        cont.setLastName("CH");
        cont.setEmailAddress("yiyi@163.com");
        int result = this.contractMapper.insert(cont);
        Assert.assertEquals(1, result);
    }
    
    @Test
    public void testSave(){
        logger.debug("--------------save-------------");
    }
    
    @Test
    public void testSelect(){
        Contract code = contractMapper.selectByPrimaryKey(id) ;
        Assert.assertNotNull(code);
    }
    
    @Test 
    public void testUpdate(){
    	Contract cont = contractMapper.selectByPrimaryKey(id) ;
        String emailAdd = "yiyi@gmail.com" ;
        cont.setEmailAddress(emailAdd);
        int result = contractMapper.updateByPrimaryKeySelective(cont);
        Assert.assertEquals(1, result);
        cont = contractMapper.selectByPrimaryKey(id) ;;
        Assert.assertEquals(emailAdd, cont.getEmailAddress());
    }
    
    @After//should run once after every test-case
//    @AfterClass //should run once within multi-testcase,but teardown-method must be static
    public void teardown(){
        logger.debug("----------teardown----------");
        int result = contractMapper.deleteByPrimaryKey(id) ;
        Assert.assertEquals(1, result);
    }
    
}
