package me.mickerd.tccore.shows.castle;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import me.mickerd.tccore.helpers.AStar;
import me.mickerd.tccore.main.m;

public class MagicalHeads implements Runnable {
	Player player = null;
	ArmorStand as = null;
	public MagicalHeads(Player p){
		player = p;
		Location start = new Location(Bukkit.getWorld("Hyperion_2016-07-16_10-23-50"),114,22,552);
		Bukkit.getScheduler().scheduleAsyncRepeatingTask(m.rpl(), this, 1L, 1L);
	    as = start.getWorld().spawn(start, ArmorStand.class);
	    as.setGravity(true);

		
		ItemStack is = new ItemStack(Material.LEATHER_HELMET);
		as.setHelmet(is);
		
	}
	Location[] path;
	Material[] mat;
	Byte[] data;
	@Override
	
	public void run() {
		Location end = new Location(Bukkit.getWorld("Hyperion_2016-07-16_10-23-50"),150,55,536);
		Vector loc = end.toVector();
		Bukkit.broadcastMessage(loc.toString());
		as.setVelocity(loc.normalize());
		}
	
}
		
		
	

