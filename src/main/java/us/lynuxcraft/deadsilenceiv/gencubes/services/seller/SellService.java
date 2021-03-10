package us.lynuxcraft.deadsilenceiv.gencubes.services.seller;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface SellService {
    Double getSellPrice(Player p, ItemStack stack);

    Double getSellPrice(ItemStack stack);
}
