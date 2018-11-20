package marcel_help;

import org.springframework.web.bind.annotation.RestController;

import marcel_help.model.HelpList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class HelpController {
	
	@Autowired
	private HelpService helpService;
	
	@PostMapping("/userName/{userName}")
	@ResponseBody
	public HelpList createHelpList(@PathVariable String userName) {
		System.out.println("Creating helplist for " + userName);
		return helpService.createHelpList(userName);
	}
	
	@GetMapping("/userName/{userName}")
	@ResponseBody
	public HelpList getHelpList(@PathVariable String userName) {
		System.out.println("Getting helplist for " + userName);
		return helpService.getHelpList(userName);
	}
    
    @PostMapping("/userName/{userName}/addName/{name}")
    public HelpList askForHelp(@PathVariable String userName, @PathVariable String name) {
        return helpService.postHelp(userName, name);
    }
    
    @DeleteMapping("/userName/{userName}/removeName/{name}")
    public HelpList deleteNameFromHelpList(@PathVariable String userName, @PathVariable String name) {
    	return helpService.deleteNameFromHelpList(userName, name);
    }
    
    @DeleteMapping("/userName/{userName}")
    public HelpList deleteHelpList(@PathVariable String userName) {
    	return helpService.deleteHelpList(userName);
    }
}
