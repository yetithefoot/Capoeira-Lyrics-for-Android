package com.alximik.capoeiralyrics.db;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author alximik
 * @since 29.06.12 7:30
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    public static void main(String[] args) throws SQLException, IOException {
        writeConfigFile("songs_ormlite_configconfig.txt");
    }
}