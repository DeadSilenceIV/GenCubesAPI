package us.lynuxcraft.deadsilenceiv.gencubes.skyblock;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.*;

public abstract class SkyBlockPlugin implements Listener {

    public abstract String getName();

    public abstract Island getIslandAtLocation(Location location);

    protected void onDeleteIsland(Cancellable event,Island island,Player player){

    }

    protected void onLeaveIsland(Cancellable event,Island island,Player player){

    }

    protected void onKickIslandMember(Island island,OfflinePlayer offlinePlayer){

    }

}
