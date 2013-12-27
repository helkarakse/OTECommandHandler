package devihaka.plugins.OTECommandHandler;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class OTECommandHandler extends JavaPlugin implements Listener {
	@EventHandler
	public boolean onCommand(CommandSender sender, Command command,
			String name, String[] args) {
		switch (command.getName()) {
		case "/ticket":
			if (args.length > 0) {
				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "Usage: //ticket help");
				return true;
			}

		case "/issue":
			if (args.length > 0) {
				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "Usage: //issue help");
				return true;
			}

		case "/service":
			if (args.length > 0) {
				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "Usage: //service help");
				return true;
			}

		default:
			break;
		}

		return false;
	}
}