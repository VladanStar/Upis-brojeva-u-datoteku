package com.company;

import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main();
    }

    public void upisiUFajlBrojeve() {
        // upisivanje brojeva u fajl
        PrintWriter upisUFajl;
        try {
            upisUFajl = new PrintWriter("brojevi.txt");
            for (int i = 0; i <= 10; i++) {
                upisUFajl.println(i);
            }
            upisUFajl.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Main() {
        upisiUFajlBrojeve();
        int[] niz = ucitajBrojeveUNiz();
        upisiNizUFajl(niz);
    }

    public void upisiNizUFajl(int[] niz) {
        PrintWriter upisUFajl;
        try {
            upisUFajl = new PrintWriter("brojevi.txt");
            for (int i = 0; i < niz.length; i++) {
                upisUFajl.println(niz[i] * 5);
            }
            upisUFajl.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int[] ucitajBrojeveUNiz() {
        int[] niz = new int[10];
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("brojevi.txt"));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                //niz[i] = Integer.parseInt(line);
                i++;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return niz;
    }

}
