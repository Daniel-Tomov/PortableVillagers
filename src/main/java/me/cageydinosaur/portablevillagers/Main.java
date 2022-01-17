package me.cageydinosaur.portablevillagers;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Events(this), this);
	}

	public String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
}
