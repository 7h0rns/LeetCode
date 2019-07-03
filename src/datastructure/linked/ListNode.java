package datastructure.linked;

/**
 * @author 7h0rns_J1ng
 * @create 2019-05-22 10:26
 */
public class ListNode {
    private ListNode prev;
    private int value;
    private ListNode next;

    public ListNode() {
    }

    //单向结点

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    //双向结点

    public ListNode(ListNode prev, int value, ListNode next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
