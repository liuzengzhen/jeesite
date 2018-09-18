/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cont_num.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.cont_num.dao.TContractNumDao;
import com.thinkgem.jeesite.modules.cont_num.entity.TContractNum;

/**
 * 合同流水号生成Service
 * @author liuzz
 * @version 2017-03-09
 */
@Service
@Transactional(readOnly = true)
public class TContractNumService extends CrudService<TContractNumDao, TContractNum> {
	static final int defaultlength = 6;
	public TContractNum get(String id) {
		return super.get(id);
	}
	
	public List<TContractNum> findList(TContractNum tContractNum) {
		return super.findList(tContractNum);
	}
	
	public Page<TContractNum> findPage(Page<TContractNum> page, TContractNum tContractNum) {
		return super.findPage(page, tContractNum);
	}
	
	@Transactional(readOnly = false)
	public void save(TContractNum tContractNum) {
		super.save(tContractNum);
	}
	
	@Transactional(readOnly = false)
	public void delete(TContractNum tContractNum) {
		super.delete(tContractNum);
	}
	@Transactional(readOnly = false)
	// 事项记录单 流水号
	public String RecordNum(String ContractNum){
		StringBuffer fullnum = new StringBuffer(ContractNum);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String yearnow = sdf.format(new Date());
		synchronized (this) {
			String  organizeId="44";
			TContractNum contractNum = dao.getnum(organizeId);
			// 如果没有数据
			 if(contractNum==null){
				 TContractNum contractnum=new TContractNum();
				   contractnum.setOrganizedId(organizeId);
				   contractnum.setYear(yearnow);
				   contractnum.setLastnum("0");
				   //contractnum.preInsert();
				   this.save(contractnum);
			 }
			contractNum = dao.getnum(organizeId);
			String year = contractNum.getYear();
			Integer lastnum = Integer.parseInt(contractNum.getLastnum());
			// 判断时间是否重置流水号或字段取出加一
			

			if (Integer.parseInt(yearnow) > Integer.parseInt(year)) {
				lastnum = 1;
			} else {
				lastnum++;
			}
			// 通过组织编号把最新流水号更新到数据库
			contractNum.setLastnum(String.valueOf(lastnum));
			contractNum.setYear(yearnow);
            contractNum.preUpdate();
			dao.updateByorganizdeId(contractNum);

			// 补零
			int len = lastnum.toString().length();
			if (len >= defaultlength) {
				fullnum.append("_").append(lastnum);
						
			}
			int rest = defaultlength - len;
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < rest; i++) {
				sb.append("0");
			}
			String finalnum = sb.append(lastnum).toString();
			fullnum.append("_").append(finalnum);
		}
		return fullnum.toString();
	}
	// 流水号
		@Transactional(readOnly = false)
		public String Contractname(String organizeId) {
			// 返回完整流水号
			StringBuffer fullnum = new StringBuffer("CM");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			String yearnow = sdf.format(new Date());
			// 流水号实体对象取出年限和最新流水号
			synchronized (this) {
			
				TContractNum contractNum = dao.getnum(organizeId);
				// 如果没有数据
				 if(contractNum==null){
					 TContractNum contractnum=new TContractNum();
					   contractnum.setOrganizedId(organizeId);
					   contractnum.setYear(yearnow);
					   contractnum.setLastnum("0");
					   //contractnum.preInsert();
					   this.save(contractnum);
				 }
				contractNum = dao.getnum(organizeId);
				String year = contractNum.getYear();
				Integer lastnum = Integer.parseInt(contractNum.getLastnum());
				// 判断时间是否重置流水号或字段取出加一
				

				if (Integer.parseInt(yearnow) > Integer.parseInt(year)) {
					lastnum = 1;
				} else {
					lastnum++;
				}
				// 通过组织编号把最新流水号更新到数据库
				contractNum.setLastnum(String.valueOf(lastnum));
				contractNum.setYear(yearnow);
                contractNum.preUpdate();
				dao.updateByorganizdeId(contractNum);

				// 补零
				int len = lastnum.toString().length();
				if (len >= defaultlength) {
					fullnum.append("_").append(organizeId).append(yearnow)
							.append(lastnum);
				}
				int rest = defaultlength - len;
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < rest; i++) {
					sb.append("0");
				}
				String finalnum = sb.append(lastnum).toString();

				fullnum.append("_").append(organizeId).append("_").append(yearnow)
						.append("_").append(finalnum);

			}
			return fullnum.toString();

		}
	
}