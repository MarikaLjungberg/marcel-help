package marcel_help.model;

import java.util.ArrayList;
import java.util.Arrays;

public class HelpList {
	private String helper;
	private ArrayList<String> helpList;
	
	public HelpList() {}
	
	public HelpList(String helper) {
		this.setHelper(helper);
		this.setHelpList(new ArrayList<>(Arrays.asList("Ika", "Marika")));;
	}

	public String getHelper() {
		return helper;
	}

	public void setHelper(String helper) {
		this.helper = helper;
	}

	public ArrayList<String> getHelpList() {
		return helpList;
	}

	public void setHelpList(ArrayList<String> helpList) {
		this.helpList = helpList;
	}

}
