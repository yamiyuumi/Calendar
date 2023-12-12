package gr.hua.dit.oop2;

import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EventOptions {
    Logger logger;

    public static int checkArgumentNumber(int arguments){
        int num=0;

        if(arguments<1) {
            System.out.println("not enough arguments");//logger.fatal("Please give 1 or 2 arguments.");
//            logger.info("Exiting..");
            System.exit(1);
        } else if(arguments>2) {
            System.out.println("more than enough arguments");//logger.fatal("Please give 1 or 2 arguments.");
            System.exit(1);
        } else if(arguments==1){
            System.out.println("that's 1 argument");
            num=0;
        }else if(arguments==2){
            System.out.println("that's 2 arguments");
            num=1;
        }
        return num;
    }

    public static String assignFirstArgumentType(String argument) {
        //case-insensitive check for argument ending with .txt
        if(argument.toLowerCase().endsWith(".txt") ){
            ////logger.debug("First Argument ends with '.txt'.");
            return "txt";
        //case-insensitive check for argument ending with .ics
        }else if(argument.toLowerCase().endsWith(".ics") ) {
            ////logger.debug("First Argument ends with '.ics'.");
            return "ics";
        }else { //incorrect input
            return "error";
        }
    }
    public static void ReadFile( String fileName){

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
