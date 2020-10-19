package com.company;
import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;
import java.util.LinkedList;

public class MoveToFront {

    // apply move-to-front encoding, reading from standard input and writing to standard output
    public static void encode(){
        LinkedList<Character> seq = new LinkedList<>();
        for(int i=0;i<256;i++){seq.add((char) i);}
        while(!BinaryStdIn.isEmpty()){
            char c = BinaryStdIn.readChar();
            byte a = (byte) seq.indexOf(c);
            BinaryStdOut.write(a);
            seq.remove(a);
            seq.addFirst(c);
        }
    }

    // apply move-to-front decoding, reading from standard input and writing to standard output
    public static void decode(){
        LinkedList<Character> seq = new LinkedList<>();
        for(int i=0;i<256;i++){seq.add((char) i);}
        byte a = BinaryStdIn.readByte();
        char c = (char) a;
        BinaryStdOut.write(c);
        seq.remove(seq.indexOf(c));
        seq.addFirst(c);
    }

    // if args[0] is "-", apply move-to-front encoding
    // if args[0] is "+", apply move-to-front decoding
    public static void main(String[] args){
        if(args[0].equals("-")) encode();
        if(args[0].equals("+")) decode();
    }
}
