# অধ্যায় ৭ – অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং (Object Oriented Programming)

- অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং হলো এক ধরনের প্রোগ্রামিং রীতি যেখানে প্রোগ্রামিং এর সাধারণ বিল্ডিং ব্লক হচ্ছে অবজেক্ট।
- একটি অবজেক্টের দুইটি জিনিস থাকে:
  1. অবস্থা (state)
  2. আচরণ (behavior)

## অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিংয়ের প্রয়োজনীয়তা এবং উৎপত্তি (The Requirements and Origins of Object Oriented Programming)

## অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিংয়ের সুবিধা (Advantages of Object Oriented Programming)

- অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং এর কিছু সুবিধার নিচে লিপিবদ্ধ করা হলো-
  1. এই পদ্ধতিতে প্রোগ্রাম খুব মডিউলার (modular) হয়। এর কারণ, বিভিন্ন অবজেক্টের দায়িত্ব গুলো আলাদা আলাদা। তাই এদেরকে তৈরি করা যায় আলাদা আলাদাভাবে। এতে সফটওয়্যার তৈরির প্রক্রিয়া অনেক সহজ হয়।
  2. এই পদ্ধতিতে পুনরায় ব্যবহারযোগ্য (reusable) প্রোগ্রামিং উপাদান (component/module) তৈরি করা যায়। যার ফলে নতুন প্রোগ্রাম লিখতে গিয়ে সবসময় একদম নতুন করে সব কিছু লিখতে হয় না। অনেক কিছু যা ইতিমধ্যে তৈরি করা হয়েছে সেগুলো ব্যবহার করা যায়। যার ফলে আমরা দ্রুত প্রোগ্রাম লিখতে পারি। এছাড়া এর ফলে প্রোগ্রাম লেখার খরচ কমে যায়।
  3. যেহেতু এগুলো মডিউলার, এবং তাই এদেরকে রক্ষণাবেক্ষণ (maintain) করার সহজ।
  4. এতে নতুন কিছু যুক্ত করা খুব সহজ হয়ে যায়।
  5. অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং এর চিন্তার প্রক্রিয়াটি বাস্তব জগতের সাথে সাদৃশ্যপূর্ণ। যেহেতু আমরা বাস্তব জগৎ সম্পর্কে জানি, তাই আমরা সহজে প্রোগ্রামিং এর জটিল বিষয়গুলো উপলব্ধি করতে পারি এবং প্রোগ্রাম লিখতে পারি।
- অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং (Object Oriented Programming) বা ওওপি (OOP) তিনটি ধারনার ওপর প্রতিষ্টিত।
  1. এনক্যাপসুলেশন (Encapsulation): এটি মূলত অবজেক্টের প্রপার্টি বার্থডেটা গুলোকে লুকিয়ে রাখে.
  2. ইনহেরিটেন্স (Inheritance)
  3. পলিমরফিজম (Polymorphism)

## অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিংয়ের প্রয়োগ (Application of Object Oriented Programming)

- Immutable class
- Design an E-commerce: A customer would create an order by putting various products into a shopping cart and then checks out by making a payment using a credit card.
- Encapsulation

## এনক্যাপসুলেশন (Encapsulation)

- Three keywords used in Java for encapsulated or access control are `public` `private` `protected`. These are called access modifiers.
- Rule of thumb: সাধারণভাবে ক্লাসের ফিল্ডগুলোকে প্রাইভেট রাখা উচিত।
- Private Access Modifier: `private`
- Public Access Modifier: `public`
- Protected Access Modifier: `protected`
- Access Level Table
  | Access Modifier | within class | within package | outside package by subclass only | outside package |
  | :-------------- | :----------- | :------------- | :------------------------------- | :-------------- |
  | **Private** | Y | N | N | N |
  | **Default** | Y | Y | N | N |
  | **Protected** | Y | Y | Y | N |
  | **Public** | Y | Y | Y | Y |
- Abstraction
  - Rule of thumb: আমরা যখন কোন একটি ক্লাস ডিজাইন করব, শুরুতে সেই ক্লাসের প্রোপার্টিগুলো প্রাইভেট রাখব। মেথডগুলোও শুরুতে প্রাইভেট রাখতে পারি। পরে শুধু যে মেথডগুলো বাইরে থেকে ব্যবহার করার প্রয়োজন হবে শুধু সেইগুলোকে পাবলিক বা প্রটেক্টেড করব।

## ইনহেরিটেন্স (Inheritance)

- `extends` keyword
- subclass/ child class/ derived class/ extended class
- superclass/ parent class/ base class
- `super()` keyword
- default constructor
- যে কনস্ট্রাক্টর কোন আর্গুমেন্ট নেয় না, তাকে no-argument constructor বা ডিফল্ট কনস্ট্রাক্টর বলে।
- Final class
  - some final class in Java: `String`, `Character`, `Scanner`
- Method overriding
  - Hacker's Delight by Henry S. Warren, Jr.
  - Covariant return type
- Override Annotation: `@Override`
- `super` keyword
- you can't inherit multiple class

## পলিমরফিজম (Polymorphism)

