package marcel_help;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import marcel_help.model.HelpList;

@Repository
public class HelpRepository {
	
	private ArrayList<HelpList> helpListStore = new ArrayList<HelpList>();
	
	public HelpRepository() {}
	
	
	public HelpList postHelp(String userName, String name) {
		this.getHelpList(userName).getHelpList().add(name);
		return this.getHelpList(userName);
	}

	public HelpList getHelpList(String userName) {
		return this.helpListStore.stream()
				.filter(helpList -> helpList.getHelper().equals(userName))
				.findFirst().get(); // TODO: findFirst() returns optional, if cannot get() should throw error
	}

	public HelpList deleteNameFromHelpList(String userName, String name) {
		this.getHelpList(userName).getHelpList().remove(name);
		// TODO: catch error did not find name in list
		return this.getHelpList(userName);
	}

	public HelpList deleteHelpList(String userName) {
		this.getHelpList(userName).setHelpList(new ArrayList<String>());
		return this.getHelpList(userName);
	}

	public HelpList createHelpList(String userName) {
		this.helpListStore.add(new HelpList(userName));
		return this.getHelpList(userName);
	}

}
