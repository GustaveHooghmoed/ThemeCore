package me.mickerd.tccore.main;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.mickerd.tccore.commands.commands;
import me.mickerd.tccore.helpers.config;

public class m extends JavaPlugin {
	public static Plugin pl = null;
	public void onEnable(){
		pl = this;
		commands commandsClass = new commands(pl,pl.getConfig());
		config configclass = new config(pl,pl.getConfig());
	}
	
	public void onDisable(){
		pl = null;
	}

}
