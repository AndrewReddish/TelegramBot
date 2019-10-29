import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MainClass {
    //private static final Logger logger = LogManager.getLogger(MainClass.class);
    public static void main(String[] args) {
        System.out.println("test");
        ApiContextInitializer.init();



        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MyBot());
            //logger.trace("Entering application.");
        } catch (TelegramApiException e) {
            e.printStackTrace();

        }
    }
}
