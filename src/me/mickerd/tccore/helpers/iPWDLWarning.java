package me.mickerd.tccore.helpers;

import java.util.List;

import me.mickerd.tccore.main.m;

public class iPWDLWarning {

	public static List<String> ip = (List<String>) m.pl.getConfig().getList("ipWDLwarning");

	public static boolean check(String string) {
		 if(ip.contains(string)){
			 return true;
		 } else {
		return false;
		 }
	}
	
	

}
