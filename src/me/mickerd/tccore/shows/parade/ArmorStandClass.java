package me.mickerd.tccore.shows.parade;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;

public class ArmorStandClass {
	
	public static ArmorStand spawn(Location loc){
		World w = ParadeMain.getWorld();
		ArmorStand as = w.spawn(loc, ArmorStand.class);
		return as;
	}
	
	public static void setCastMember(ArmorStand as){
		ArmorstandPropert.setCastMember(as);
		as.setCustomName("CastMemberParade");
	}

}
