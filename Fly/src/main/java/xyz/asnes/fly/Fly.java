package xyz.asnes.fly;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.asnes.fly.commands.FlyCommand;

public final class Fly extends JavaPlugin {

  @Override
  public void onEnable() {
    System.out.println("Fly plugin has been enabled.");
    getCommand("fly").setExecutor(new FlyCommand());
  }

  @Override
  public void onDisable() {
    System.out.println("Fly plugin has been disabled.");
  }
}
