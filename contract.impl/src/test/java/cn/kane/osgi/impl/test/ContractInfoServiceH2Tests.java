/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package cn.kane.osgi.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import cn.kane.osgi.domain.ContractInfo;
import cn.kane.osgi.service.ContractInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/module-context.xml", "classpath:/test-context.xml" })
@TestExecutionListeners(value = DependencyInjectionTestExecutionListener.class)
public class ContractInfoServiceH2Tests {

	@Resource(name="contInfoSvc")
    private ContractInfoService contInfoService;

    @Test
    public void search() {
        List<ContractInfo> results = this.contInfoService.findByNameLike("johnson");
        assertNotNull(results);
        assertEquals(1, results.size());

        ContractInfo contInfo = results.get(0);
        assertNotNull(contInfo);
        assertEquals("Johnson", contInfo.getLastName());
    }
}
