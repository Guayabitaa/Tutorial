package dev.tutorial.events;

import dev.panda.chat.ChatUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WelcomeMessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if(event.getPlayer().hasPermission("event.welcome")) {
            Player player = event.getPlayer();
            ChatUtil.sender(player, "&7Welcome to the server, &b" + player.getName() + "&7!");
        }
    }
}

