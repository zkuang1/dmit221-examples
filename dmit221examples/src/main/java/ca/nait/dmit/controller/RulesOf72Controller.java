package ca.nait.dmit.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import util.JSFUtil;

import ca.nait.dmit.domain.RulesOf72;

@ManagedBean(name="rulesOf72Bean")
@ViewScoped
public class RulesOf72Controller {

	private RulesOf72 rulesOf72 = new RulesOf72();

	public RulesOf72 getRulesOf72() {
		return rulesOf72;
	}

	public void setRulesOf72(RulesOf72 rulesOf72) {
		this.rulesOf72 = rulesOf72;
	}
	
	public void submit() {
		JSFUtil.addInfoMessage("It takes " + rulesOf72.getYearsToDouble() + " years to double your money.");
	}
	
}
