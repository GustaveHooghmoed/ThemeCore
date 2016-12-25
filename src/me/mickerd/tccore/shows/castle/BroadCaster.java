package me.mickerd.tccore.shows.castle;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class BroadCaster {

	public static void cast(String mes) {
		String message = StringUtils.center(ChatColor.GREEN + mes, 40, '-');
		String message1 = StringUtils.center(ChatColor.GREEN + "Disney Castle", 40, '-');
		Bukkit.broadcastMessage(message);
		Bukkit.broadcastMessage(message1);
		
	}

}
