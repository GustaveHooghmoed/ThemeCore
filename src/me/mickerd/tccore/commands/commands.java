package me.mickerd.tccore.commands;

import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import me.mickerd.tccore.helpers.ThemeLog;

public class commands {
	
	
	
	public commands(Plugin pl, FileConfiguration config){
		boolean enabled = config.getBoolean("Enabled");
		register(pl,config,enabled);
	}

	@SuppressWarnings("unchecked")
	private void register(Plugin pl, FileConfiguration config, boolean enabled) {
		 if(enabled = true){
			 List<String> enabledcmnds = (List<String>) config.getList("Commands.enabled");
			 if(enabledcmnds.size() == 0){
				 ThemeLog.log("No commands enabled!", this.getClass().getName());
			 } else if(enabledcmnds.size() > 0){
			     if(enabledcmnds.equals("parade")){
			    	 ParadeCommand pc = new ParadeCommand("tc-parade", "/<command>", "paradeCommand");
			         pc.register();
			     } else {
					 ThemeLog.log("Error!", this.getClass().getName());
			     }
			 } else {
				 ThemeLog.log("No commands enabled", this.getClass().getName());
				 
				 
				 
			 		 }
		 }
		
	}

}
