package com.shepherdjerred.sthorses.files;

import com.shepherdjerred.sthorses.Main;

public class ConfigHelper {

    public static void loadConfigs() {

        Main.getInstance().saveDefaultConfig();
        Main.getInstance().saveConfig();

        FileManager.getInstance().loadFiles();

    }

}
