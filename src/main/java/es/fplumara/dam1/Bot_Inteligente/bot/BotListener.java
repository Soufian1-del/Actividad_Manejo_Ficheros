package es.fplumara.dam1.Bot_Inteligente.bot;

import es.fplumara.dam1.Bot_Inteligente.bot.commands.CommandRegistry;
import es.fplumara.dam1.Bot_Inteligente.config.AppConfig;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.IOException;

public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // Ignorar mensajes de otros bots
        if (event.getAuthor().isBot()) return;

        String mensaje = event.getMessage().getContentRaw();
        String usuario = event.getAuthor().getName();

        System.out.println(event.getChannel().getName() + " - " + usuario + ": " + mensaje);
        // Delegar a CommandRegistry si empieza por "!"
        if (mensaje.startsWith("!")) {
            CommandRegistry commandregistry = new CommandRegistry();

        //Logs enabled true o false
        try {
            AppConfig appconfig = new AppConfig();
            if (appconfig.isLogsEnabled()) {
                ///  CREAR lOGeNTRY Y LLAMA a fILEsERVICE.APPENDlOG...
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     }
    }
}
