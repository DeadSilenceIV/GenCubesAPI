package us.lynuxcraft.deadsilenceiv.gencubes.events;


import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import us.lynuxcraft.deadsilenceiv.gencubes.gencube.GenCube;

/**
 * Called when a cube is being removed inside a {@link us.lynuxcraft.deadsilenceiv.gencubes.skyblock.Island}
 * This event just covers the specified {@link RemoveReason}.
 */
public class SkyBlockCubeRemoveEvent extends Event implements Cancellable{

    public SkyBlockCubeRemoveEvent(GenCube cube, RemoveReason reason) {}

    public GenCube getCube(){
        return null;
    }

    public RemoveReason getReason(){
        return null;
    }

    @Override
    public void setCancelled(boolean cancelled) {}

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

    public static HandlerList getHandlerList() {
        return null;
    }

    public enum RemoveReason{
        ISLAND_DELETION,
        ISLAND_MEMBER_KICK
    }
    
}

