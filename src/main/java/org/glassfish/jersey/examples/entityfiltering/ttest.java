package org.glassfish.jersey.examples.entityfiltering;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Katz on 20.04.2017.
 *
 *
 * изменить размер можно в классе DesktopLauncher
 config.width = 800; 		config.height = 1200;
 */
public class ttest {
    public static void main(String[] args) {
        final int MAX = 100000;
        long startTime = 0;


        startTime = System.nanoTime();
        ArrayList<Integer> al = new ArrayList<Integer>(MAX);
        for (int i = 0; i < MAX; i++) al.add(i);
        System.out.println("AL add = " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < MAX; i++) ll.add(i);
        System.out.println("LL add = " + (System.nanoTime() - startTime));


        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) al.add(25000,i); //MAX / 2, i);
        System.out.println("AL expand = " + (System.nanoTime() - startTime));


        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            ListIterator<Integer> it = ll.listIterator(25000); //MAX / 2);
            it.add(i); //new Integer(i));
        }
        System.out.println("LL expand = " + (System.nanoTime() - startTime));

    }
}
