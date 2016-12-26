package me.mickerd.tccore.shows.parade;

import java.util.Vector;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;

import me.mickerd.tccore.helpers.ConfigHelper;
import me.mickerd.tccore.main.m;

public class ParadeMain implements CommandExecutor, Runnable {

	public static World getWorld() {
		World w = Bukkit.getWorld("Hyperion_2016-07-16_10-23-50");
		return w;
	}

	ArmorStand cm = null;
	int x =0;
	int z= 0;
	int y=0;
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(args[0].equalsIgnoreCase("spawn")){
			if(args[1].equalsIgnoreCase("castmember")){
				x = Integer.valueOf(args[2]);
				y = Integer.valueOf(args[3]);
				z = Integer.valueOf(args[4]);
		        cm =  CastMember.CastMemberSpawn(x,y,z);
		        Location loc = LocationBuilder.build(x, y, z);
				org.bukkit.util.Vector v = loc.toVector();
				cm.setVelocity(v.normalize().multiply(ConfigHelper.loadConfig(ConfigHelper.file).getDouble("parade.speed")));
			}
		}
		return false;
	}

	@Override
	public void run() {
		
		
	}

}
