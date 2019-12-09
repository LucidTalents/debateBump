package org.lucidTalents;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
// https://github.com/Discord4J/Discord4J/wiki/Getting-Started
// https://www.writebots.com/how-to-make-a-discord-bot/

public class Main {
    public static void main(String[] args) {
        String token = getToken("src/main/resources/token.json");
        System.out.println(token);
        // DiscordClient client = new DiscordClientBuilder(token).build();
        // This makes the client to actually login
    }

    private static String getToken(String fileName){
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(fileName))
        {
            //Read JSON file
            JSONObject obj = (JSONObject) jsonParser.parse(reader);
            String value = (String) obj.get("reaperToken");
            return value;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
