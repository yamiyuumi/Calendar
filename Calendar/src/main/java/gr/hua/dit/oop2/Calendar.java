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
        boolean ics = false;


        if (argc==0) {
            System.out.println("You havent provived any input");
            exit(0);


        }
        if(argc==1){
            //kobei ta panta apo to arxeio kai menei mono h katalhjh px ics
            String type = args[0].substring(args[0].length() - 3, args[0].length());
            //   opt = type.equals(".ical");
            ics = type.equals("ics");


            if (ics) {
                //display calendar
                System.out.println(argc);
                System.out.println("YUH-UH!");

                String fileName = args[0];

                EventOptions.ReadFile(fileName   );


            } else {
                ///display TXT
                System.out.println(argc);
                System.out.println("NUH-UH!");

                String fileName = args[0];
                EventOptions.ReadFile(fileName);

            }
        }else if (args.length == 2 ) {
            //kobei ta panta apo to arxeio kai menei mono h katalhjh px ics
            String type = args[1].substring(args[1].length() - 3, args[1].length());
            //   opt = type.equals(".ical");
            ics = type.equals("ics");

            System.out.println(args[0]);


            if (ics) {
                //display calendar
                System.out.println(argc);
                System.out.println("YUH-UH!");

                String fileName = args[1];

                EventOptions.ReadFile(fileName);

            } else {
                ///display TXT
                System.out.println(argc);
                System.out.println("NUH-UH!");

                String fileName = args[1];

                EventOptions.ReadFile(fileName);
            }
        }
    }

}

// check  Event heyo = new Event("10-10-20","eeeeee","ena event","2:23");
//        System.out.println(heyo);
//        Appointment heyoo = new Appointment("10-10-20","eeeeee","ena event","2:23","5 hours");
//        System.out.println(heyoo);
//        Task heyooo = new Task("10-10-20","eeeeee","ena event","2:23","20-10-20",true);
//        System.out.println(heyooo);
