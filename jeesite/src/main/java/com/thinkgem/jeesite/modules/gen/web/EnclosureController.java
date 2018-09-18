/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thinkgem.jeesite.modules.session.WssmLoginResultVo;
import com.alibaba.fastjson.JSON;
import com.ccpws.business.ICommonContentManageBusinessService;
import com.ccpws.business.ICommonContentManageBusinessServiceProxy;
import com.ccpws.business.PropertyInfo;
import com.ccpws.business.WscsRetrieveDocumentpropertysResultVo;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.cont_num.service.TContractNumService;
import com.thinkgem.jeesite.modules.gen.entity.ContractFile;
import com.thinkgem.jeesite.modules.gen.entity.CtrContract;
import com.thinkgem.jeesite.modules.gen.service.ContractFileService;
import com.thinkgem.jeesite.modules.gen.service.CtrContractService;
import com.thinkgem.jeesite.modules.session.ISessionManageBusinessService;
import com.thinkgem.jeesite.modules.session.ISessionManageBusinessServiceService;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.service.SystemService;

/**
 * 附件信息表Controller
 * @author YangDong
 * @version 2017-02-18
 */
@Controller
@RequestMapping(value = "${adminPath}/gen/enclosure")
public class EnclosureController extends BaseController {

	@Autowired
	private CtrContractService ctrContractService;
	@Autowired
	private TContractNumService tContractNumService;
	@Autowired
	private ContractFileService contractFileService;
	
	@Autowired
	private SystemService systemService;
	
