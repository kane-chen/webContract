package cn.kane.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.util.Assert;

import cn.kane.osgi.domain.ContractInfo;
import cn.kane.osgi.service.ContractInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/module-context.xml"})
@TestExecutionListeners(value = DependencyInjectionTestExecutionListener.class)
public class ContractServiceTest {

	@Resource(name="contractInfoServiceOffline")
	private ContractInfoService contService ;
	
	@Test
	public void findByName(){
		String name4Search = null ;
		List<ContractInfo> contInfos = contService.findByNameLike(name4Search) ;
		Assert.isNull(contInfos);
		name4Search = "Name" ;
		contInfos = contService.findByNameLike(name4Search) ;
		Assert.notEmpty(contInfos);
	}
	
	@Test
	public void findById(){
		int id = 5 ;
		ContractInfo contInfo = contService.findById(id) ;
		Assert.notNull(contInfo, "findById not suit");
	}
	
}
