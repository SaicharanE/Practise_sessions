package com.main.test;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;


public class GFG {

    public static void main(String[] args) throws Exception
    {

    List name = new ArrayList();
    List name_players = new ArrayList();
    List team = new ArrayList();
    List wk = new ArrayList();
    List bat = new ArrayList();
    List bowl = new ArrayList();
    List ar = new ArrayList();


    try
        {
            File file=new File("/Users/saicharanepparapally/Desktop/gfull.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while((line=br.readLine())!=null)
            {

                if(line.contains("wicket")){
                    wk.add(line);
                }
                if(line.contains("bowler")){
                    bowl.add(line);
                }
                if(line.contains("batsman")){
                    bat.add(line);
                }
                if(line.contains("AllRound")){
                    ar.add(line);
                }

            }
            fr.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        System.out.println(wk);
        System.out.println(bowl);
        System.out.println(bat);
        System.out.println(ar);

    }
}