- Variable Type and Object Type
  - There is two type in java: primitive type and reference type
  - Declared type and Actual type
  - Fully qualified name
  - Some notes
    - একটি সাপক্লাসের অবজেক্টকে এর সুপারক্লাসের রেফারেন্স অ্যাসাইন করা যায়।
    - সাবক্লাসের অবজেক্টকে সুপারক্লাসের রেফারেন্স অ্যাসাইন করলেও, মেথড কল করার সময় শুধু সুপার-ক্লাসের মেথডগুলোকেই কল করা যায়।
    - সাপক্লাস যদি সুপারক্লাসের মেথড ওভাররাইট করে, তাহলে যদিও সুপারক্লাসের রেফারেন্স ধরে মেথড কল করা হয়, কিন্তু রানটাইমে সাবক্লাসের মেথডটিই কল হবে। মনে রাখতে হবে যে, এটি শুধু মেথড ওভাররাইড করা হলেই সত্য হবে।
- Upcasting and Downcasting
  - implicit casting or upcasting
  - explicit casting or Downcasting
  - Pattern Matching in Java 16
- Abstract Class
  - It's one kind of abstraction
- Abstract Method
  - Extensibility - The ability to be extended or stretched
  - Abstract Class & Abstract Method এর কতগুলো নিয়ম-
    1. অ্যাবস্ট্রাক্ট ক্লাসকে ইনস্ট্যানশিয়েট করা যায় না। new অপারেটর ব্যবহার করে কোন অ্যাবস্ট্রাক্টক্লাসের অবজেক্ট তৈরি করার উপায় নেই।
    2. অ্যাবস্ট্রাক্ট ক্লাসে কনস্ট্রাক্টর থাকতে পারে। তবে যেহেতু কোন ক্লাসের অবজেক্ট তৈরি করার সময় এর কনস্ট্রাক্টর কল হয়, এর কনস্ট্রাক্টরকে সাবক্লাসের কনস্ট্রাক্টর থেকে super() দিয়ে কল করতে হয়।
    3. অ্যাবস্ট্রাক্ট ক্লাস বা অ্যাবস্ট্রাক্ট মেথড কখনো final হিসেবে ডিক্লেয়ার করা যায় না। কারণ ফাইনাল করা অর্থ হলো এদের সাবক্লাস থাকবে না বা ওভাররাইট করা যাবে না, অ্যাবস্ট্রাক্ট ক্লাস বা অ্যাবস্ট্রাক্ট মেথডের ক্ষেত্রে যা অর্থহীন। একইভাবে অ্যাবস্ট্রাক্ট ক্লাসের কনস্ট্রাক্টর private হতে পারে না। কারণ এতে করে সাবক্লাস থেকে super() কল করার উপায় থাকবে না।
    4. একটি অ্যাবস্ট্রাক্ট ক্লাসে অ্যাবস্ট্রাক্ট মেথড থাকতেও পারে, আবার নাও থাকতে পারে।
    5. একটি ক্লাসে একটি অ্যাবস্ট্রাক্ট মেথড থাকলেই সেই ক্লাসকে অ্যাবস্ট্রাক্ট ক্লাসে রূপান্তরিত করতে হবে। অর্থাৎ অ্যাবস্ট্রাক্ট মেথড শুধু অ্যাবস্ট্রাক্ট ক্লাসেই থাকতে পারে।
    6. সাপক্লাসকে অবশ্যই অ্যাবস্ট্রাক্ট ক্লাসের সবগুলো মেথড ইমপ্লিমেন্ট করতে হবে, নতুবা একে অ্যাবস্ট্রাক্ট ক্লাসে রূপান্তরিত করতে হবে।
    7. কোন রেগুলার ক্লাসের সাবক্লাস অ্যাবস্ট্রাক্ট ক্লাস হতে পারে।
- Interface
  - Pure Abstract Class
  - Interface এর কিছু নিয়মকানুন:
    1. ইন্টারফেসের মেথডগুলো সব সময় public এবং abstract। সুতরাং আলাদা করে এই কিবোর্ড লেখার প্রয়োজন নেই।
    2. ইন্টারফেসের ভেরিয়েবল রাখা যায় তবে এগুলো অবশ্যই কনস্ট্যান্ট অর্থাৎ এগুলো public এবং static। public static এই কিবোর্ড দুটি ব্যবহার না করলেও কম্পাইলার এগুলো বসিয়ে নেবে কম্পাইল করার সময়।
    3. ইন্টারফেসের মানুষগুলো কখনো ফাইনাল হতে পারবে না।
    4. একটি ইন্টারফেস আর একটি ইন্টারফেসকে এক্সটেন্ড করতে পারবে।
    5. জাভাতে একটি ক্লাস একই সঙ্গে একাধিক ইন্টারফেস ইমপ্লিমেন্ট করতে পারে। এক্ষেত্রে এগুলোকে কমা দিয়ে একটির পর একটি লিখতে হয়।
    6. একটি ইন্টারফেসের কোনো মেথড না-ও থাকতে পারে।
    7. একটি ইন্টারফেসে প্রাইভেট স্ট্যাটিক ও ডিফল্ট মেথড থাকতে পারে।
- Interface vs Abstract Class
- Why java don't support Multiple Inheritance
  1. operator overloading is invalid
  2. multiple Inheritance is invalid
  3. diamond problem

## অনুশীলনী (Exercise)
