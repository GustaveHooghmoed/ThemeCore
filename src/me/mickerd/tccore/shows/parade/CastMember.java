package me.mickerd.tccore.shows.parade;

import org.bukkit.entity.ArmorStand;

public class CastMember {
	
	public static ArmorStand CastMemberSpawn(int x,int y, int z){
		ArmorStand as = ArmorStandClass.spawn(LocationBuilder.build(x,y,z));
		ArmorStandClass.setCastMember(as);
		return as;
	}

}
