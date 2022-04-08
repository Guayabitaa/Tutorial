package dev.tutorial.commands;

import com.google.common.collect.Lists;
import dev.tutorial.commands.subcommands.TutorialVersionCommand;
import dev.tutorial.utilities.chat.ChatUtil;
import dev.tutorial.utilities.command.BaseCommand;
import dev.tutorial.utilities.command.Command;
import dev.tutorial.utilities.command.CommandArgs;

import java.util.List;

public class TutorialCommand extends BaseCommand {

    public TutorialCommand() {
        new TutorialVersionCommand();
    }


    @Command(name = "tutorial")
    @Override
    public void onCommand(CommandArgs command) {
        List<String> message = Lists.newArrayList();

        message.add(ChatUtil.NORMAL_LINE);
        message.add("&b&lTutorial Help");
        message.add("");
        message.add("&f/" + command.getLabel() + " version");
        message.add(ChatUtil.NORMAL_LINE);
        message.forEach(msg -> ChatUtil.sender(command.getSender(), msg));
    }
}
