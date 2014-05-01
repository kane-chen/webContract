package cn.kane.osgi.service.offlineimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.kane.osgi.domain.ContractInfo;
import cn.kane.osgi.service.ContractInfoService;

@Service("contractInfoServiceOffline")
public class ContractInfoService_OfflineImpl implements ContractInfoService {

	private static Map<Integer,ContractInfo> contInfos = new HashMap<Integer ,ContractInfo>() ;
	static{
		for(int i =0 ;i<10 ;i++){
			ContractInfo contInfo = new ContractInfo() ;
			contInfo.setId(i);
			contInfo.setFirstName("firstName"+i);
			contInfo.setLastName("lastName"+i);
			contInfo.setEmail("email"+i+"@kane.cn");
			contInfos.put(i,contInfo) ;
		}
	}
	
	@Override
	public List<ContractInfo> findByNameLike(String name) {
		List<ContractInfo> result = null ;
		if(name!=null){
			for(ContractInfo contInfo : contInfos.values()){
				if(contInfo.getFirstName().indexOf(name)>=0 
						|| contInfo.getLastName().indexOf(name)>=0){
					if(null==result){
						result = new ArrayList<ContractInfo>() ;
					}
					result.add(contInfo) ;
				}
			}
		}
		return result;
	}

	@Override
	public ContractInfo findById(int id) {
		return contInfos.get(id) ;
	}

}
