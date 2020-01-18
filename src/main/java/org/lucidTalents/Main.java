package org.lucidTalents;

import org.lucidTalents.ReaperBot;

// https://github.com/Discord4J/Discord4J/wiki/Getting-Started
// https://www.writebots.com/how-to-make-a-discord-bot/

public class Main {
    public static void main(String[] args) {
        ReaperBot bot = new ReaperBot();
        System.out.println(bot.token);
        //bot.login(bot.getToken());
    }
}
