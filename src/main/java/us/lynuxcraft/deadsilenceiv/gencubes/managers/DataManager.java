package us.lynuxcraft.deadsilenceiv.gencubes.managers;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.gencubes.BaseBlock;
import us.lynuxcraft.deadsilenceiv.gencubes.GenerationBlock;
import us.lynuxcraft.deadsilenceiv.gencubes.gencube.InventoryType;
import us.lynuxcraft.deadsilenceiv.gencubes.services.edit.QuantityType;
import us.lynuxcraft.deadsilenceiv.gencubes.services.edit.RebuildType;

import java.util.List;
import java.util.Set;

public class DataManager {

    public Integer getSize(String type){
        return null;
    }

    public BaseBlock getBorderBlock(String type){
        return null;
    }

    public long getRegenerationTime(String type){
        return 0;
    }

    public QuantityType getRegenerationQuantityType(String type){
        return null;
    }

    public int getRegenerationQuantityValue(String type){
        return 0;
    }

    public RebuildType getRegenerationType(String type){
        return null;
    }

    public List<GenerationBlock> getGenerationBlocks(String type){
        return null;
    }

    public ItemStack getIcon(String type){
        return null;
    }

    public String getInventoryName(String type){
        return "";
    }

    public InventoryType getInventoryType(String type){
        return null;
    }

    public boolean getRebuildAvailability(String type){
        return true;
    }

    public double getRebuildPrice(String type){
        return 0.0;
    }

    public QuantityType getRebuildQuantityType(String type){
        return null;
    }

    public int getRebuildQuantityValue(String type){
        return 0;
    }

    public RebuildType getRebuildType(String type){
        return null;
    }

    public boolean getSmeltingAvailability(String type){
        return true;
    }

    public double getSmeltingPrice(String type){
        return 0.0;
    }

    public boolean getSellsAvailability(String type){
        return true;
    }

    public QuantityType getBuildQuantityType(String type){
        return null;
    }

    public int getBuildQuantityValue(String type){
        return 0;
    }

    public RebuildType getBuildType(String type){
        return null;
    }

    public boolean getInventoryLinkingAvailability(String type){
        return true;
    }

    public boolean getUpgradeAvailability(String type){
        return true;
    }

    public double getUpgradePrice(String type){
        return 0.0;
    }

    public String getNextUpgrade(String type){
        return "";
    }

    public double getRemovePrice(String type){
        return 0.0;
    }

    public boolean getCompressorAvailability(String type){
        return true;
    }

    public double getCompressorPrice(String type){
        return 0.0;
    }

    public Set<String> getCubesNames(){
        return null;
    }

    public boolean isACube(String type){
        return true;
    }

    public boolean isANonLoadedCube(String type){
        return true;
    }
}

