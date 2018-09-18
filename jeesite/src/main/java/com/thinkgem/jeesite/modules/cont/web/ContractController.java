package com.thinkgem.jeesite.modules.cont.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.cont.entity.Contract;
import com.thinkgem.jeesite.modules.cont.service.ContractService;

/**
 * 合同controller
 * @author XK
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/cont/contract")
public class ContractController extends BaseController {
	
	//注入合同service层
	@Autowired
	private ContractService contractService;
	
	/**
	 * 根据ID获取合同信息
	 * @param id
	 * @return
	 */
	@ModelAttribute
	public Contract get (@RequestParam(required = false)String id) {
		Contract entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = contractService.get(id);
		}
		if (entity == null) {
			entity  = new Contract();
		}
		return entity;
	}
	
	@RequiresPermissions("cont:contract:view")
	@RequestMapping(value = {"list", ""})
	public String list (Contract contract, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Contract> page = contractService.find(new Page<Contract>(request, response), contract);
		model.addAttribute("page", page);
		return "modules/cont/contractList";
	}
	
	@RequiresPermissions("cont:contract:view")
	@RequestMapping(value = "form")
	public String form (Contract contract, Model model) {
		model.addAttribute("contract", contract);
		return "modules/cont/contractForm";
	}
	
	@RequiresPermissions("cont:contract:edit")
	@RequestMapping(value = "save")
	public String save(Contract contract, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, contract)){
			return form(contract, model);
		}
		contractService.save(contract);
		addMessage(redirectAttributes, "保存合同'" + contract.getContractName() + "'成功");
		return "redirect:" + adminPath + "/cont/contract/?repage";
	}
	
	@RequiresPermissions("cont:contract:edit")
	@RequestMapping(value = "delete")
	public String delete(Contract contract, RedirectAttributes redirectAttributes) {
		contractService.delete(contract);
		addMessage(redirectAttributes, "删除合同成功");
		return "redirect:" + adminPath + "/cont/contract/?repage";
	}

}
