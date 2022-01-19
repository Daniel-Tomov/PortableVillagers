package me.cageydinosaur.portablevillagers;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Events(this), this);
		getCommand("portvill").setExecutor(new Commands(this));
		getCommand("portvill").setTabCompleter(new TabCompletion(this));
		this.saveDefaultConfig();
	}

	public String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}

	public boolean killBabyVill() {
		return this.getConfig().getBoolean("killBabyVill");
	}
	public boolean killZombieVill() {
		return this.getConfig().getBoolean("killZombieVill");
	}
	public boolean skipCure() {
		return this.getConfig().getBoolean("skipCure");
	}
}
