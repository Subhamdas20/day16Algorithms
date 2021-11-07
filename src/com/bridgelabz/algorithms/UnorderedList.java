package com.bridgelabz.algorithms;

import com.bridgelabz.collection.LinkedList;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UnorderedList {
    /**
     * check the unordered list
     */
    public static void checkUnorderedList() throws IOException {
        LinkedList<String> list = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        Reader file = new FileReader("E:\\Day16AlgorithmsRpf77\\sentence.txt");
        Scanner sc = new Scanner(file);

        String st[] = new String[100];
        while (sc.hasNextLine()) {
            st = sc.nextLine().split(" ");

            for (int i = 0; i < st.length; i++) {
                list.append(st[i]);
            }
        }
        list.show();
        System.out.println("Enter word to search in list ");
        String input = scan.next();
        if (list.search(input) == true) {
            list.deleteElement(input);
        } else if (list.search(input) == false) {
            list.push(input);
        }
        list.show();
        FileWriter fw=new FileWriter("E:\\Day16AlgorithmsRpf77\\sentence2.txt");
        fw.write(list.show());
        fw.close();
    }


    public static void main(String[] args) throws IOException {
        checkUnorderedList();
    }
}