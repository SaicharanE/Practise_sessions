package com.main.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        try
        {
            File file=new File("/Users/saicharanepparapally/Desktop/gfull.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters

            String line = br.readLine();

                line = br.readLine();
                //names.add(line);
                //System.out.println(names);

            String str = line;
            str.trim();
            String[] arrOfStr = str.split(" ");

            for (String a : arrOfStr)
                //System.out.println(a);
                if(a.contains("wk")){

                    names.add(String.valueOf(sb));
                }

            System.out.println(names);



            fr.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
}
