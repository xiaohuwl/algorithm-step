package com.xiaohuxiong.base.data_structure.node;

/**
 * @author: huwl
 * @date: 2021/5/6 23:14
 **/
public class DoubleNode {

    public int value;
    public DoubleNode pre;
    public DoubleNode next;
    public DoubleNode last;

    public DoubleNode(int value) {
        this.value = value;
    }

    //反转列表
    public DoubleNode reversalNode(DoubleNode head){
        DoubleNode prev = null;
        DoubleNode next = null;
        while (head.next != null){
            next = head.next;

            head.next = prev;
            head.last = next;
            prev = head;

            head = next;

        }

        return prev;
    }

    //删除指定位置的值
//    public Node deleteTargetValue(DoubleNode head , int targetValue){
//        DoubleNode cur = head;
//        while (cur!=null){
//            if (cur.value == targetValue){
//                if(cur.next == null && cur.pre ==null){
//                    return null;
//                }
//                if (cur.pre==null){
//                    head = head.next;
//                    head.last = null;
//                }else if(cur.next ==null){
//
//                }else{
//
//                }
//
//            }
//            cur = cur.next;
//        }
//    }

}
