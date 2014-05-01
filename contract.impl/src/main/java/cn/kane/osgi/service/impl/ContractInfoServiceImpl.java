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

package cn.kane.osgi.service.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.kane.osgi.domain.ContractInfo;
import cn.kane.osgi.service.ContractInfoService;

/**
 * Implementation of {@link Directory} that uses JPA for persistence.<p />
 * 
 * This class is marked as {@link Transactional}. The Spring configuration for this module, enables AspectJ weaving for
 * adding transaction demarcation to classes annotated with <code>@Transactional</code>.
 */
@Transactional
@Repository
final class ContractInfoServiceImpl implements ContractInfoService {

    private static final String SEARCH_QUERY = "select l from ContractInfo l where upper(l.lastName) like :term";

    /**
     * Spring will inject a managed JPA {@link EntityManager} into this field.
     */
    @PersistenceContext
    private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<ContractInfo> findByNameLike(String name) {
		return em.createQuery(SEARCH_QUERY).setParameter("term", "%" + name.toUpperCase() + "%").getResultList();
	}

	@Override
	public ContractInfo findById(int id) {
		return em.find(ContractInfo.class, id);
	}

}
