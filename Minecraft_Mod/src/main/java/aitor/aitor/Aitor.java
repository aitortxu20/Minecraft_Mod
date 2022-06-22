package aitor.aitor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Aitor extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        commands commands = new commands();

        System.out.print("The plugin has started succesfully!!!");
        getServer().getPluginManager().registerEvents(new FirstWave(), this);
        getCommand("wave2").setExecutor(commands);
        getCommand("start").setExecutor(commands);
        getCommand("level2").setExecutor(commands);
        getCommand("cinematic1").setExecutor(commands);
        getCommand("checkpoint2").setExecutor(commands);
        getCommand("puertahierro").setExecutor(commands);
        getCommand("finish").setExecutor(commands);
        getCommand("spawnskeletons").setExecutor(commands);
        getCommand("spawnsemiboss").setExecutor(commands);
        getCommand("tptostart").setExecutor(commands);
        getCommand("delrocky").setExecutor(commands);
        getCommand("susto").setExecutor(commands);
        getCommand("checkpoint3").setExecutor(commands);
        getCommand("spawnspider").setExecutor(commands);


    }



    @EventHandler
    public void onPlayerExp(PlayerExpChangeEvent event){

        Player name=event.getPlayer();

        name.getWorld().spawnEntity(name.getLocation(), EntityType.RABBIT);


        name.sendMessage(ChatColor.GREEN + "Has subido de nivel");

    }




}
