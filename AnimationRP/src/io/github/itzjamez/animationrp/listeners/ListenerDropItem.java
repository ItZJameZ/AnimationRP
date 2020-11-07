package io.github.itzjamez.animationrp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

import io.github.itzjamez.animationrp.util.Data;

public class ListenerDropItem implements Listener
{
    @EventHandler
    public void a(PlayerDropItemEvent e)
    {
        ItemStack dropped = e.getItemDrop().getItemStack();
        
        if (dropped.getType() == null) return;
        if (!dropped.hasItemMeta()) return;
        if (!dropped.getItemMeta().hasLore()) return;
        if (!Data.materials.contains(dropped.getType())) return;
        
        e.setCancelled(true);
    }
}
