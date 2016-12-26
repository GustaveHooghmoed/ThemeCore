package me.mickerd.tccore.shows.parade;

import org.bukkit.Location;

public class LocationBuilder {

	public static Location build(String info, String info2, String info3) {
		int object1231= Integer.valueOf(info);
		int object1232= Integer.valueOf(info2);
		int object1233= Integer.valueOf(info3);
		Location loc =new Location(ParadeMain.getWorld(),object1231,object1232,object1233);
		return loc;
	}

}
