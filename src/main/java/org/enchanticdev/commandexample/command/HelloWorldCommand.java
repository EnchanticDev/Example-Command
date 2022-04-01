package org.enchanticdev.commandexample.command;

import org.enchanticdev.enchanticlib.command.Command;
import org.enchanticdev.enchanticlib.command.context.CommandContext;

import java.util.Arrays;

public class HelloWorldCommand extends Command {
    public HelloWorldCommand() {
        super("hello", 0); // Name & Arguments Required, Set to 0 for none.

        this.setAliases(Arrays.asList("helloworld", "hellotest")); // Other ways to access the command.
        this.setDescription("Hello World!"); // Command description

    }

    @Override
    public void execute(final CommandContext commandContext) {

        System.out.println("Hello World!");
    }
}
