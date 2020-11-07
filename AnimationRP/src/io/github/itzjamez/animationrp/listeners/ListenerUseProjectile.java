package io.github.itzjamez.animationrp.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ListenerUseProjectile implements Listener
{
    @EventHandler
    public void a(ProjectileLaunchEvent e)
    {
        if (e.getEntity().getType() == EntityType.TRIDENT)
            e.setCancelled(true);
     
        if (e.getEntity().getType() == EntityType.ARROW)
            e.setCancelled(true);
    }
}