package dev.tutorial.commands;

import com.google.common.collect.Lists;
import dev.panda.chat.ChatUtil;
import dev.panda.command.BaseCommand;
import dev.panda.command.Command;
import dev.panda.command.CommandArgs;
import dev.tutorial.commands.subcommands.TutorialVersionCommand;

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
