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
        System.out.println("The lenght is : " + count);
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

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connect them together to form a chain 
        sll.head.next = second;
        second.next = third;
        third.next = fourth; //fourth.next becomes null

        sll.display();
        sll.findLength();
    }
}