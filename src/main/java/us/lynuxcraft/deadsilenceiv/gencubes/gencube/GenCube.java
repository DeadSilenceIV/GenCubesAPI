package us.lynuxcraft.deadsilenceiv.gencubes.gencube;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import us.lynuxcraft.deadsilenceiv.gencubes.services.edit.BuildingStatus;
import us.lynuxcraft.deadsilenceiv.gencubes.services.edit.QuantityType;
import us.lynuxcraft.deadsilenceiv.gencubes.services.edit.RebuildType;

import java.util.List;
import java.util.UUID;


public class GenCube {

    public void start(){}

    public void stop(){}

    public BuildingStatus build(RebuildType rebuildType, QuantityType quantityType, int quantityValue, boolean useFaweIfPresent){
        return null;
    }

    public void remove(){}

    public boolean sell(Player p) {
        return true;
    }

    public boolean smelt(Player p){
        return true;
    }

    public boolean compress(Player p){
        return true;
    }

    public boolean upgrade(Player p){
        return true;
    }

    public void save(){}

    public Location getLocation(){
        return null;
    }

    public void setLinkedContainer(Block container){}

    public Location getLinkedContainer(){
        return null;
    }

    public String getType(){
        return "";
    }

    public List<Block> getBorderBlocks(){
        return null;
    }

    public Integer getSize(){
        return null;
    }

    public UUID getOwner(){
        return null;
    }

    public UUID getUuid(){
        return null;
    }

    public boolean isLoaded(){
        return true;
    }

    public boolean isRunning(){
        return true;
    }
}
