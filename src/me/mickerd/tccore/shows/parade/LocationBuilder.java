package me.mickerd.tccore.shows.parade;

import org.bukkit.Location;

public class LocationBuilder {

	public static Location build(int x, int y, int z) {
		Location loc =new Location(ParadeMain.getWorld(),x,y,z);
		return loc;
	}

}
