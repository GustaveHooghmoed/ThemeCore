package me.mickerd.tccore.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import me.mickerd.tccore.commands.Castle;
import me.mickerd.tccore.commands.TCTwitter;
import me.mickerd.tccore.commands.TCTwitter2;
import me.mickerd.tccore.helpers.ThemeLog;
import me.mickerd.tccore.helpers.config;
import me.mickerd.tccore.helpers.iPWDLWarning;

public class m extends JavaPlugin implements PluginMessageListener {
	public static Plugin pl = null;
	public void onEnable(){
		pl = this;
		getCommand("castle").setExecutor(new Castle());
		getCommand("twitter").setExecutor(new TCTwitter());
		getCommand("twitter2").setExecutor(new TCTwitter2());
		config configclass = new config(pl,pl.getConfig());
	    getServer().getMessenger().registerIncomingPluginChannel(this, "WDL|INIT", this);
	    getServer().getMessenger().registerOutgoingPluginChannel(this, "WDL|CONTROL");
	}
	
	public void onDisable(){
		pl = null;

	    getServer().getMessenger().unregisterIncomingPluginChannel(this, "WDL|INIT");
	    getServer().getMessenger().unregisterOutgoingPluginChannel(this, "WDL|CONTROL");
	}
	
	public static Plugin rpl(){
		return pl;
		
	}
	  public void onPluginMessageReceived(String channel, Player player, byte[] data)
	  {
	    if ((channel.equals("WDL|INIT")) && 
	      (!player.hasPermission("tcwdl.bypass"))) {
	      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + player.getName());

	      if(iPWDLWarning.check(player.getAddress().getAddress().toString()) == true){
	    	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "banip " +  player.getAddress().getAddress().toString()); 
		      ThemeLog.log("IPBanned " + player.getName() + " for WDL", "TC-AntiWDL");
   }
	      ThemeLog.log("Banned " + player.getName() + " for WDL", "AntiWDL");
	      iPWDLWarning.ip.add(player.getAddress().getAddress().toString());
	    }
	  }
	  
	  

}
