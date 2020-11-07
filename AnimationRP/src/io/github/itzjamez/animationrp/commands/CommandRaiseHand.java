package io.github.itzjamez.animationrp.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import io.github.itzjamez.animationrp.util.Config;
import io.github.itzjamez.animationrp.util.Data;

public class CommandRaiseHand implements CommandExecutor
{
    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender s, Command cmd, String cL, String[] args)
    {
        if (!(s instanceof Player))
        {
            s.sendMessage("/" + cL + " is a player only command");
            return true;
        }
        Player player = (Player) s;
        PlayerInventory playerInv = player.getInventory();
        
        if (!player.hasPermission(Config.COMMAND_RH_PERMISSION))
        {
            player.sendMessage(Config.COMMAND_NO_PERMISSION);
            return true;
        }
        
        if (playerInv.getItemInHand().getType() == null || playerInv.getItemInHand().getType() == Material.AIR)
        {
            player.sendMessage(Config.COMMAND_RH_RAISE);
            playerInv.setItemInHand(Data.Trident());
        } 
        else
        {
            player.sendMessage(Config.COMMAND_NO_SLOT);
        }
        return false;
    }
}