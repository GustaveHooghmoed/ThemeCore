package me.mickerd.tccore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.mickerd.tccore.main.m;

public class Reload {
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args)
	  {
		m.rpl().saveConfig();
	      m.rpl().reloadConfig();
		return false;
	      
	  }
}
