package com.InputOutputText;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="SOR")
public class SelectOneRadioDemo {
	
	
	private String option;

	
	public String getOption() {
		return option;
	} 

	public void setOption(String option) {
		this.option = option;
		System.out.println(option);
		
	}
	

}
