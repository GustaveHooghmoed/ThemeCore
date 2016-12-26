package me.mickerd.tccore.shows.parade;

import org.bukkit.entity.ArmorStand;

public class ArmorstandPropert {

	public static ArmorStand setCastMember(ArmorStand as) {
		as.setChestplate(ItemStacks.castplate);
		as.setBoots(ItemStacks.castboots);
		return as;
	}

}
