/**
 * This class represents a singly linked list.
 * 
 * @author Loum Maniang
 * @version 1.0
 * @since 2024-07-04
 */
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        //constructor 
        public ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }


   
    public int findLength(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        //condition d'  arret 
        while (current != null) {
           count++;
           current = current.next; 
        }
        return count;
    }
    
    public void display(){
        ListNode current = head;
        //we use while loop because we know the end of the nodes
        while (current != null) {
            System.out.println(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head ;
        head = head.next;
        temp.next = null;
        return temp;
    }
    /**
    * Deletes the last node from the list of node.
    * 
    * @return the deleted last node, or the head if the list is empty or has only one node
    */
    public ListNode deleteLast(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    //Q . Implement method to insert a node at a given position.
    // Assuming position to be valid and starting from 1.
    public void insertAtPosition(int value, int position){
        ListNode node = new ListNode(value);
        // Check if is a valid position to insert to avoid error throw exception
        if (position < 1 || position > findLength() + 1){
            throw new IllegalArgumentException("Invalid position: " + position);
        }
        if (position == 1){
           node.next = head;
           head = node; 
        }else{
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
    //Q. Implement method to delete a node at a given position. Assuming position to valid and starting from 1.
    /**
     * Deletes a node given position
     * @param  args the position of the targetted node
     * @throws IllegalArgumentException if the position unknown
     * @return the new list node
     */
    public void deleteAtPosition(int position){
        if (position < 1 || position > findLength() + 1){
            throw new IllegalArgumentException("Invalid position: " + position);
        }
        if (position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }

     }

    public boolean find(ListNode head, int searchKey){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //reverse a singly linked in java 
    public ListNode reverseSinglyLinkedList(ListNode head){
        if(head == null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    //Q . how to find nth node from the end of a linked list ?
    public ListNode getNthNodeFromEnd(int n ){
        if(head == null){
            return null;
        }
        if (n <= 0 ){
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            if (refPtr == null){
                throw new IllegalArgumentException(n + "is greater than the number of the nodes in list ");
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public ListNode getMiddleNode(){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
           slowPtr = slowPtr.next;
           fastPtr = fastPtr.next.next; 
        }
        return slowPtr;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.insertFirst(11);
        sll.insertAtPosition(10, 1);
        sll.insertAtPosition(12, 2);
        sll.insertAtPosition(8, 1);
        sll.insertAtPosition(32, 10);
        sll.display();
        System.out.println("The length is : " + sll.findLength());
    }

}