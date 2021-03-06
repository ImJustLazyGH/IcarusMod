package com.superiornetworks.icarus.commands;

import com.superiornetworks.icarus.ICM_Rank;
import com.superiornetworks.icarus.ICM_Utils;
import com.superiornetworks.icarus.IcarusMod;
import com.superiornetworks.icarus.modules.BusySystem;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "")
public class Command_busy extends BukkitCommand<IcarusMod>
{

    @Override
    public boolean run(CommandSender sender, Command cmnd, String string, String[] args)
    {
        if (!ICM_Rank.isRankOrHigher(playerSender, ICM_Rank.Rank.SUPER))
        {
            sender.sendMessage(ICM_Utils.NO_PERMS_MESSAGE);
            return true;
        }

        Player player = (Player) sender;
        BusySystem.toggleBusyPlayer(player);
        return true;
    }

}
