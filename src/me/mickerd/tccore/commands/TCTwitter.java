package me.mickerd.tccore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import twitter4j.Twitter;

public class TCTwitter extends ParadeCommand {
	public TCTwitter(String command, String usage, String description) {
		super(command, usage, description);
		}
		 
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			if(sender.hasPermission("tctwitter")){
				TweetAPI api = new TweetAPI();
			}
			return false;
		


}
}
