Java Collections Framework

• Collections framework provides a set of interfaces and classes to implement various data structures and
algorithms.
• Collections framework is contained in java.util package.
• It allows the programmers to program at the interfaces, instead of the actual implementation.
• A well designed framework can improve your productivity and provide ease of maintenance.
• The Java Collection Framework package (java.util) contains:
1. A set of interfaces
2. Implementation classes
3. Algorithms (like sorting and searching)
• Java Collections are similar to containers that consists of multiple items in a single unit. for e,g. collections of
books, list of names etc.
• Collections framework provides unified architecture for manipulating and representing collections.
• Java collection framework can perform following activity :
- Add objects to collection
- Remove objects from collection
- Search for an object in collection
- Retrieve/get object from collection
• Collection framework contains different types of collections such as lists, sets, maps, stacks, queues, etc.
Following is the Java Collections Framework hierarchy:
• Collection interface is the root interface from which the interfaces List, Set,Queue are extended.
• There are some other classes in collection framework which do not extend Collection Interface they
implement Map interface.


1. Collections Interfaces :
- This is the root of the collection hierarchy.
- A collection represents a group of objects known as its elements.
- List, Queue and Set are all sub interfaces of collection interface.
- It extends Iterable interface.
- Iterable interface has only one method called iterator().

2 List Interface :
- List Interface represents an ordered or sequential collection of objects.
- The classes which implement the List interface are called as Lists.
- Elements can be inserted or removed from a specific position.
- List interface extends Collection interface.
- List interface is an ordered collection in which duplicate elements are also allowed

3. Queue Interface:
- The Queue Interface extends Collection interface.
- Queue is a data structure in which elements are added from one end and elements are deleted from
another end.
- It follows FIFO pattern i.e. First in First out except priority queue.
- In a priority queue, elements are assigned priorities
• Deque Interface:
- The Deque Interface is the short name for “Double Ended Queue”.
- The Deque interface defines the methods needed to insert, retrieve and remove the elements from both
ends.
- It follows both (queue) FIFO & (stack) LIFO pattern.
- Deque can have duplicate elements

.
4. Set Interface:
- The Set interface defines a set.
- The set is a linear collection of objects with no duplicates.
- The Set interface extends Collection interface.
- Methods are inherited from collection interface as it does not have it’s own methods.


5. SortedSet Interface:
- The SortedSet interface extends Set interface.
- SortedSet is a set in which elements are placed according to supplied comparator.
- This Comparator is supplied while creating a SortedSet.
- If you don’t supply comparator, elements will be placed in ascending order.
- Unlike others, it doesn’t inherit from Collection interface.
- Map is an object of key-value pairs where each key is associated with a value.
- A map can not have duplicate keys but can have duplicate values.
- Each key-value pairs of the map are stored as Map.
- The common implementations of Map interface are HashMap, LinkedHashMap and TreeMap.


6. SortedMap Interface:
- It provides sorting of keys stored in a map.
- It extends the Map interface.
- The SortedMap interface includes all the methods of the Map interface.
- In order to use the functionalities of the SortedMap interface, we need to use the class TreeMap that
implements it.


7. NavigableMap Interface :
- It is considered as a type of SortedMap.
- In order to use the functionalities of the NavigableMap interface, we need to use the TreeMap class that
implements Navigable Map.
- NavigableMap extends the SortedMap interface.


8. ArrayList Class:
- ArrayList is same like normal array but it can grow and shrink dynamically to hold any number of elements.
- ArrayList class implements List interface and extends AbstractList.
- It also implements 3 interfaces like RandomAccess, Cloneable and Serializable.
- In Arraylist first element will be placed at index 0 and last element at index n-1.
- ArrayList can have duplicate elements

