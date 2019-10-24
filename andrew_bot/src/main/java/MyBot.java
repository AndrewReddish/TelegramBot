import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return "DiscoRediscaBot";
    }

    public String getBotToken() {
        return "886858779:AAFJ-zHjv6qrkgh6Ea6HHcO3SV64sgHYIiQ";
    }
}
