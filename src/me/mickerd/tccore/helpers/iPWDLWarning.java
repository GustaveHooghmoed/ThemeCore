package me.mickerd.tccore.helpers;

import java.util.List;

import me.mickerd.tccore.main.m;

public class iPWDLWarning {

	@SuppressWarnings("unchecked")
	public static boolean check(String string) {
		 List<String> ip = (List<String>) m.pl.getConfig().getList("ipWDLwarning");
		 if(ip.contains(string)){
			 return true;
		 } else {
		return false;
		 }
	}
	
	

}
