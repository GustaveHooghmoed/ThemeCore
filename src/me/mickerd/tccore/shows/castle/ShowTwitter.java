package me.mickerd.tccore.shows.castle;

import org.bukkit.Bukkit;

public class ShowTwitter {
	
	static boolean enabled = true;
	public static boolean tweet(int i,String minutesorseconds){
		if(enabled = true){
			if(i == 1)
			{

				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "twitter2 The Magical Castle show will be performed in " + minutesorseconds +"!");
				return true;
			}
			
	} else {
		return false;
	}
		return false;
	}

}
