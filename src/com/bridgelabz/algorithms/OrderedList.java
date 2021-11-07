package com.bridgelabz.algorithms;


import com.bridgelabz.collection.LinkedList;
import com.bridgelabz.collection.Stack;

import java.util.*;
import java.io.*;
public class OrderedList {
    /*
    * takes input from txt file and sort it
    * */

    public static void checkOrderedList() throws IOException {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Reader file = new FileReader("E:\\Day16AlgorithmsRpf77\\Numbers.txt");
        BufferedReader read = new BufferedReader(file);

        String st = read.readLine();
        while((st=read.readLine()) != null) {
            StringTokenizer stn = new StringTokenizer(st);
            int num = Integer.parseInt(stn.nextToken());
            list.push(num);
        }
        list.sortList();
        list.show();

    }
    public static void main(String[] args) throws IOException {
       checkOrderedList();

}
}
