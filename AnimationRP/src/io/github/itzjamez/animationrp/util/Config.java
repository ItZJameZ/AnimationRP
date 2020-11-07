package io.github.itzjamez.animationrp.util;

import org.bukkit.ChatColor;

public class Config
{
    public static String COMMAND_NO_PERMISSION = color("&4No Permission");
    
    public static String COMMAND_RH_PERMISSION = "anim.raisehand";
    public static String COMMAND_RH_RAISE = color("&aYou can now raise your hand.");
    public static String COMMAND_RH_LOWER = color("&cYou can no longer raise your hand.");
    
    public static String COMMAND_EA_PERMISSION = "anim.extendarms";
    public static String COMMAND_EA_EXTEND = color("&aYou can now extend your arms");
    public static String COMMAND_EA_LOWER = color("&cYou can no longer extend your arms.");
    
    public static String COMMAND_NO_SLOT = "There isn't a clear slot to preform this action.";

    public static String color(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
