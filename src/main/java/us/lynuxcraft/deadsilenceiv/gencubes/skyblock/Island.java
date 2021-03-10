package us.lynuxcraft.deadsilenceiv.gencubes.skyblock;

import org.bukkit.Location;

import java.util.List;
import java.util.UUID;

public interface Island {

    UUID getOwner();

    List<UUID> getMembers();

    boolean isInside(Location location);

}
