package xyz.asnes.fly.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player) && args.length == 0){
      System.out.println("Only players are allowed to fly.");
      return true;
    }
    Player p;
    if (args.length > 0) {
      // This is the case in which fly is cast upon a different user than the one that cast the command.
      p = Bukkit.getServer().getPlayer(args[0]);
    } else {
      // This is the case in which fly is cast upon the user that executed the command.
      p = (Player) sender;
    }
    p.setAllowFlight(!p.getAllowFlight());
    p.sendMessage("Flight toggled.");

    return true;
  }
}
