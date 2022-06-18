# অধ্যায় ১২ – কালেকশন ফ্রেমওয়ার্ক (Collection Framework)

- java.utils

## কালেকশন (Collection)

- Collection Interface
- Collection method
  - int size();
  - boolean isEmpty()
  - boolean add(E e)
  - boolean remove(Object o)
  - boolean contains(Object o)
  - Iterator<E> iterator()
  - Object[] toArray()
  - boolean containsAll(Collection<?> c)
  - boolean addAll(Collection<? extends E> e)
  - boolean removeAll(Collection <?> c)
- Iterable (interface)
  - Collection (interface)
    - List (interface)
      - ArrayList
      - Vector
        - Stack
      - LinkedList
    - Set (interface)
      - HashSet
      - LinkedHashSet
      - TreeSet
    - Queue (interface)
      - LinkedList
      - PriorityQueue
    - Deque (interface)
      - LinkedList
      - ArrayDeque
- Map (interface)
  - Hashtable
  - HashMap
    - LinkedHashMap
  - SortedMap (interface)
    - TreeMap

## লিস্ট (List)

- boolean add(E e)
- void add(int index, E element)
- E remove(int index)
- E get(int index)
- E set(int index, E element)
- int indexOf(Object o)
- int lastIndexOf(Object o)
- Vector is Thread safe
- LinkedList is doubly linked list

## স্ট্যাক (Stack)

- Stack
- LIFO
- Iterable and Iterator

## সেট (Set)

- HashSet
- LinkedHashSet
- TreeSet

## কিউ (Queue)

- FIFO
- There are two implementation of Queue
  - LinkedList
  - PriorityQueue
- Comparable (Interface)

## ডেক (Deque)

- We can use Deque instance of Stack

## লিস্ট তৈরির সাধারণ কিছু উপায় (Here are some common ways to create a list)

## লিস্ট থেকে অ্যারেতে রূপান্তর (Convert from list to array)

## সেট তৈরির সাধারণ কিছু উপায় (Here are some common ways to create a set)

## ম্যাপ (Map)

- key-value pair. Like: name-address, name-phone
- Something called dictionary or associative array
- TreeMap
- Cryptography Algorithm: `SHA-256`

## কালেকশন অর্ডারিং/সর্টিং (Collection ordering/sorting)

- String will be sorted in Lexicographical order
- Collections.sort();

## সার্চিং (Searching)

- Collections.binarySearch()
