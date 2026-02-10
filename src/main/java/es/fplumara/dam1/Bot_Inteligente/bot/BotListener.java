package es.fplumara.dam1.Bot_Inteligente.bot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        // Ignorar mensajes de otros bots
        if (event.getAuthor().isBot()) return;

        String mensaje = event.getMessage().getContentRaw();
        String usuario = event.getAuthor().getName();




        System.out.println(event.getChannel().getName()+" - " +usuario + ": " + mensaje);







    }
}
