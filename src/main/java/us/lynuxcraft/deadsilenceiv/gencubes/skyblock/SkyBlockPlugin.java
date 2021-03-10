package us.lynuxcraft.deadsilenceiv.gencubes.skyblock;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
public abstract class SkyBlockPlugin implements Listener {

    public abstract String getName();

    public abstract Island getIslandAtLocation(Location location);

    public abstract Island getIslandFromDeleteIslandEvent(Event event);

    public abstract Player getPlayerFromIslandDeleteEvent(Event event);

    public abstract Island getIslandFromLeaveIslandEvent(Event event);

    public abstract Player getPlayerFromIslandLeaveEvent(Event event);

    public abstract Island getIslandFromKickIslandMemberEvent(Event event);

    public abstract OfflinePlayer getOfflinePlayerFromKickIslandMemberEvent(Event event);

}
