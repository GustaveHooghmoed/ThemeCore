package me.mickerd.tccore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class ParadeCommand extends AbstractCommand {
	 
public ParadeCommand(String command, String usage, String description) {
super(command, usage, description);
}
 
@Override
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
	return false;
}
}
