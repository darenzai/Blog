package com.company;

import sun.plugin.javascript.navig.LinkArray;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        /*
//            List(有序可重复)
//
//         */
//
//
//        ArrayList<Integer> al=new ArrayList<>();
//        for (int i=0;i<10;i++){
//            al.add(i);
//        }
//        //以坐标为单位删除元素  删除下标为1的元素(从零开始)
//
//        al.add(2,100);
//        //al.remove(1);
//        for (int s1:al){
//            System.out.println("ArrayList :"+s1);
//        }
//
//        ArrayList<Integer> al1=new ArrayList<>();
//        al1.add(10);
//        //将整个集合里面的元素添加进去
//        al1.addAll(al);
//        System.out.println("al1集合里面的长度为 :" +al1.size());
//
//
//        /*
//            底层结构是链表 LinkedList 线程不安全
//
//         */
//        LinkedList<Integer> linkedList=new LinkedList();
//        for (int i=0;i<10;i++){
//            linkedList.add(i);
//        }
//
//
//        for (int linkedList1:linkedList){
//
//            System.out.println("LinkList  :"+linkedList1);
//
//        }
//        /*
//            vector 底层是数组 线程安全
//
//         */
//
//        Vector<Integer> vector =new Vector<>();
//        for (int i=0;i<10;i++){
//            vector.add(i);
//        }
//
//        for (int vector1:vector){
//            System.out.println("Vectorv :"+vector1);
//        }
//
//
//
//        /*
//                Set (主要特点是不可重复)
//                里面包含HashSet,TreeSet,LinkedHashSet
//                HashSet底层数据结构是哈希表
//                TreeSet底层数据结构是红黑树
//                LinkedHashSet底层数据结构是有哈希表和链表组成
//
//
//         */
//        HashSet<Integer> hashSet =new HashSet();
//        for (int i=0;i<10;i++){
//            hashSet.add(i);
//        }
//
//        for (int i=0;i<10;i++){
//            hashSet.add(i);
//        }

        ArrayList<Integer> al=new ArrayList<>();
        for (int i=10;i>1;i--){
            al.add(i);
        }
        al.remove(1);
        for (int i:al){
            System.out.println(i);
        }




    }
}
