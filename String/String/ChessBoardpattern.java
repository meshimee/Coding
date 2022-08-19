package String;

public class ChessBoardpattern {
          static Node head;
          static class Node{
                    int data;
                    Node next;
                    Node(int d){
                              data = d;
                              next = null;
                    }
          }
          public static void main(String[] args) {
                    Node n1 = new Node(16);
                    Node n2 = new Node(12);
                    Node n3 = new Node(4);
                    Node n4 = new Node(2);
                    Node n5 = new Node(5);
                    Node head = n1;
                    n1.next = n2;
                    n2.next = n3;
                    n3.next = n4;
                    n4.next = n5;
                    n5.next = null;
                    reverse(head);

          }
          private static void reverse(Node head) {
          Node curr = head;
          Node prev = null;
        
           while(curr != null){
                     Node temp = curr.next;
                     curr.next = prev;
                     prev = curr;
                     curr = temp;
        }
        while(prev != null){
            System.out.println(prev.data);
            prev = prev.next;
        }
        
          }

          
}
