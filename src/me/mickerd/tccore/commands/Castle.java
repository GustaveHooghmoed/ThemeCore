package me.mickerd.tccore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rictacius.tweetIt.auth.UserAuthorizer;
import com.rictacius.tweetIt.operations.TweetIt;
import com.rictacius.tweetIt.user.TwitterUser;
import com.rictacius.tweetIt.user.TwitterUserType;
import com.rictacius.tweetIt.user.UserLoader;

import me.mickerd.tccore.main.m;
import me.mickerd.tccore.shows.castle.ShowTimer;



public class Castle implements CommandExecutor {
		 
	String message = "TwitterAPI error";
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args)
	  {
		Player p = (Player) sender;
		ShowTimer.secondsorminutes = String.valueOf(args[1]);
	      ShowTimer.startT("5 seconds", p);
	      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "rsc font1");
		return false;
	  }
}
