package Сalculator;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    public static void logger(String string) throws IOException {
        FileWriter logger = new FileWriter("C:\\Users\\Энвер\\Desktop\\OOP\\HW_5\\Сalculator\\log.txt", true);
        DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String time = dateF.format(cal.getTime());
        logger.append('\n');
        logger.append(time);
        logger.append(" |");
        logger.append(string);
        logger.close();
        }

    }

