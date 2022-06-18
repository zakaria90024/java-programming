# অধ্যায় ১১ – জাভা এনআইও (Java New I/O)

## জাভা এনআইও কী? (What is Java NIO?)

- channel and buffer

## বাফার (Buffer)

- Buffer of primitive types
  - ByteBuffer
  - ShortBuffer
  - CharBuffer
  - IntBuffer
  - LongBuffer
  - FloatBuffer
  - DoubleBuffer
- There not buffer for boolean type
- Every Buffer class Inheritance Buffer
- Every Buffer class has this
  1. capacity
  2. position
  3. limit
  4. mark
- Factory methods
- InvalidMarkException
- 0 <= mark <= position <= limit <= capacity
- Buffer methods

```java
public abstract class ByteBuffer extends Buffer implements Comparable {
    // This is a partial API listing
  public abstract byte get();
  public abstract byte get(int index);
  public abstract ByteBuffer put(byte b);
  public abstract ByteBuffer put(int index, byte b);
}
```

## চ্যানেল (Channel)

- Channel ----> Buffer
- Channel <---- Buffer

## ফাইল রিড করা (File Read)

- End of read FileChannel read() method return 0 or -1

## ফাইল রাইট করা (File Write)

## একত্রে রিড এবং রাইট করা (Read and write together) 

- transferTo()
- transferFrom()

## ক্যারেক্টার সেট (Character set)

## অনুশীলনী (Exercises)
