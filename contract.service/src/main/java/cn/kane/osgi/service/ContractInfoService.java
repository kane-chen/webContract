package cn.kane.osgi.service;

import java.util.List;

import cn.kane.osgi.domain.ContractInfo;

public interface ContractInfoService {

	/**
	 * get contract-infos by name like,
	 * firstName like '%xxx%' or lastName like '%xxxx%'
	 * @param name
	 * @return
	 */
	List<ContractInfo> findByNameLike(String name);
	
	/**
	 * find by id
	 * @param id
	 * @return
	 */
	ContractInfo findById(int id) ;
	
}
