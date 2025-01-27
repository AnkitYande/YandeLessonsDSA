import java.util.*;

class Main {

  public static void main(String[] args) {
    // Test your LinkedList class here
    testLinkedList();

    // The rest of this assignment will just use a
    // series of nodes and not your LinkedList class
    Node<Integer> head = generateRandomLinkedList(10);
    System.out.print("original: ");
    printList(head);

    System.out.println("middle: " + findMiddleElement(head).value);

    int n = 4;
    Node<Integer> res = getNthFromLastElement(head, n);
    System.out.println(n + "th last element: " +
        (res == null ? "null" : res.value));

    System.out.print("reversed: ");
    printList(reverseList(head));

    System.out.println("contins cycle: " + containsCycle(head));
  }

  public static void testLinkedList() {
    LinkedList<Integer> l = new LinkedList<>();
    l.add(0);
    l.add(1);
    l.add(2);
    System.out.println(l);
    // Test the rest of your LinkedList methods here
  }

  public static Node<Integer> generateRandomLinkedList(int numItems) {
    Node<Integer> head = new Node<Integer>();
    Node<Integer> n = head;
    for (int i = 0; i < numItems; i++) {
      int randInt = (int) (Math.random() * 50);
      Node<Integer> n1 = new Node<Integer>(randInt);
      n.next = n1;
      n = n.next;
    }
    return head.next;
  }

  public static void printList(Node<Integer> head) {
    String s = "[";
    while (head != null) {
      s += (head.value + ", ");
      head = head.next;
    }
    System.out.println(s.substring(0, s.length() - 2) + "]");
  }

  public static Node<Integer> findMiddleElement(Node<Integer> head) {
    return new Node<Integer>();
  }

  public static Node<Integer> getNthFromLastElement(Node<Integer> head, int n) {
    return null;
  }

  public static Node<Integer> reverseList(Node<Integer> head) {
    return head;
  }

  public static boolean containsCycle(Node<Integer> head) {
    return false;
  }

}