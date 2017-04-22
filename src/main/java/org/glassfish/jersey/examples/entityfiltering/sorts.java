package org.glassfish.jersey.examples.entityfiltering;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Katz on 21.04.2017.
 */
public class sorts {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(6);
        ar.add(3);
        ar.add(1);
        ar.add(2);
        ar.add(9);
        ar.add(5);

        Integer temp;
        Integer buf;
//        for (int i = 0; i < ar.size(); i++) {
//            for (int j = 0; j < ar.size(); j++) {
//                if (ar.get(i) < ar.get(j)) {
//                    buf = ar.get(i);
//                    temp = ar.get(j);
//                    ar.remove(i);
//                    ar.add(i, temp);
//                    ar.remove(j);
//                    ar.add(j, buf);
//                }
//            }
//        }
//        for (Integer b : ar) {
//            System.out.println("b = " + b);
//        }


        Integer min;
        for (int k = 1; k < ar.size() - 1; k++) {
            min = k;
            for (int i = k + 1; i < ar.size(); i++) {
                if (ar.get(i) < ar.get(min)) {
                    min = i;
                    temp = ar.get(min);

                    ar.remove(min);
                    ar.add(min, ar.get(k));

                    ar.remove(k);
                    ar.add(k, temp);
                }
            }
        }

        for (Integer x : ar) {
            System.out.println("x = " + x);
        }


//        Integer mmin;
//        for (int i = 0; i < ar.size(); i++) {
//            mmin = ar.get(i);
//            for (int j = i + 1; j < ar.size(); j++) {
//                if (mmin > ar.get(j)) {
//                    buf = ar.get(i);
//                    mmin = ar.get(j);
//                    ar.remove(i);
//                    ar.add(i, mmin);
//                    ar.remove(j);
//                    ar.add(j, buf);
//                }
//            }
//        }
//        for (Integer n : ar) {
//            System.out.println("n = " + n);
//        }


//        Integer min;
//        Integer next;
//        Integer buf;
//        Integer bufInd;
//        Integer minInd;
//        Integer nextInd;
//
//        for (int i = 0; i < ar.size(); i++) {
//            min = ar.get(i);
//            minInd = i;
//
//            for (int j = i + 1; j < ar.size(); j++) {
//                next = ar.get(j);
//                nextInd = j;
//                if (min > next) {
//                    buf = min;
//                    min = ar.get(j);
//                    ar.add(j, buf);
//
//
//                    //bufInd = i;
//
//
//                }
//            }
//        }


    }

}
