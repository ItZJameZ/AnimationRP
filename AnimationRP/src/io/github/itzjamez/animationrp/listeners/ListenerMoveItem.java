package io.github.itzjamez.animationrp.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import io.github.itzjamez.animationrp.util.Config;
import io.github.itzjamez.animationrp.util.Data;

public class ListenerMoveItem implements Listener
{
    @EventHandler
    public void a(InventoryClickEvent e)
    {
        Player player = (Player) e.getWhoClicked();
        PlayerInventory playerInv = player.getInventory();
        ItemStack clicked = e.getCurrentItem();
        
        if (clicked == null) return;
        if (clicked.getType() == null) return;
        if (!clicked.hasItemMeta()) return;
        if (!clicked.getItemMeta().hasLore()) return;
        if (!Data.materials.contains(clicked.getType())) return;
       
        e.setCancelled(true);
        playerInv.removeItem(new ItemStack[] { clicked });
       
        if (clicked.equals(Data.Trident()))
        {
            player.sendMessage(Config.COMMAND_RH_LOWER);
        } 
        else if (clicked.equals(Data.Bow()))
        {
            player.sendMessage(Config.COMMAND_EA_LOWER);
            playerInv.remove(Data.Arrow());
        }
    }
}