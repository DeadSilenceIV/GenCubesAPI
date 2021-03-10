package us.lynuxcraft.deadsilenceiv.gencubes.managers;

import org.bukkit.Location;
import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.gencubes.gencube.GenCube;

import java.util.List;
import java.util.UUID;


public class CubeManager {

    public void register(GenCube cube){}

    public void unRegister(GenCube cube){}

    public List<GenCube> getCubesByOwner(UUID uuid){
        return null;
    }

    public GenCube getCubeByLocation(Location location, boolean loaded) {
        return null;
    }

    public GenCube getCubeByInventory(Inventory inventory){
        return null;
    }

    public GenCube getCubeByUUID(UUID uuid){
        return null;
    }

    public GenCube getCubeTryingToPair(UUID player){
        return null;
    }
}
