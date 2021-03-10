package us.lynuxcraft.deadsilenceiv.gencubes.gencube;


import org.bukkit.block.BlockFace;

import java.util.UUID;

public class CubeBuilder {

    public CubeBuilder(String type, String serializedLocation, BlockFace direction) {}

    public CubeBuilder setSize(Integer size){
        return this;
    }

    public CubeBuilder setUUID(UUID uuid) {
        return this;
    }

    public CubeBuilder setOwner(UUID owner){
        return this;
    }

    public CubeBuilder setInventoryType(InventoryType inventoryType){
        return this;
    }

    public CubeBuilder setInventoryContent(Object[] content){
        return this;
    }

    public CubeBuilder setLinkedContainer(String location){
        return this;
    }

    public GenCube build(){
        return null;
    }

}
