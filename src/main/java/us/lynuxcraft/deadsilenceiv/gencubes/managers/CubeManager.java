package us.lynuxcraft.deadsilenceiv.gencubes.managers;

import org.bukkit.Location;
import us.lynuxcraft.deadsilenceiv.gencubes.gencube.GenCube;

import java.util.Set;
import java.util.UUID;


public class CubeManager {

    /**
     * Registers a cube.
     *
     * @param cube the GenCube instance.
     */
    public void register(GenCube cube){}

    /**
     * UnRegisters a specified cube.
     *
     * @param cube the GenCube instance.
     */
    public void unRegister(GenCube cube){}

    /**
     * Gets the GenCubes owned by a specified player
     *
     * @param uuid the uuid of the owner
     * @return the set of GenCubes.
     */
    public Set<GenCube> getCubesByOwner(UUID uuid){
        return null;
    }

    @Deprecated
    public GenCube getCubeByLocation(Location location,boolean loadable) {
        return null;
    }

    /**
     * Gets a LOADED cube(A cube that has been loaded by a chunk) by its location.
     *
     * @param location the location to check
     * @return the GenCube instance.
     */
    public GenCube getLoadedCube(Location location){
        return null;
    }

    /**
     * Gets a NON-LOADED cube(A cube that hasn't been loaded by a chunk) by its location.
     *
     * @param location the location to check
     * @return the GenCube instance.
     */
    public GenCube getNonLoadedCube(Location location){
       return null;
    }


    /**
     * Gets a NON-LOADABLE cube(A cube that couldn't be loaded by external factors such as wrong config)
     * by its location.
     *
     * @param location the location to check
     * @return the GenCube instance.
     */
    public GenCube getNonLoadableCube(Location location){
        return null;
    }

    /**
     * Gets a cube by its location.
     *
     * @param location the location to check
     * @return the GenCube instance.
     */
    public GenCube getCube(Location location){
        return null;
    }

    /**
     * Gets a GenCube by its uuid.
     *
     * @param uuid the uuid of the GenCube
     * @return the GenCube instance, null if any cube with the specified uuid was found.
     */
    public GenCube getCubeByUUID(UUID uuid){
        return null;
    }

}
