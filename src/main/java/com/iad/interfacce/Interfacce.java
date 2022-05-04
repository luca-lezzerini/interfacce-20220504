/*
 */

package com.iad.interfacce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author use
 */
public class Interfacce {

    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        alist.add("Ciao");
        alist.add("a");
        alist.add("tutti!");
        System.out.println(alist.size());
        List<String> llist = new LinkedList<>();
        llist.add("Ciao");
        llist.add("a");
        llist.add("tutti!");
        System.out.println(llist.size());
        
    }
}
