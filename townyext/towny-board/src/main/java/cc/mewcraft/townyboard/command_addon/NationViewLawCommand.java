package cc.mewcraft.townyboard.command_addon;

import cc.mewcraft.townyboard.TownyBoardPlugin;
import cc.mewcraft.townyboard.board.BoardDefaults;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.palmergames.bukkit.towny.TownyAPI;
import com.palmergames.bukkit.towny.object.Nation;
import net.kyori.adventure.inventory.Book;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Singleton
public class NationViewLawCommand extends LawCommand implements CommandExecutor {
    @Inject
    public NationViewLawCommand(final TownyBoardPlugin plugin, final BoardDefaults defaults) {
        super(plugin, defaults);
    }

    @Override public boolean onCommand(final @NotNull CommandSender sender, final @NotNull Command command, final @NotNull String label, final @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            return true;
        }

        Nation nation = TownyAPI.getInstance().getNation(player);
        if (nation == null) {
            plugin.getLang().of("msg_you_have_no_nation").send(player);
            return true;
        }

        Book book = readBook(nation);
        player.openBook(book);
        plugin.getLang().of("msg_nation_board_opened").send(player);

        return true;
    }
}