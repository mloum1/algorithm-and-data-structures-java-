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
    // find the length 
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
    // display node 
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