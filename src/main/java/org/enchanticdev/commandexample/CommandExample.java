package org.enchanticdev.commandexample;

import org.bukkit.plugin.java.JavaPlugin;
import org.enchanticdev.commandexample.command.HelloWorldCommand;
import org.enchanticdev.enchanticlib.command.manager.CommandManager;

public final class CommandExample extends JavaPlugin {

    public static CommandExample plugin;
    private CommandManager<CommandExample> manager;

    private HelloWorldCommand command;

    @Override
    public void onEnable() {
        CommandExample.plugin = this;
        this.manager = new CommandManager<>(this);
        this.command = new HelloWorldCommand();

        this.manager.registerCommand(this.command);

    }

    @Override
    public void onDisable() {
        this.manager.unregisterCommand(this.command);
    }
}
