package gr.hua.dit.oop2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.exit;
//import Calendar

public class Calendar {
    public static void main(String[] args) {
        System.out.println("unmmmmm!");
        int argc = args.length;
        //save valid argument number
        int filenum = EventOptions.checkArgumentNumber(argc);
        //if 1 argument filenum=0 , 2 arguments filenum=1 and this is where the .ics is
        String type = EventOptions.assignFirstArgumentType(args[filenum]);
        System.out.println(type);
        //save and print out .ics file
        String fileName = args[filenum];
        EventOptions.ReadFile(fileName);


    }

}
