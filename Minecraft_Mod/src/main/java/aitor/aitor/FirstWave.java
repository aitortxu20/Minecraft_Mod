package aitor.aitor;

import jdk.javadoc.internal.doclint.HtmlTag;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.material.RedstoneTorch;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.*;

import java.awt.print.Book;
import java.lang.Thread;
import java.lang.Object;


import java.lang.reflect.Type;
import java.util.UUID;


public class FirstWave implements Listener {

    int count = 0;
    @EventHandler
    public void onInventoryOpen(InventoryPickupItemEvent event){

        World world = event.getInventory().getLocation().getWorld();

        if (event.getInventory().contains(Material.WRITTEN_BOOK)) {

            count++;


            if (count == 1) {

                Location afterCinematic2 = new Location(world, 3727, 6, 4547);

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.teleport(afterCinematic2);
                    user.performCommand("playsound minecraft:custom.puerta master @a ~ ~ ~ 9999");
                    user.performCommand("pc start cinematic0");
                }

                try {
                    Thread.sleep(750);
                    Location redstoneTorch = new Location(world, 3723, 6, 4555);

                    Block block = redstoneTorch.getBlock();
                    block.setType(Material.AIR);
                }catch (Exception e){
                    System.out.println("hola");
                }



            } else if (count == 2) {

                Location afterCinematic2 = new Location(world, 3727, 6, 4547);

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.teleport(afterCinematic2);
                    user.performCommand("playsound minecraft:custom.puerta master @a ~ ~ ~ 9999");
                    user.performCommand("pc start cinematic0");
                }

                try{
                    Thread.sleep(750);
                    Location redstoneTorch2 = new Location(world, 3730, 6, 4555);
                    Block block2 = redstoneTorch2.getBlock();
                    block2.setType(Material.AIR);
                }catch (Exception e){
                    System.out.println("hola");
                }



            } else if (count == 3) {

                Location afterCinematic2 = new Location(world, 3727, 6, 4547);

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.teleport(afterCinematic2);
                    user.performCommand("playsound minecraft:custom.puerta master @a ~ ~ ~ 9999");
                    user.performCommand("pc start cinematic0");
                }

                try{
                    Thread.sleep(750);
                    Location redstoneTorch3 = new Location(world, 3723, 8, 4555);
                    Block block3 = redstoneTorch3.getBlock();
                    block3.setType(Material.AIR);
                }catch (Exception e){
                    System.out.println("hola");
                }

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.sendTitle(ChatColor.AQUA + "Acceso al siguiente nivel desbloqueado", "Se vienen cositas");
                }


            }
        }
    }

    @EventHandler
    public void onBreakBlock(BlockDamageEvent event){

        Block block = event.getBlock();
        Location locBlock = block.getLocation();
        Material blockType = block.getType();

        int x = block.getX();
        int y = block.getY();
        int z = block.getZ();

        if (z > 4498) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("No intentes romper bloques rata.");
            Location loc = new Location(event.getPlayer().getWorld(), x, y, z);
            loc.getBlock().setType(blockType);


        }

    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.getPlayer().sendTitle(ChatColor.GOLD + "ᴮᴵᴱᴺⱽᴱᴺᴵᴰᴼ ᴬᴸ ᴹᴱᴶᴼᴿ ᔆᴱᴿⱽᴱᴿ ᴰᴱ ᴸᴬ ᴴᴵᔆᵀᴼᴿᴵᴬ" , "RATA");
    }

}