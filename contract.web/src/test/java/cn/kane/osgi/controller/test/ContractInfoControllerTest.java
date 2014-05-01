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

package cn.kane.osgi.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import cn.kane.osgi.controller.ContractInfoController;
import cn.kane.osgi.domain.ContractInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/spring/module-context.xml", "classpath:/WEB-INF/greenpages-servlet.xml", "classpath:/test-context.xml" })
@TestExecutionListeners(value = DependencyInjectionTestExecutionListener.class)
public class ContractInfoControllerTest {

    @Autowired
    private ContractInfoController controller;

    @Test
    public void search() {
        List<ContractInfo> results = this.controller.search("johnson");
        assertNotNull(results);
        assertEquals(1, results.size());

        ContractInfo listing = results.get(0);
        assertNotNull(listing);
        assertEquals("Johnson", listing.getLastName());
    }

    @Test
    public void entry() {
    	ContractInfo listing = this.controller.entry(1);
        assertNotNull(listing);
        assertEquals("Johnson", listing.getLastName());
    }
}
