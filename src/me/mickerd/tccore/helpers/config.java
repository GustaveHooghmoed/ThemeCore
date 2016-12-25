package me.mickerd.tccore.helpers;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import me.mickerd.tccore.main.m;

public class config {

	public config(Plugin pl, FileConfiguration config) {
		enableStandaard(config);
	}

	private void enableStandaard(FileConfiguration config) {
		if(config.isSet("Enabled") == true){
			m.pl.reloadConfig();
			m.pl.saveConfig();
		} else {
			config.set("Enabled", true);
			config.set("Commands.enabled", "");
			m.pl.saveConfig();
		}
		
	}

}
