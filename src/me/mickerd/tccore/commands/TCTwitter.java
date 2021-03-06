package me.mickerd.tccore.commands;

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



public class TCTwitter implements CommandExecutor {
		 
	String message = "TwitterAPI error";
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args)
	  {
		Player p = (Player) sender;
		if (args.length >= 0)
	    {
	      StringBuilder builder = new StringBuilder();
	      for (int i = 0; i < args.length; i++) {
	        if (i < args.length - 1) {
	          builder.append(args[i]).append(" ");
	        } else {
	          builder.append(args[i]);
	        }
	      }
	      message = builder.toString();
	      p.performCommand("tweet " + message);
	    }
		return false;
	  }
}
