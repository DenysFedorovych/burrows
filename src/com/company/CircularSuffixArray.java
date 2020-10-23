package com.company;

import java.util.LinkedList;

public class CircularSuffixArray {
    private class Suffix implements Comparable<Suffix>{
        public String string;
        public int k;
        public Suffix(String string, int k){
            this.string = string;
            this.k = k;
        }
        public int compareTo(Suffix a){
            if(this.k>a.k){
                int l = this.string.substring(this.k).compareTo(a.string.substring(a.k,a.k+string.length()-this.k));
                if(l!=0) return l;
                else{
                    int m = this.string.substring(0,this.k-a.k).compareTo(a.string.substring(a.k+string.length()-this.k));
                    if(k!=0) return m;
                    else{
                        return this.string.substring(this.k-a.k,this.k).compareTo(a.string.substring(0,a.k));
                    }
                }
            }
            else{
                int l = this.string.substring(this.k,this.k-a.k+this.string.length()).compareTo(a.string.substring(a.k));
                if(l!=0) return l;
                else{
                    int m= this.string.substring(this.k+this.string.length()-a.k).compareTo(a.string.substring(0,this.k-a.k));
                    if(m!=0) return m;
                    else{
                        return this.string.substring(this.k).compareTo(a.string.substring(this.k-a.k,a.k));
                    }
                }
            }
        }
    }
    // circular suffix array of s
    public CircularSuffixArray(String s){

    }

    // length of s
    public int length()

    // returns index of ith sorted suffix
    public int index(int i)

    // unit testing (required)
    public static void main(String[] args)

}
