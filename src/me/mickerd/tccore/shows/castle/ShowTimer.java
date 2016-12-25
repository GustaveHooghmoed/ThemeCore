package me.mickerd.tccore.shows.castle;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

import me.mickerd.tccore.main.m;

public class ShowTimer {
	

	public static String secondsorminutes = "1 seconds";
	public static void startT(String minutesorseconds){
		Long ms3 = getMinutesOrSeconds(1);
		Bukkit.getScheduler().runTaskLater(m.rpl(), new Runnable() {
			  @Override
			  public void run() {
					ShowTwitter.tweet(1, minutesorseconds);
				    BroadCaster.cast("Starting in " + minutesorseconds);
					final ArrayList<String> Locations = new ArrayList<String>();
					Locations.add(LampLocs.een.toString());
					Locations.add(LampLocs.twee.toString());
					List<Location> list1234 = deserializeListLoc(Locations);
					toggeLamp(list1234, false);
			  }

			private void toggeLamp(List<Location> locations, boolean bol1) {
				if(bol1 = false){
					bol1 = true;
				for(Location loc : locations){
			Block b = loc.getBlock();
			if(b.getType() == Material.STONE){
				b.setType(Material.REDSTONE_BLOCK);
				bol1 = false;
			}
				}
				}
			}
			}, ms3);
	}

	public void toggleLamp(){
		
	}
	public static long getMinutesOrSeconds(int i) {
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
 
	  public static List<String> serializeListLoc(List<Location> s){
	        for (int i = 0; i < s.size(); i++){
	            Location l = s.get(i);
	            List<String> sp = new ArrayList<>();
	            sp.add(l.toString());
	            return sp;
	        }
	        return null;
	    }
}
