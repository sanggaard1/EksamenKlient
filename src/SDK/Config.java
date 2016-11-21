package SDK;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;

/**
 * Created by Sanggaard on 21/11/2016.
 */
public class Config {

    public JsonObject initConfig() {

        // Tidligere version:
      //  Gson gson = new Gson();
      //  BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("/config.json")));
      //  ConfigMap config = gson.fromJson(br, ConfigMap.class);
        // config.setDbUrl(config.getDbUrl());

        JsonObject json = new JsonObject();

        try {
            JsonParser parserJ = new JsonParser();
            json = (JsonObject) parserJ.parse(new FileReader("src/config.json"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;

    }
        private static String DbUrl;

    public static String getDbUrl() {
        return DbUrl;
    }

    public static void setDbUrl(String dbUrl) {
        DbUrl = dbUrl;
    }
}
