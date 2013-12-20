package devihaka.plugins.OTECommandHandler;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class OTECommandHandler extends JavaPlugin implements Listener {

	
	@EventHandler
    public boolean onCommand(CommandSender sender, Command command, String name, String[] args) {
		if (command.getName().equalsIgnoreCase("/ticket")) {
			if(args.length > 0 ) {
				if(args[0].equalsIgnoreCase("new") || args[0].equalsIgnoreCase("desc") || args[0].equalsIgnoreCase("submit")) {
				} else {
					sender.sendMessage(ChatColor.RED + "Usage: //ticket new");
				}
			} else {
				sender.sendMessage(ChatColor.RED + "Usage: //ticket new");
			}
		}
		return false;
    }
}