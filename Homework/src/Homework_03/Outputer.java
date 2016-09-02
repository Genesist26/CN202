package Homework_03;


import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genesis
 */
public class Outputer {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        RandomAccessFile file = new RandomAccessFile("E:\\output.bin","rw");
        /*
        float f = 15.5f;
        float g = 18.5f;
        
        file.writeFloat(f);
        file.writeFloat(g);
                */
        
        for(int i = 0; i < file.length()/4; i++)
                {
                    System.out.println(file.readInt());                
                }
    }
        
   
}
