package io.github.itzjamez.animationrp.util;

import java.util.ArrayList;
import java.util.Arrays;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Data
{
    public static ArrayList<Material> materials = new ArrayList<>(Arrays.asList(Material.ARROW, Material.TRIDENT, Material.BOW));

    public static ItemStack Trident()
    {
        ItemStack item = new ItemStack(Material.TRIDENT);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemMeta.setLore(Arrays.asList(ChatColor.GRAY + "rp_Trident"));
        itemMeta.setUnbreakable(true);
        item.setItemMeta(itemMeta);
        return item;
    }

    public static ItemStack Bow()
    {
        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemMeta.setLore(Arrays.asList(ChatColor.GRAY + "rp_Bow"));
        itemMeta.setUnbreakable(true);
        item.setItemMeta(itemMeta);
        return item;
    }

    public static ItemStack Arrow()
    {
        ItemStack item = new ItemStack(Material.ARROW);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemMeta.setLore(Arrays.asList(ChatColor.GRAY + "rp_Arrow"));
        item.setItemMeta(itemMeta);
        return item;
    }
}