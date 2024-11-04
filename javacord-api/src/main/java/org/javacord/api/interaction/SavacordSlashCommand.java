package org.javacord.api.interaction;


import java.util.List;

public interface SavacordSlashCommand {
    void commandExecuted(SlashCommandInteraction interaction);
    default List<SlashCommandOption> getSlashCommandOptions(){return null;}
}
