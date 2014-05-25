package com.techarha.training.java.InputOutput;

import java.io.*;

/**
 * @author ankit.
 */
public class ReaderWriter {

    public static void main(String[] args) {
        File f1 = new File("/Projects/Output");
        File f2 = new File(f1,"hello.txt");
        FileWriter fWrite = null;
        FileReader fileReader = null;
        try {
            fWrite= new FileWriter(f2);

            fWrite.write("This is to test a File Writer \n This is the second line \n This is line 3");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileReader = new FileReader(f2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String s = null;
            do{
               s = bufferedReader.readLine();
               if (s!=null) {
                   System.out.println(s);
               }
            }while(s!=null);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

/*
  BufferedReader buffReader = new BufferedReader(fileReader.);

            String s = null;
            do {
                s = buffReader.readLine();
                System.out.println(s);
            }while(s!=null);

 */
