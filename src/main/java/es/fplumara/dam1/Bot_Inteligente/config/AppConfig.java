package es.fplumara.dam1.Bot_Inteligente.config;

import es.fplumara.dam1.Bot_Inteligente.model.LogMode;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppConfig {
    private boolean logsEnabled;
    private LogMode logsMode;
    private String logsDir;
    private Integer logsMaxMessageLength;
    //constructores
    public AppConfig() throws IOException {
        Path path = Path.of("C:\\Users\\SoufianAhidarDakkaki\\actividades_ficheros\\src\\main\\java\\es\\data\\config.properties");
        Properties props = new Properties();
        InputStream in = Files.newInputStream(path);
        boolean logsEnabled = Boolean.parseBoolean(props.getProperty("logs.enabled", "true"));
        String values = props.getProperty("logsMode", "TXT");
        if(values.equalsIgnoreCase("TXT")){
           logsMode = LogMode.TXT;
        }else{
            logsMode = LogMode.CSV;
        }
        logsDir = props.getProperty("logsDir");
        logsMaxMessageLength = Integer.parseInt(props.getProperty("logsMaxMessageLength"));
    }

    //getters y setters
    public boolean isLogsEnabled() {
        return logsEnabled;
    }

    public void setLogsEnabled(boolean logsEnabled) {
        this.logsEnabled = logsEnabled;
    }

    public LogMode getLogsMode() {
        return logsMode;
    }

    public void setLogsMode(LogMode logsMode) {
        this.logsMode = logsMode;
    }

    public Integer getLogsMaxMessageLength() {
        return logsMaxMessageLength;
    }

    public void setLogsMaxMessageLength(Integer logsMaxMessageLength) {
        this.logsMaxMessageLength = logsMaxMessageLength;
    }
}
