package me.mickerd.tccore.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import me.mickerd.tccore.commands.commands;
import me.mickerd.tccore.helpers.config;

public class m extends JavaPlugin implements PluginMessageListener {
	public static Plugin pl = null;
	public void onEnable(){
		pl = this;
		commands commandsClass = new commands(pl,pl.getConfig());
		config configclass = new config(pl,pl.getConfig());
	    getServer().getMessenger().registerIncomingPluginChannel(this, "WDL|INIT", this);
	    getServer().getMessenger().registerOutgoingPluginChannel(this, "WDL|CONTROL");
	}
	
	public void onDisable(){
		pl = null;

	    getServer().getMessenger().unregisterIncomingPluginChannel(this, "WDL|INIT");
	    getServer().getMessenger().unregisterOutgoingPluginChannel(this, "WDL|CONTROL");
	}
	
	
	  public void onPluginMessageReceived(String channel, Player player, byte[] data)
	  {
	    if ((channel.equals("WDL|INIT")) && 
	      (!player.hasPermission("antiwdl.bypass"))) {
	      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), m.pl.getConfig().getString("punish-command").replace("%p", player.getName()));
	    }
	  }
	  
	  

}