import java.util.ArrayList;
public class arrayList {
public static void main(String[] args)
{
ArrayList list = new ArrayList();
list.add(“FIRST”);
list.add(“SECOND”);
list.add(“THIRD”);
list.add(“FOURTH”);
list.add(“FIFTH”);
for (int i = 0; i < list.size(); i++) {
System.out.println(list.get(i));
}
System.out.println(“Size of array ” + list.size());} }
Post completion of the activity trainer will share the feedback/ suggestions on the work done by the participants.

9. Vector Class:
- The Vector Class is also dynamically growable and shrinkable collection of objects like an ArrayList class.
- Vector class is preferred over ArrayList class for multi threaded application.
- All methods of Vector class are synchronized so that only one thread can execute them at any given time.
- The main feature of Vector class is that it is thread safety.

10. LinkedList Class:
- Elements in the LinkedList are called as nodes.
- Each node consist of 3 parts i.e. Reference To Previous Element, Value Of The Element and Reference To
Next Element.
- Elements can be inserted at both the ends and also in the middle of the LinkedList.
- The LinkedList can be used as stack. It has the methods pop() and push() which make it to function as
Stack.


11. PriorityQueue Class:
- Elements in the PriorityQueue are arranged according to supplied Comparator, if not than elements will
be placed in their natural order.
- The PriorityQueue is a special type of queue because it is not a First in First out (FIFO) as in the normal
queues.
- PriorityQueue class extends AbstractQueue class which in turn implements Queue interface.
• ArrayDeque Class:
- It does not have any restrictions on capacity. It expands automatically as we add more elements.
- ArrayDeque can be used as a stack (LIFO) as well as a queue (FIFO)
- The ArrayDeque class extends AbstractCollection class and implements Deque interface. It also
implements Cloneable and Serializable marker interfaces.


12 HashSet Class:
- The HashSet class in Java is an implementation of Set interface. HashSet is a collection of objects which
contains only unique elements.
- The HashSet internally uses HashMap to store the objects.
- Duplicates are not allowed in HashSet.
- HashSet class extends AbstractSet class and implements Set interface. It also implements Cloneable and
Serializable marker interfaces.

Exercise 33:
import java.util.HashSet;
import java.util.Iterator;
public class HashSetCollection
{
public static void main(String[] args)
{
HashSet cities = new HashSet();
// Below line of code will remove element from HashSet
cities.add("New Delhi");
cities.add("Mumbai");
cities.add("Chennai");
cities.add("Kolkata");
//Below line of code will remove element from HashSet
cities.remove("New Delhi");
Iterator iterator = cities.iterator();
while(iterator.hasNext()) {
String nameOfCity=(String) iterator.next();
System.out.println(nameOfCity);
} } }

13. LinkedHashSet Class:
- LinkedHashSet internally uses LinkedHashMap to store it’s elements just like HashSet.
- LinkedHashSet maintains insertion order.
- LinkedHashSet is recommended over HashSet to maintain insertion order.
- The LinkedHashSet class extends HashSet class and implements Set interface. It also implements
Cloneable and Serializable marker interfaces.


14. TreeSet Class:
- Elements in TreeSet are sorted according to supplied Comparator, if not than elements will be placed in
ascending order.
- TreeSet is not synchronized.
- TreeSet internally uses TreeMap to store it’s elements just like HashSet and LinkedHashSet
- The TreeSet class in java is a direct implementation of NavigableSet interface which in turn extends
SortedSet interface

Exercise 34:
import java.util.TreeSet;
public class TreeSetJavaCollection
{
public static void main(String[] args)
{
TreeSet treeSet = new TreeSet();
//Adding elements to treeSet
treeSet.add("A");
treeSet.add("Z");
treeSet.add("N");
treeSet.add("K");
treeSet.add("B");
treeSet.add("D");
treeSet.add("Y");
System.out.println(treeSet);
} }


15. TreeMap class:
- TreeMap provides an efficient way to store key/value pairs in sorted ascending order.
- Java TreeMap contains only unique elements keys duplication are not possible.
- Java TreeMap cannot have a null key but can have multiple null values.
- Java TreeMap is non synchronized.
- It implements the NavigableMap interface and extends AbstractMap class.



