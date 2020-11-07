package io.github.itzjamez.animationrp.util;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerUtil
{
    public static int getEmptySlots(Player player)
    {
        int counter = 0;
                
        for (ItemStack item : player.getInventory().getContents())
        {
            if (item != null && item.getType() != Material.AIR)
                counter++;
        }
        return 36 - counter;
    }
}