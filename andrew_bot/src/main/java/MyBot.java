import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;

public class MyBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        /*System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());*/

        String command = update.getMessage().getText();
        ArrayList<String> requests = new ArrayList<String>();
        SendMessage message = new SendMessage();

        if (command.equals("/myname")) {
            System.out.println(update.getMessage().getFrom().getFirstName()
            +update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getFirstName() + " "
            + update.getMessage().getFrom().getLastName());
        } else if (command.equals("/myfirstname")) {
            System.out.println(update.getMessage().getFrom().getFirstName());

            message.setText(update.getMessage().getFrom().getFirstName());
        } else if (command.equals("/mylastname")) {
            System.out.println(update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getLastName());
        } else if (command.equals("Hi") || command.equals("Hello") || command.equals("Hey") || command.equals("Привет")) {
            message.setText("Hi, " + update.getMessage().getFrom().getFirstName());
        } else if (command.contains("Time") || command.contains("time")) {
            message.setText("It's time to eat!");
            SendSticker sticker = new SendSticker();
        } else {
            message.setText("What do you want, human?");
        }

        message.setChatId(update.getMessage().getChatId());


        try {
            execute(message);
            requests.add(command);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println(requests);
    }

    public String getBotUsername() {
        return "DiscoRediscaBot";
    }

    public String getBotToken() {
        return "886858779:AAFJ-zHjv6qrkgh6Ea6HHcO3SV64sgHYIiQ";
    }
}
