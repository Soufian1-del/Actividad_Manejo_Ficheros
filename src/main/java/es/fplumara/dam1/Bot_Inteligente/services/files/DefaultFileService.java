package es.fplumara.dam1.Bot_Inteligente.services.files;

import es.fplumara.dam1.Bot_Inteligente.config.AppConfig;

import java.io.IOException;

public class DefaultFileService {
    public DefaultFileService() throws IOException {
        AppConfig appconfig = new AppConfig();
        //Decidir modo TXT o CSV, ruta base y máximo de cáracteres
        appconfig.getLogsMode();
        appconfig.getLogsDir();
        appconfig.getLogsMaxMessageLength();
        //Construir el Path del log por canal
        //Obtener TxtLogStore o CsvLogStore usando LogStoreFactory

    }
}
