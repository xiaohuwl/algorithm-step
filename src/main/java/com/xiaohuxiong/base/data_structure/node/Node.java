package com.xiaohuxiong.base.data_structure.node;

/**
 * @author: huwl
 * @date: 2021/5/6 23:12
 **/
public class Node {

    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }

    //反转列表
    public Node reversalNode(Node head){
        Node prev = null;
        Node next = null;
        while (head.next != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head= next;
        }
        return prev;
    }

    //删除指定位置的值
    public Node deleteValue(Node head,int num){
//        Node prev = null;
        Node next = null;
        int i = 0;
        while (head.next != null){
            if (i!=num){
                i++;
                head = head.next;
            }else {
                head = head.next.next;
            }
        }

        return head;
    }

    //删除值为value的指定位置的值
    public Node deleteTargetValue(Node head , int targetValue){

        while (head!=null){
            if (head.value != targetValue){
                break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur  = head;
        while (cur !=null){
            if (pre.value == targetValue){
                pre.next=cur.next;
            }else{
                cur = pre;
            }
            cur = cur.next;
        }


        return cur;
    }
}
