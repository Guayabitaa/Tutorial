package dev.tutorial;

import dev.panda.chat.ChatUtil;
import dev.panda.command.CommandManager;
import dev.tutorial.commands.TutorialCommand;
import dev.tutorial.events.WelcomeMessage;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

@Getter @Setter
public class Tutorial extends JavaPlugin {

    private CommandManager commandManager;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomeMessage(), this);
        ChatUtil.log("&a&lTutorial &7Plugin has been enabled!");
        this.commandManager = new CommandManager(this, new ArrayList<>());
        this.loadCommands();
    }



    @Override
    public void onDisable() {
        ChatUtil.log("&c&lTutorial &7Plugin has been disabled!");
    }

    private void loadCommands() {
        new TutorialCommand();

    }
    public static Tutorial get() {
        return getPlugin(Tutorial.class);
    }
}