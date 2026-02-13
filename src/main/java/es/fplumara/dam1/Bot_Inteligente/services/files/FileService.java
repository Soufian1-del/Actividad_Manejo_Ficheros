package es.fplumara.dam1.Bot_Inteligente.services.files;

public interface FileService {
    void appendLog(Integer channelId, String entry);
    String readAll(Integer channelId);
    String readlast(Integer channelId, Integer amountOfLines);
}
