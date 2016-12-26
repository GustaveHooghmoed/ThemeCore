package me.mickerd.tccore.shows.castle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.util.Vector;

import me.mickerd.tccore.main.m;

public class ShowTimer {
	

	public static String secondsorminutes = "1 seconds";
	public static void startT(String minutesorseconds, Player p){
		Bukkit.getScheduler().runTaskLater(m.rpl(), new Runnable() {
			  @SuppressWarnings("deprecation")
			@Override
			  public void run() {
					ShowTwitter.tweet(1, minutesorseconds);
				    BroadCaster.cast("Starting in " + minutesorseconds);
				    	MagicalHeads mh1 = new MagicalHeads(p);
				        mh1.run();
			  }

			}, 0);
			}

	public void toggleLamp(){
		
	}
	public long getMinutesOrSeconds(int i) {
		if(secondsorminutes.contains("seconds")){
			Long ms2 = 20L*i;
			return ms2;
		} if(secondsorminutes.contains("minutes")){
			Long ms2 = 200L*i;
			return ms2;
		}
		return 20;
	}

	public static List<Location> deserializeListLoc(List<String> s){
        for (int i = 0; i < s.size(); i++){
          String ss = s.get(i);
          String[] st = ss.split(",");
          double ss1=Double.valueOf(st[1].replace("x=", ""));
          double ss2=Double.valueOf(st[2].replace("y=", ""));
          double ss3=Double.valueOf(st[3].replace("z=", ""));
          ArrayList<Location> Spawns = new ArrayList<>();
          Spawns.add(new Location(Bukkit.getWorld("disney"), ss1, ss2, ss3));
          return Spawns;
        }
        return null;
    }
 
	  public List<String> serializeListLoc(List<Location> s){
	        for (int i = 0; i < s.size(); i++){
	            Location l = s.get(i);
	            List<String> sp = new ArrayList<>();
	            sp.add(l.toString());
	            return sp;
	        }
	        return null;
	    }
	}
