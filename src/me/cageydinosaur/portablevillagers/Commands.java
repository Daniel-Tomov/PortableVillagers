package me.cageydinosaur.portablevillagers;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

	Main plugin;

	public Commands(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args.length == 0) {
			if (sender.hasPermission("portvill.reload")) {
				sender.sendMessage(ChatColor.GREEN + "/portvill reload");
			}
			return true;
		} else if (args[0].equalsIgnoreCase("reload")) {
			if (sender.hasPermission("portvill.reload")) {
				plugin.reloadConfig();
				sender.sendMessage(ChatColor.GREEN + "Reloaded the Config");
			} else {
				return true;
			}
		}

		return true;
	}

}
