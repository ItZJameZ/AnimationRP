package io.github.itzjamez.animationrp.listeners;

import io.github.itzjamez.animationrp.util.Config;
import io.github.itzjamez.animationrp.util.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class ListenerSwitchItemHeld implements Listener
{
    @EventHandler
    public void a(PlayerItemHeldEvent e)
    {
        Player player = e.getPlayer();
        PlayerInventory playerInv = player.getInventory();
        ItemStack i = playerInv.getItem(e.getPreviousSlot());
        if (i == null) return;

        if (i.equals(Data.Trident()))
        {
            playerInv.clear(e.getPreviousSlot());
            player.sendMessage(Config.COMMAND_RH_LOWER);
        } 
        else if (i.equals(Data.Bow()))
        {
            playerInv.clear(e.getPreviousSlot());
            playerInv.remove(Data.Arrow());
            player.sendMessage(Config.COMMAND_EA_LOWER);
        }
        else if (i.equals(Data.Arrow()))
        {
            playerInv.clear(e.getPreviousSlot());
        }
    }
}