	@ModelAttribute
	public User get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return systemService.getUser(id);
		}else{
			return new User();
		}
	}
	/**
	 * @Title: list
	 * @Description: 合同表信息查询及合同附件信息查询
	 * @param ctrContract
	 * @param model
	 * @author yd
	 */
	//@RequiresPermissions("gen:enclosure:view")
	@RequestMapping(value = "list")
	public String list(CtrContract ctrContract, Model model) {
//			String code = null;
//			List<CtrContract> tableList = ctrContractService.list(ctrContract); //获取合同信息表数据
//			for(int i=0; i<tableList.size(); i++) {
//				CtrContract ctr = tableList.get(i);
//				  code = ctr.getCode();
//				  String contractName = ctr.getContractName();
//				  String projectName = ctr.getProjectName();
//				  String contractType = ctr.getContractType();
//				  String contractSort = ctr.getContractSort();
//				  String contractLevel = ctr.getContractLevel();
//				  String contractSource = ctr.getContractSource();
//				
//				  model.addAttribute("code", code);
//				  model.addAttribute("contractName",contractName);
//				  model.addAttribute("projectName",projectName);
//				  model.addAttribute("contractType",contractType);
//				  model.addAttribute("contractSort",contractSort);
//				  model.addAttribute("contractLevel",contractLevel);
//				  model.addAttribute("contractSource",contractSource);
//			}
//			List<ContractFile> contraList = contractFileService.list(new ContractFile());//获取合同附件表信息数据
//			List list = new ArrayList();
//			for(int i=0; i<contraList.size(); i++){
//				Map map = new HashMap();
//				ContractFile con = contraList.get(i);
//				String id= con.getId();
//				Date uploadDate1 = con.getUploadDate();
//				String uploadDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(uploadDate1);
//				String fileName = con.getFileName();
//				String name = con.getName();
//				String fileNote = con.getFileNote();
//				String fileSort = con.getFileSort();
//				int fileVersion = con.getFileVersion();
//				map.put("crtContractId", code);
//				map.put("id",id);
//				//map.put("uploadDate",uploadDate);
//				map.put("fileName",fileName);
//				map.put("name",name);
//				map.put("fileNote",fileNote);
//				map.put("fileSort",fileSort);
//				map.put("fileVersion",fileVersion);
//				map.put("uploadDate",uploadDate);
//				list.add(map);
//			}
//			model.addAttribute("list",list);
		
	
		return "modules/gen/enclosure";
	}
	/**
	 * @Title: get
	 * @Description: 附件上传时验证合同表是否保存
	 * @param ctrContract
	 * @param model
	 * @param code
	 * @author yd
	 */
	@RequestMapping(value = "get")
	public String get(CtrContract ctrContract, Model model, String code){
		CtrContract state = ctrContractService.get(code);
		if("".equals(state) || state == null){
			model.addAttribute("message", "请先保存数据");
			return "modules/gen/enclosure";
		}
		model.addAttribute("crtContractId",code);
		return "modules/gen/enclosureInfo";
	}
	
	@RequestMapping(value = "ces")
	public String ces(CtrContract ctrContract, Model model, String code){
		model.addAttribute("crtContractId",code);
		return "modules/gen/enclosureInfo";
	}
	@RequestMapping(value = "hc")
	public String hc(CtrContract ctrContract, Model model){
		this.list(ctrContract, model);
		return "modules/gen/enclosure";
	}
	
	/**
	 * @Title: sc
	 * @Description: 调用接口获取上传信息
	 * @param ctrContract
	 * @param model
	 * @param code
	 * @author yd
	 */
	@RequestMapping(value = "sc")
	@ResponseBody
	public Map<String, String> sc(CtrContract ctrContract, Model model, String code){
		Map<String, String> map = new HashMap<>();
		ISessionManageBusinessService session = new ISessionManageBusinessServiceService().getISessionManageBusinessServicePort();
		WssmLoginResultVo wssmLoginResultVo =session.login(UUID.randomUUID().toString(), "fnadmin", "P@ssw0rd", "BJ001");
		String sessionId = wssmLoginResultVo.getBody().getSessionId();
		String nameImage = wssmLoginResultVo.getBody().getUploadUrl();
		map.put("sessionId",sessionId);
		map.put("nameImage",nameImage);
		map.put("crtContractId",code);
		return map;
	}

	/**
	 * @Title: upsc
	 * @Description: 调用ECM接口更新附件类型
	 * @param ctrContract
	 * @param model
	 * @param code
	 * @author yd
	 */
	@RequestMapping(value = "upsc")
	public Map<String, String> upsc(CtrContract ctrContract, String code, String id, Model model) throws RemoteException{
		Map<String, String> map = new HashMap<>();
		ISessionManageBusinessService session = new ISessionManageBusinessServiceService().getISessionManageBusinessServicePort();
		WssmLoginResultVo wssmLoginResultVo =session.login(UUID.randomUUID().toString(), "fnadmin", "P@ssw0rd", "BJ001");
		String sessionId = wssmLoginResultVo.getBody().getSessionId();
		String nameImage = wssmLoginResultVo.getBody().getUploadUrl();
		ICommonContentManageBusinessService file = new ICommonContentManageBusinessServiceProxy().getICommonContentManageBusinessService();
		PropertyInfo p = new PropertyInfo();
		p.setPropertyName("ContractCode");
		p.setPropertyValue(code);
		PropertyInfo p1 = new PropertyInfo();
		p1.setPropertyName("ContractManageType");
		p1.setPropertyValue("正文类");
		PropertyInfo p2 = new PropertyInfo();
		p2.setPropertyName("ParentContractCode");
		p2.setPropertyValue(code);
		PropertyInfo p3 = new PropertyInfo();
		p3.setPropertyName("isSubContract");
		p3.setPropertyValue("Y");
		
		PropertyInfo[] ps = new PropertyInfo[4];
		ps[0]=p;
		ps[1]=p1;
		ps[2]=p2;
		ps[3]=p3;
		WscsRetrieveDocumentpropertysResultVo vo = file.updateDocumentProperties(UUID.randomUUID().toString(), sessionId, id, ps);
		map.put("sessionId",sessionId);
		map.put("nameImage",nameImage);
		map.put("crtContractId",code);
		return map;
	}
	
	/**
	 * @Title: save
	 * @Description: 保存合同表信息
	 * @param ctrContract
	 * @param response
	 * @param request
	 * @param model
	 * @author yd
	 */
	@RequestMapping(value = "save")
	public String save(CtrContract ctrContract, HttpServletResponse response, HttpServletRequest request, Model model) {
		String code = request.getParameter("code");
		String contractName = request.getParameter("contractName");
		String projectName = request.getParameter("projectName");
		String contractType = request.getParameter("contractType");
		String contractSort = request.getParameter("contractSort");
		String contractLevel = request.getParameter("contractLevel");
		String contractSource = request.getParameter("contractSource");
		CtrContract coid =  ctrContractService.get(code);
		if(coid == null || "".equals(coid)){
			ctrContract.setCode(code);
			ctrContract.setContractName(contractName);
			ctrContract.setProjectName(projectName);
			ctrContract.setContractType(contractType);
			ctrContract.setContractSort(contractSort);
			ctrContract.setContractLevel(contractLevel);
			ctrContract.setContractSource(contractSource);
			ctrContractService.save(ctrContract);
		}else{
			ctrContract.setCode(code);
			ctrContract.setContractName(contractName);
			ctrContract.setProjectName(projectName);
			ctrContract.setContractType(contractType);
			ctrContract.setContractSort(contractSort);
			ctrContract.setContractLevel(contractLevel);
			ctrContract.setContractSource(contractSource);
			ctrContractService.update(ctrContract);
		}
		model.addAttribute("message", "保存用户信息成功");
		this.list(ctrContract, model);
		return "modules/gen/enclosure";
	}
	/**
	 * @Title: saveEnclosure
	 * @Description: 保存附件表信息
	 * @param ctrContract
	 * @param model
	 * @param response
	 * @param request
	 * @author yd
	 * @return 
	 */
	@RequiresPermissions("user")
	@RequestMapping(value = "saveEnclosure")
	public String saveEnclosure(CtrContract ctrContract, Model model, HttpServletResponse response, HttpServletRequest request) throws Exception{
	    Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = formatter.format(currentTime);
	    Date date = formatter.parse(dateString);
		String crtContractId = request.getParameter("crtContractId");
		String cid = request.getParameter("cid");
		String fileSort = request.getParameter("fileSort");	
		String name = request.getParameter("name");
		String nameImage = request.getParameter("nameImage");
		String fileNote = request.getParameter("fileNote");
		String upfi = request.getParameter("upfi");
		int pos = upfi.lastIndexOf("\\");
		String ss = upfi.substring(pos+1);  
		List<ContractFile> contraList = contractFileService.list(new ContractFile());
		if(contraList.isEmpty()){
			ContractFile contractFile = new ContractFile();
	        contractFile.setCrtContractId(crtContractId);
	        contractFile.setFileSort(fileSort);
	        contractFile.setName(name);
	        contractFile.setFilePosition(nameImage);
	        contractFile.setFileName(ss);
	        contractFile.setFileNote(fileNote);
	        contractFile.setFileAuthor(cid);
	        contractFile.setUploadDate(date);
	        contractFileService.save(contractFile);
		}else{
			for(int i=0; i<contraList.size(); i++){
				ContractFile con = contraList.get(i);
				String f = con.getName();
				if(name.equals(f)){
					model.addAttribute("message", "附件名称重复请重新输入");
					model.addAttribute("crtContractId", crtContractId);
					return "modules/gen/enclosureInfo";
				}else{
					if(i==contraList.size()-1 && !name.equals(f)){
						ContractFile contractFile = new ContractFile();
						contractFile.setCrtContractId(crtContractId);
				        contractFile.setFileSort(fileSort);
				        contractFile.setName(name);
				        contractFile.setFilePosition(nameImage);
				        contractFile.setFileName(ss);
				        contractFile.setFileNote(fileNote);
				        contractFile.setFileAuthor(cid);
				        contractFile.setUploadDate(date);
				        contractFileService.save(contractFile);
					}else{
						continue;
					}
				}
			}
		}
		model.addAttribute("message", "保存成功");
		model.addAttribute("crtContractId", crtContractId);
		return "modules/gen/enclosureInfo";
	}
	/**
	 * @Title: getEnclosure
	 * @Description: 获取附件表更新信息
	 * @param contractFile
	 * @param model
	 * @param s
	 * @author yd
	 */
	@RequestMapping(value = "getEnclosure")
	public String getEnclosure(ContractFile contractFile, Model model, String s){
		ISessionManageBusinessService session = new ISessionManageBusinessServiceService().getISessionManageBusinessServicePort();
		WssmLoginResultVo wssmLoginResultVo =session.login(UUID.randomUUID().toString(), "fnadmin", "P@ssw0rd", "BJ001");
		String sessionId = wssmLoginResultVo.getBody().getSessionId();
		List<CtrContract> tableList = ctrContractService.list(new CtrContract());
		String code = null;
		for(int i=0; i<tableList.size(); i++) {
			CtrContract ctr = tableList.get(i);
			  code = ctr.getCode();
		}
		ContractFile cont = contractFileService.get(s);
		String fileSort = cont.getFileSort();
		String name = cont.getName();
		String fileNote = cont.getFileNote();
		String fileAuthor = cont.getFileAuthor();
		String fileName = cont.getFileName();
		String nameImage = cont.getFilePosition();
		
		model.addAttribute("id",s);
		model.addAttribute("name",name);
		model.addAttribute("fileNote",fileNote);
		model.addAttribute("crtContractId",code);
		model.addAttribute("fileSort",fileSort);
		model.addAttribute("fileAuthor",fileAuthor);
		model.addAttribute("fileName",fileName);
		model.addAttribute("sessionId",sessionId);
		model.addAttribute("nameImage", nameImage);
		return "modules/gen/enclosureUpdate";
	}
	/**
	 * @Title: update
	 * @Description: 更新附件信息
	 * @param ctrContract
	 * @param model
	 * @param request
	 * @author yd
	 */
	@RequestMapping(value = "update")
	public String update(CtrContract ctrContract, Model model, HttpServletRequest request) throws Exception{
		String s = request.getParameter("id");
		ContractFile cont = contractFileService.get(s);
		int version = cont.getFileVersion();
		//int file = 0;
		ContractFile contractFile = new ContractFile();
	 /* for(version=version; version<=20; version++){
		  file = version+=1;
        	break;
       }*/
	  String cid = request.getParameter("cid");
	  String fileSort =request.getParameter("fileSort");
	  String fileNote = request.getParameter("fileNote");
	  String fileName = request.getParameter("fileName");
	  String nameImage = request.getParameter("nameImage");  
	  String upfi = request.getParameter("upfi");
	  int pos = upfi.lastIndexOf("\\");
	  String ss = upfi.substring(pos+1); 
	  if("".equals(ss) || null ==ss){
		  contractFile.setFileName(fileName);
	  }else{
		  contractFile.setFileName(ss);
	  }
	  Date currentTime = new Date();
	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  String dateString = formatter.format(currentTime);
	  Date date = formatter.parse(dateString);
	  contractFile.setId(s);
      contractFile.setFileSort(fileSort);
      contractFile.setFilePosition(nameImage);
      contractFile.setFileNote(fileNote);
      contractFile.setFileAuthor(cid);
      contractFile.setUploadDate(date);
	  contractFile.setFileVersion(version);
	  contractFileService.update(contractFile);
	  this.getEnclosure(contractFile, model, s);
	  model.addAttribute("message", "更新成功");
	  return "modules/gen/enclosureUpdate";
	}
	/**
	 * @Title: download
	 * @Description: 附件信息下载
	 * @param s
	 * @param model
	 * @param request
	 * @param response
	 * @author yd
	 */
	@RequestMapping(value="download")
	@ResponseBody
	public Map<String, String> download(String s , Model model, HttpServletRequest request , HttpServletResponse response){
		Map<String, String> map = new HashMap<>();
		ISessionManageBusinessService session = new ISessionManageBusinessServiceService().getISessionManageBusinessServicePort();
		WssmLoginResultVo wssmLoginResultVo =session.login(UUID.randomUUID().toString(), "fnadmin", "P@ssw0rd", "BJ001");
		String sessionId = wssmLoginResultVo.getBody().getSessionId();
		ContractFile cont = contractFileService.get(s);
		String cid = cont.getFileAuthor();
		System.out.println("cid==="+cid);
		map.put("sessionId",sessionId);
		map.put("cid",cid);
		return map;
	}
	
	/**
	 * @Title: delete
	 * @Description: 附件信息删除
	 * @param ctrContract
	 * @param model
	 * @param request
	 * @param s
	 * @author yd
	 */
	@RequestMapping(value="delete")
	public String delete(CtrContract ctrContract, Model model, HttpServletRequest request, String s){
		contractFileService.delete(s);
		model.addAttribute("","删除成功");
		this.list(ctrContract, model);
		return "modules/gen/enclosure";
	}
	
}
