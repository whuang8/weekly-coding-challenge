class Node {
  Node next;
  int data;

  Node(int data) {
    this(null, data);
  }

  Node(Node head, int data) {
    this.next = head;
    this.data = data;
  }
}
