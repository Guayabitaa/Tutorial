package dev.tutorial.commands.subcommands;

import com.google.common.collect.Lists;
import dev.panda.chat.ChatUtil;
import dev.panda.command.BaseCommand;
import dev.panda.command.Command;
import dev.panda.command.CommandArgs;
import dev.tutorial.Tutorial;

import java.util.List;

public class TutorialVersionCommand extends BaseCommand {

    @Command(name = "tutorial.version")
    @Override
    public void onCommand(CommandArgs command) {
        List<String> message = Lists.newArrayList();

        message.add(ChatUtil.NORMAL_LINE);
        message.add("&b&lTutorial About");
        message.add("");
        message.add("&fAuthor&7: &b" + Tutorial.get().getDescription().getAuthors());
        message.add("&fVersion&7: &b" + Tutorial.get().getDescription().getVersion());
        message.add(ChatUtil.NORMAL_LINE);
        message.forEach(msg -> ChatUtil.sender(command.getSender(), msg));
    }
}
