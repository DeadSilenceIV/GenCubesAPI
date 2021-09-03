package us.lynuxcraft.deadsilenceiv.gencubes.gencube;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import us.lynuxcraft.deadsilenceiv.gencubes.services.edit.*;
import us.lynuxcraft.deadsilenceiv.gencubes.skyblock.Island;
import us.lynuxcraft.deadsilenceiv.gencubes.utils.region.Region;
import us.lynuxcraft.deadsilenceiv.gencubes.utils.region.RegionBlock;

import java.util.*;

public class GenCube {

    /**
     * Gets the config name of the cube.
     *
     * @return the config name.
     */
    public String getType(){
        return null;
    }

    /**
     * Gets the unique id of the cube.
     *
     * @return the uuid of the cube.
     */
    public UUID getUniqueId(){
        return null;
    }

    /**
     * Gets the size of the cube.
     *
     * @return the cube size.
     */
    public Integer getSize(){
        return 0;
    }

    /**
     * Gets the uuid of the cube's owner.
     *
     * @return the uuid of the cube's owner.
     */
    public UUID getOwner(){
        return null;
    }

    /**
     * Starts the generation process of the cube if possible.
     */
    public void start(){}

    /**
     * Stops the generation process of the cube if possible.
     */
    public void stop(){}

    /**
     * Tries to re-build the cube in a specified amount and form.
     *
     * @param buildType the building type that will be used
     * @param quantityType the type of the value to rebuild
     * @param quantityValue the amount of the value to rebuild
     * @param useFaweIfPresent use fawe if is enabled
     * @return the building status of the operation.
     */
    public BuildingStatus build(BuildType buildType, QuantityType quantityType, int quantityValue, boolean useFaweIfPresent){
        return null;
    }

    /**
     * Removes the cube.
     */
    public void remove() {}

    /**
     * Sells the cube content for a specified player.
     *
     * @param player the player instance that is going to try to sell the cube
     * @return true if the cube could be sold, false otherwise.
     */
    public boolean sell(Player player) {
        return false;
    }

    /**
     * Smelts the cube content for a specified player.
     *
     * @param player the player instance that is going to try to smelt the cube
     * @return true if the cube could be smelted, false otherwise.
     */
    public boolean smelt(Player player){
        return false;
    }

    /**
     * Compresses the cube content for a specified player.
     *
     * @param player the player instance that is going to try to compress the cube
     * @return true if the cube could be compressed, false otherwise.
     */
    public boolean compress(Player player){
        return false;
    }

    /**
     * Upgrades the cube for a specified player.
     *
     * @param player the player instance that is going to try to upgrade the cube
     * @return true if the cube could be upgraded, false otherwise.
     */
    public boolean upgrade(Player player){
        return false;
    }

    /**
     * Saves the GenCube into storage.
     */
    public void save(){}

    /**
     * Gets the location of the cube.
     * @return the location of the cube, null if couldn't be obtained.
     */
    public Location getLocation(){
        return null;
    }

    /**
     * Sets a new linked container for the cube.
     *
     * @param container the block instance of the container.
     */
    public void setLinkedContainer(Block container){}

    /**
     * Gets the linked container location.
     *
     * @return the location of the linked container, null if the cube doesn't have a linked container.
     */
    public Location getLinkedContainer(){
        return null;
    }

    /**
     * Gets the {@link Island} where the cube is located.
     *
     * @return the Island instance, null if the cubes is not inside an island.
     */
    public Island getIsland(){
        return null;
    }

    /**
     * Gets the list {@link RegionBlock} that constitute the cube border.
     *
     * @return the list of regions blocks.
     */
    public List<RegionBlock> getBorder(){
        return null;
    }

    /**
     * Gets the main {@link Region} of the cube.
     *
     * @return the main region instance.
     */
    public Region getMainRegion(){
        return null;
    }

    /**
     * Gets the generation {@link Region} of the cube.
     *
     * @return the generation region instance.
     */
    public Region getGenerationRegion(){
        return null;
    }

    /**
     * Checks if the specified location is at the border of the cube.
     *
     * @param location the location to be checked
     * @return true if the location is at the border, false otherwise.
     */
    public boolean isCubeBorder(Location location){
        return false;
    }

    @Deprecated
    public List<Block> getBorderBlocks(){
        return null;
    }

    /**
     * Checks if the cube can be loaded properly.
     *
     * @return true if the cube can be loaded, false otherwise.
     */
    public boolean canBeLoaded(){
        return false;
    }

    /**
     * Checks if the cube regeneration process is currently running.
     *
     * @return true if it is running, false otherwise.
     */
    private boolean isRunning(){
        return false;
    }

}


