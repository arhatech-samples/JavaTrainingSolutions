package com.techarha.training.java.InputOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author ankit.
 */
public class FileHandling {
    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String args[]) {
        File f1 = new File("/Projects/Output");
        File f2 = new File(f1,"hello.txt");


        String source = "This is a sample source for the file Output Stream Testing";

        OutputStream output = null;
        try {
            output = new FileOutputStream(f2);
            byte[] buffer = source.getBytes();

            for(byte b : buffer){
                output.write(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //File Input 1
        FileInputStream input =null;
        try {
            input  = new FileInputStream(f2);
            int x = input.available();
            int y= 0;
            byte[] bArr = new byte[x];
            while(y<x) {
                byte b =(byte) input.read();
                System.out.println(""+b);
                bArr[y] = b;
                y++;
            }
            String out = new String(bArr);
            System.out.println(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       //File Input2
        FileInputStream input2 =null;
        try {
            input2  = new FileInputStream(f2);

            int size = input2.available();
            byte[] b = new byte[size];
            input2.read(b);

            String out = new String(b);
            System.out.println(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}