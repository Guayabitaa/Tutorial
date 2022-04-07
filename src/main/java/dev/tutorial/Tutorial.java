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

        ChatUtil.log("&b&lTutorial &7Plugin has been &aenabled!");

        this.commandManager = new CommandManager(this, new ArrayList<>());
        this.loadCommands();
        this.loadEvents();
    }

    @Override
    public void onDisable() {
        ChatUtil.log("&b&lTutorial &7Plugin has been &cdisabled!");
    }

    private void loadCommands() {
        new TutorialCommand();
    }

    private void loadEvents() {
        this.getServer().getPluginManager().registerEvents(
                new WelcomeMessage(), this);
    }

    public static Tutorial get() {
        return getPlugin(Tutorial.class);
    }
}