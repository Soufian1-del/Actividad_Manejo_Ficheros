package es.fplumara.dam1.Bot_Inteligente;

import es.fplumara.dam1.Bot_Inteligente.bot.BotListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class BotMain {
    // Pon aquí el ID del servidor de pruebas (Guild ID)
    private static final String GUILD_ID = "1468560309974339689";

    public static void main(String[] args) throws Exception {
        String token = System.getenv("DISCORD_TOKEN");
        if (token == null || token.isBlank()) {
            throw new IllegalStateException("Falta DISCORD_TOKEN en variables de entorno");
        }

        // 2) Arrancamos JDA y registramos el bot Listener
        JDA jda = JDABuilder.createDefault(token)
                .addEventListeners(new BotListener())
                .build()
                .awaitReady();

        // 3) Registramos slash commands
        var guild = jda.getGuildById(GUILD_ID);
        if (guild == null) {
            throw new IllegalStateException("No encuentro el guild con id " + GUILD_ID);
        }
    }
}
