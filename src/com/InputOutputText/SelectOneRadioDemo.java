package com.InputOutputText;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="SOR")
public class SelectOneRadioDemo {
	
	
	private String option;
	String test;
	
	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		
		this.option = option;
		 
		
	}
	

}
