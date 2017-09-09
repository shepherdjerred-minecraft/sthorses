package com.shepherdjerred.sthorses.files;

import com.shepherdjerred.sthorses.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.*;

public class ConfigHelper {

    public static void loadConfigs() {

        Main.getInstance().saveDefaultConfig();
        Main.getInstance().getConfig().setDefaults(YamlConfiguration.loadConfiguration(new File("config.yml")));
        Main.getInstance().getConfig().options().copyDefaults(true);
        Main.getInstance().saveConfig();

        FileManager.getInstance().loadFiles();

    }

}
