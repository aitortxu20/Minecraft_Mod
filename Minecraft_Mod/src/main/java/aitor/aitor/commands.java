package aitor.aitor;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;


public class commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //Player player = (Player) sender;
        //World world = ((Player) sender).getWorld();



        if (sender instanceof BlockCommandSender) {

            World world = ((BlockCommandSender) sender).getBlock().getWorld();

            Location mobLoc = new Location(world, 3748, 6, 4556 );
            Location mobLoc2 = new Location(world, 3703, 6, 4556 );
            Location mobLoc3 = new Location(world, 3746, 6, 4518);
            Location mobLoc4 = new Location(world, 3704, 6, 4518);

            if (command.getName().equalsIgnoreCase("start")) {

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.sendTitle(ChatColor.RED + "EMPEZAMOSSS", "Se viene");
                    user.performCommand("spawnpoint @a ~ ~ ~");
                    user.sendMessage(ChatColor.LIGHT_PURPLE + "Checkpoint");

                    user.setOp(false);
                    if (user.getName().equals("AiToRtXu")){
                        user.setOp(true);
                    }

                }

                for (int i = 0; i < 3; i++ ){

                    Zombie zombie = (Zombie) world.spawnEntity(mobLoc, EntityType.ZOMBIE);
                    zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton = (Skeleton) world.spawnEntity(mobLoc,EntityType.SKELETON);
                    skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);

                    zombie.setPassenger(skeleton);

                    Zombie zombie2 = (Zombie) world.spawnEntity(mobLoc2, EntityType.ZOMBIE);
                    zombie2.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie2.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton2 = (Skeleton) world.spawnEntity(mobLoc2,EntityType.SKELETON);
                    skeleton2.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);


                    zombie2.setPassenger(skeleton2);

                    Zombie zombie3 = (Zombie) world.spawnEntity(mobLoc3, EntityType.ZOMBIE);
                    zombie3.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie3.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton3 = (Skeleton) world.spawnEntity(mobLoc3,EntityType.SKELETON);
                    skeleton3.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);

                    zombie3.setPassenger(skeleton3);

                    Zombie zombie4 = (Zombie) world.spawnEntity(mobLoc4, EntityType.ZOMBIE);
                    zombie4.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie4.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton4 = (Skeleton) world.spawnEntity(mobLoc4,EntityType.SKELETON);
                    skeleton4.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);


                    zombie4.setPassenger(skeleton4);

                }

            } else if (command.getName().equalsIgnoreCase("wave2")) {

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.sendTitle(ChatColor.RED + "Se viene la oleada 2", "Cuidadito");

                }

                for (int i = 0; i < 3; i++ ){

                    Zombie zombie = (Zombie) world.spawnEntity(mobLoc, EntityType.ZOMBIE);
                    zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton = (Skeleton) world.spawnEntity(mobLoc,EntityType.SKELETON);
                    skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);

                    zombie.setPassenger(skeleton);

                    Zombie zombie2 = (Zombie) world.spawnEntity(mobLoc2, EntityType.ZOMBIE);
                    zombie2.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie2.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton2 = (Skeleton) world.spawnEntity(mobLoc2,EntityType.SKELETON);
                    skeleton2.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);


                    zombie2.setPassenger(skeleton2);

                    Zombie zombie3 = (Zombie) world.spawnEntity(mobLoc3, EntityType.ZOMBIE);
                    zombie3.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie3.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton3 = (Skeleton) world.spawnEntity(mobLoc3,EntityType.SKELETON);
                    skeleton3.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);

                    zombie3.setPassenger(skeleton3);

                    Zombie zombie4 = (Zombie) world.spawnEntity(mobLoc4, EntityType.ZOMBIE);
                    zombie4.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(25);
                    zombie4.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);

                    Skeleton skeleton4 = (Skeleton) world.spawnEntity(mobLoc4,EntityType.SKELETON);
                    skeleton4.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);


                    zombie4.setPassenger(skeleton4);

                }



            } else if (command.getName().equalsIgnoreCase("level2")){
                Location blockLevel2 = new Location(world, 3728, 18, 4588);
                Block block = blockLevel2.getBlock();
                block.setType(Material.AIR);

                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.sendTitle(ChatColor.RED + "Se desbloqueó el acceso al siguiente nivel", "se acerca el fin");
                    user.performCommand("pc start cinematic2");
                    user.setPlayerListHeader(ChatColor.YELLOW + "Ratas Online");
                }
            } else if (command.getName().equalsIgnoreCase("cinematic1")) {
                Location afterCinematic = new Location(world, 3728, 26, 4744 );

                for (Player user : Bukkit.getOnlinePlayers()) {

                    user.teleport(afterCinematic);
                    user.performCommand("playsound minecraft:custom.puerta master @a ~ ~ ~ 9999");
                    user.performCommand("pc start cinematic1");

                }
            } else if (command.getName().equalsIgnoreCase("checkpoint2")) {

                for (Player user : Bukkit.getOnlinePlayers()) {

                    user.performCommand("spawnpoint @a 3726 5 4561");
                    user.sendMessage(ChatColor.LIGHT_PURPLE + "Checkpoint");

                }
            } else if (command.getName().equalsIgnoreCase("spawnskeletons")){

                Location block1Loc = new Location(world, 3704, 20, 4598);
                Block block1 = block1Loc.getBlock();
                block1.setType(Material.AIR);

                Location block2Loc = new Location(world, 3743, 21, 4591);
                Block block2 = block2Loc.getBlock();
                block2.setType(Material.AIR);

                for (Player user : Bukkit.getOnlinePlayers()){

                    String name = user.getName();
                    if (name.equalsIgnoreCase("AiToRtXu")){

                        user.performCommand("mm s remove Skeleton");
                        user.performCommand("mm s remove Skeleton2");

                    }
                }

            } else if (command.getName().equalsIgnoreCase("spawnsemiboss")){

                for (Player user : Bukkit.getOnlinePlayers()){

                    String name = user.getName();
                    if (name.equalsIgnoreCase("AiToRtXu")){

                        user.performCommand("mm s remove Mutant");
                        user.performCommand("mm s remove Mutant2");
                    }
                }


            } else if (command.getName().equalsIgnoreCase("delrocky")){

                for (Player user : Bukkit.getOnlinePlayers()){

                    String name = user.getName();
                    if (name.equalsIgnoreCase("AiToRtXu")){

                        user.performCommand("mm s remove boss");

                    }
                }
            } else if (command.getName().equalsIgnoreCase("susto")){

                for (Player user : Bukkit.getOnlinePlayers()){


                    user.performCommand("playsound minecraft:custom.grito master @a ~ ~ ~ 9999");
                    user.addPotionEffect(PotionEffectType.BLINDNESS.createEffect(200, 99));


                }

            } else if (command.getName().equalsIgnoreCase("checkpoint3")) {

                for (Player user : Bukkit.getOnlinePlayers()) {

                    user.performCommand("spawnpoint @a 3728 1 4613");
                    user.sendMessage(ChatColor.LIGHT_PURPLE + "Checkpoint");

                }

            }
        } else if (sender instanceof Player){

            World world = ((Player) sender).getWorld();
            if (command.getName().equalsIgnoreCase("puertahierro")) {


                for (Player user : Bukkit.getOnlinePlayers()) {
                    user.performCommand("pc start puertahierro");
                }

                try{
                    Location torchloc = new Location(world, 3729,4,4654);

                    Thread.sleep(750);
                    Block torchdoor = torchloc.getBlock();
                    torchdoor.setType(Material.REDSTONE_TORCH);

                } catch (Exception e){
                    System.out.println("F");

                }

            } else if (command.getName().equalsIgnoreCase("finish")){

                ItemStack itemaward1 = new ItemStack(Material.NETHERITE_SWORD,1);
                ItemStack itemaward2 = new ItemStack(Material.NETHERITE_CHESTPLATE,1);

                for (Player user : Bukkit.getOnlinePlayers()){

                    user.sendMessage(ChatColor.YELLOW + "Recibiste: x1 Netherite_Chestplate\nRecibiste: x1 Netherite_Sword");
                    user.getInventory().addItem(itemaward1);
                    user.getInventory().addItem(itemaward2);
                }
            } else if (command.getName().equalsIgnoreCase("tptostart")){

                for (Player user : Bukkit.getOnlinePlayers()){

                    Location loctp = new Location(world, 3725, 6, 4507);
                    user.addPotionEffect(PotionEffectType.CONFUSION.createEffect(500,97));
                    user.addPotionEffect(PotionEffectType.BLINDNESS.createEffect(500,97));

                    try{
                        Thread.sleep(5000);

                        user.teleport(loctp);

                    }catch (Exception e){
                        System.out.println("hola");
                    }


                }

            } else if(command.getName().equalsIgnoreCase("spawnspider")){

                for (Player user : Bukkit.getOnlinePlayers()){

                    String name = user.getName();
                    if (name.equalsIgnoreCase("AiToRtXu")){

                        user.performCommand("mm s remove spider");
                        user.performCommand("mm s remove spider2");

                    }
                }
            }

        }
        return true;

    }
}
