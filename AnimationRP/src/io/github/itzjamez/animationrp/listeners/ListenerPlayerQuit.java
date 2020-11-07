package io.github.itzjamez.animationrp.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import io.github.itzjamez.animationrp.util.Data;

public class ListenerPlayerQuit implements Listener
{
    @SuppressWarnings("deprecation")
    @EventHandler
    public void a(PlayerQuitEvent e)
    {
        Player player = e.getPlayer();
        PlayerInventory playerInv = player.getInventory();
     
        ItemStack i = playerInv.getItemInHand();
        if (i == null) return;
        
        if (playerInv.contains(Data.Bow()))
            playerInv.remove(Data.Bow());
      
        if (playerInv.contains(Data.Trident()))
            playerInv.remove(Data.Trident());
     
        if (playerInv.contains(Data.Arrow()))
            playerInv.remove(Data.Arrow());
    }
}