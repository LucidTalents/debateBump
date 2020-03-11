package org.lucidTalents;

import org.lucidTalents.ReaperBot;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeoutException;

// https://github.com/Discord4J/Discord4J/wiki/Getting-Started
// https://www.writebots.com/how-to-make-a-discord-bot/

public class Main {
    public static void main(String[] args) {
        ReaperBot bot = new ReaperBot();
        try {
            bot.client.login().block(Duration.of(5, ChronoUnit.MINUTES));
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.exit(0);
    }
}
