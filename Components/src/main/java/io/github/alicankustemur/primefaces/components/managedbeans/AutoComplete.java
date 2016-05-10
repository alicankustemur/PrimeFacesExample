package io.github.alicankustemur.primefaces.components.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "autoComplete")
public class AutoComplete
{
	private String text;

	public List<String> complete(String query)
	{
		List<String> results = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
		{
			results.add(query + i);
		}
		return results;
	}

	public List<String> completeNew(String query)
	{
		List<String> someTexts = new ArrayList<String>();
		someTexts.add("Java");
		someTexts.add("Java Enterprise Edition");
		someTexts.add("Primefaces");
		someTexts.add("JSF");
		return someTexts;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

}
