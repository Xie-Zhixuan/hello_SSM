package com.xzx.dao;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test_List {
    @Test
    public void ListAddList(){
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.addAll(l1);
        System.out.println(l2);
    }

}
