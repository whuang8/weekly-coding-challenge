<p align="center">
  <img src ="http://www.programminginterview.com/themes/acquia_marina/images/xkcd/forgetting.png" />
</p>

# Week 1
###### 10/16/2017 - 10/23/2017

Implement the following methods of a linked list:
- insert()
- find()
- remove()

The base definition of a Linked List Node is defined in `Node.java`. Implement the 3 additional methods in the same file.

### insert
```java
Node insert(Node head, int data);
```
Insertion will happen at the head of the linked list. The method returns the new head of the Linked List.

### find
```java
Node find(Node head, int value);
```
Find will return a node from the Linked List with the given value. Null is returned if no node is found.

### remove
```java
Node remove(Node head, int value);
```
Remove will remove a node with a given value from the Linked List and return that node. Null is returned if no node is removed.

## Testing
`$ make test`

## Source
Exercise from [Programming Problems in Java](https://www.amazon.com/Programming-Problems-Java-Technical-Interview-ebook/dp/B00XZ1LYBK/ref=dp_kinw_strp_1)
