package me.mickerd.tccore.shows.parade;

import java.util.Vector;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ArmorStand;

import me.mickerd.tccore.helpers.ConfigHelper;
import me.mickerd.tccore.main.m;

public class ParadeMain implements CommandExecutor, Runnable {

	public static World getWorld() {
		World w = Bukkit.getWorld("Hyperion_2016-07-16_10-23-50");
		return w;
	}

	ArmorStand cm = null;
	String x =null;
	String z= null;
	String y= null;
	private int countcm = 127;
	private int taskIdCM = 1;
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(args[0].equalsIgnoreCase("spawn")){
			if(args[1].equalsIgnoreCase("castmember")){
				x = args[2];
				y = args[3];
				z = args[4];
		        cm =  CastMember.CastMemberSpawn(x,y,z);
		        taskIdCM = Bukkit.getScheduler().scheduleAsyncRepeatingTask(m.rpl(), this, 2L, 2L);
			}
		}
		return false;
	}
	ConfigHelper cnfg = null;
	String fconfig = null;
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			cnfg = new ConfigHelper();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(countcm == 0){
			Bukkit.getScheduler().cancelTask(taskIdCM);
			countcm = Integer.valueOf(ConfigHelper.getInfo("length"));
		} else {
		countcm --;
		Location loc;
		try {
			loc = LocationBuilder.build(ConfigHelper.getInfo("x1"),ConfigHelper.getInfo("y1"),ConfigHelper.getInfo("z1"));
			org.bukkit.util.Vector v = loc.toVector();
			cm.setVelocity(v.normalize());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		
	}
	}
}
