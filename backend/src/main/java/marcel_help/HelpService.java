package marcel_help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marcel_help.model.HelpList;

@Service
public class HelpService {
	
	@Autowired
	private HelpRepository helpRepository;

	public HelpList postHelp(String userName, String name) {
		return helpRepository.postHelp(userName, name);
	}

	public HelpList getHelpList(String userName) {
		return helpRepository.getHelpList(userName);
	}

	public HelpList deleteNameFromHelpList(String userName, String name) {
		return helpRepository.deleteNameFromHelpList(userName, name);
	}

	public HelpList deleteHelpList(String userName) {
		return helpRepository.deleteHelpList(userName);
	}

	public HelpList createHelpList(String userName) {
		return helpRepository.createHelpList(userName);
	}

}
