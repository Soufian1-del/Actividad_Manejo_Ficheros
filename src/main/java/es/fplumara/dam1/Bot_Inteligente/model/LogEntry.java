package es.fplumara.dam1.Bot_Inteligente.model;

import java.time.LocalDate;

public class LogEntry {
    private LocalDate timestamp;
    private String author;
    private String content;
    private Integer channelId;

    //Constructor
    public LogEntry(LocalDate timestamp, String author, String content, Integer channelId) {
        this.timestamp = timestamp;
        this.author = author;
        this.content = content;
        this.channelId = channelId;
    }

    //getters, setters
    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
}
