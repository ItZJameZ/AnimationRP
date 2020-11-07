package io.github.itzjamez.animationrp.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import io.github.itzjamez.animationrp.util.Config;
import io.github.itzjamez.animationrp.util.Data;
import io.github.itzjamez.animationrp.util.PlayerUtil;

public class CommandExtendArms implements CommandExecutor
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
        PlayerInventory inv = player.getInventory();
        
        if (!player.hasPermission(Config.COMMAND_EA_PERMISSION))
        {
            player.sendMessage(Config.COMMAND_NO_PERMISSION);
            return true;
        }
        if (inv.getItemInHand().getType() == null || inv.getItemInHand().getType() == Material.AIR)
        {
            player.sendMessage(String.valueOf(PlayerUtil.getEmptySlots(player)));

            if (PlayerUtil.getEmptySlots(player) >= 2)
            {
                player.sendMessage(Config.COMMAND_EA_EXTEND);
                inv.setItemInHand(Data.Bow());
                inv.addItem(new ItemStack[] { Data.Arrow() });
            }
            else
            {
                player.sendMessage(Config.COMMAND_NO_SLOT);
            }
        } 
        else
        {
            player.sendMessage(Config.COMMAND_NO_SLOT);
        }
        return false;
    }
}