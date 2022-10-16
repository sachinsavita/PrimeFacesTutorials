package com.InputOutputText;

import javax.faces.bean.ManagedBean;   
import javax.faces.bean.RequestScoped;   

@ManagedBean   (name="InputText", eager = true)
@RequestScoped   

public class InputTextBean {   
   String message;   
   public String getMessage() {   
      return message;   
   }   
   public void setMessage(String message) {   
      this.message = message;   
   }   
} 
