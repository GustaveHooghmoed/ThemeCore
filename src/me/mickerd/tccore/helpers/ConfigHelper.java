package me.mickerd.tccore.helpers;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.mickerd.tccore.main.m;

public class ConfigHelper {
	
	public static File file;
	private static FileConfiguration special;


	public static void createConfig() {
	    try {
	        if (!m.rpl().getDataFolder().exists()) {
	        	m.rpl().getDataFolder().mkdirs();
	        }
	        file = new File(m.rpl().getDataFolder(), "parade.show");
	        if (!file.exists()) {
	        	m.rpl().getLogger().info("parade.show not found, creating!");
	        	m.rpl().saveDefaultConfig();
	        	special = new YamlConfiguration();
	        } else {
	        	m.rpl().getLogger().info("parade.show found, loading!");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();

	    }

	}
	
    public static FileConfiguration loadConfig(File file2) {
        	return special;
	}

	public FileConfiguration getSpecialConfig() {
        return this.special;
    }

}
