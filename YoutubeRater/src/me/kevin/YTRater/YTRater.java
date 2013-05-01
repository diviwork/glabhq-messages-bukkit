package me.kevin.YTRater;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class YTRater extends JavaPlugin{
	public static YTRater plugin;
	public final Logger logger = Logger.getLogger("Minecraft");

	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!");
	}
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
	
	public boolean onCommand(CommandSender sender,Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("rateme")){
			if(args.length == 0){
				if(player.isOp()){
					player.sendMessage("-----" + ChatColor.GREEN + "RateMe Help (Admins)" + ChatColor.WHITE + "-----");
					player.sendMessage(ChatColor.AQUA + "/RateMe" + ChatColor.WHITE + "|" + ChatColor.GREEN + "Shows This Screen!");
					player.sendMessage(ChatColor.AQUA + "/RateMe <Admin`s Name>" + ChatColor.WHITE + "|" + ChatColor.GREEN + "Sends A Message to An Admins For A RateMe Request");
					player.sendMessage(ChatColor.AQUA + "/RateMe Left" + ChatColor.WHITE + "|" + ChatColor.GREEN + "Shows The Amount Of Rates Left To Be Completed");
					player.sendMessage(ChatColor.AQUA + "/RateMe Done" + ChatColor.WHITE + "|" + ChatColor.GREEN + "Finishes The RateMe Request");
					
				}else{
					player.sendMessage("-----" + ChatColor.GREEN + "RateMe Help" + ChatColor.WHITE + "-----");
					player.sendMessage(ChatColor.AQUA + "/RateMe" + ChatColor.WHITE + "|" + ChatColor.GREEN + "Shows This Screen!");
					player.sendMessage(ChatColor.AQUA + "/RateMe <Admin`s Name>" + ChatColor.WHITE + "|" + ChatColor.GREEN + "Sends A Message to An Admins For A RateMe Request");
				}
			}
		}
		return false;
		
		
	}
}
