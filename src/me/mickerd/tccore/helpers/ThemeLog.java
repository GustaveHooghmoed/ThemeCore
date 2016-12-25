package me.mickerd.tccore.helpers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ThemeLog {

	public static void log(String string, String string2) {
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "" + string2 + " " + string);
	}

}
