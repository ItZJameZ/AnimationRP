package io.github.itzjamez.animationrp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.itzjamez.animationrp.commands.CommandExtendArms;
import io.github.itzjamez.animationrp.commands.CommandRaiseHand;
import io.github.itzjamez.animationrp.listeners.ListenerDropItem;
import io.github.itzjamez.animationrp.listeners.ListenerMoveItem;
import io.github.itzjamez.animationrp.listeners.ListenerPlayerQuit;
import io.github.itzjamez.animationrp.listeners.ListenerSwitchItemHeld;
import io.github.itzjamez.animationrp.listeners.ListenerUseProjectile;

public class AnimationRP extends JavaPlugin
{
    public void onEnable()
    {
        getCommand("extendarms").setExecutor(new CommandExtendArms());
        getCommand("raisehand").setExecutor(new CommandRaiseHand());

        Bukkit.getPluginManager().registerEvents(new ListenerMoveItem(), this);
        Bukkit.getPluginManager().registerEvents(new ListenerDropItem(), this);
        Bukkit.getPluginManager().registerEvents(new ListenerUseProjectile(), this);
        Bukkit.getPluginManager().registerEvents(new ListenerSwitchItemHeld(), this);
        Bukkit.getPluginManager().registerEvents(new ListenerPlayerQuit(), this);
    }
}
