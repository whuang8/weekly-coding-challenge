import junit.framework.*;

public class Tests extends TestCase {
  protected Node n;

  protected void setUp() {
    n = new Node(1);
  }

  public void testInsert() {
    Node head = n.insert(n, 2);
    assertEquals(head.data, 2);
    assertEquals(head.next.data, 1);
  }

  public void testFind() {
    Node head = n.insert(n, 2);
    Node result = n.find(head, 1);
    assertEquals(result.data, 1);
  }

  public void testFindFailure() {
    Node head = n.insert(n, 2);
    Node result = n.find(head, 5);
    assertEquals(result, null);
  }

  public void testRemove() {
    Node head = n.insert(n, 2);
    head = n.insert(head, 3);
    Node result = n.remove(head, 2);
    assertEquals(result.data, 2);
    assertEquals(head.next.data, 1);
  }

  public void testRemoveFailure() {
    Node head = n.insert(n, 2);
    head = n.insert(head, 3);
    Node result = n.remove(head, 5);
    assertEquals(result, null);
  }
}
