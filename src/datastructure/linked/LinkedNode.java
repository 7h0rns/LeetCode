package datastructure.linked;


import com.sun.deploy.panel.ITreeNode;

/**
 * @author 7h0rns_J1ng
 * @create 2019-05-22 10:25
 * 1、链表的基本操作
 * 遍历链表
 * 在列表中插入一个元素
 * 在列表中删除一个元素
 */
public class LinkedNode {

    //单项链表的长度
    static int lenLinkedNode(ListNode headNode) {
        int len = 0;
        ListNode currentListNode = headNode;
        while (currentListNode.getNext() != null) {
            len++;
            currentListNode = currentListNode.getNext();
        }
        return len;
    }
    //删除元素
    ListNode removeListNodeFromListNode(ListNode headNode, int value){

        if (headNode.getValue() == value){
            ListNode currentNode = headNode;
            headNode = null;
            return currentNode;
        }else {
            while (headNode.getNext() != null) {
                ListNode prev = headNode;
                if (headNode.getNext()!= null)
                if (headNode.getNext().getValue() == value) {
                    prev.setNext(headNode.getNext().getNext());
                }
            }
        }
        return headNode;
    }

}
