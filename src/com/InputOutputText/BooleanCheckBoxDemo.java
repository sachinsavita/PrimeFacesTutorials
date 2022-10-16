package com.InputOutputText;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean (name="BooleanCheckBox")
public class BooleanCheckBoxDemo {
	
private boolean check;
	
	public boolean isCheck()
	{
		return check;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}

	public void addMessage()
	{
		String detail = check ? "Accepted" : "Not Accespted";
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(detail));
		
	}

}
