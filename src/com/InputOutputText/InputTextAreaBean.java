package com.InputOutputText;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="TextArea")
public class InputTextAreaBean {
	
	
	public List<String> populateTextArea(String query)
	{
		List<String> results = new ArrayList<>();
		
		if(query.equalsIgnoreCase("ripplescode"))
		{
			results.add("Ripples Code Rock!!!");
			results.add("Ripples Code is an amazing channel!!");
		}
		
		else
		{
			for(int i = 0; i<10; i++)
			{
				results.add(query + i);
			}
		}
		
		return results;
	}

}
