# অধ্যায় ০১ - জাভা প্রোগ্রামিং ভাষা

## জাভা প্রোগ্রামিং ভাষা কি?

- জাভা একটি উচ্চস্তরের প্রোগ্রামিং ভাষা।

## কেন জাভা?

- https://en.wikipedia.org/wiki/List_of_programming_languages
- https://en.wikipedia.org/wiki/List_of_JVM_languages

## জাভা কিভাবে কাজ করে?

- Java Program Execution Step
  1. Java code (\*.java)
  2. Java compiler (javac)
  3. Bytecode (\*.class)
  4. JVM (macOS) / JVM(Windows) / JVM(Linux)
- Bytecode
  - বাইট কোডের প্রতিটি ইন্সট্রাকশন এর জন্য এক বাইট মেমোরি প্রয়োজন হয় বলে একে বাইটকোড বলে।
- Java Virtual Machine (JVM)
  - JVM বাইটকোড পড়ে মেশিন এক্সিকিউটেবল কোডে রূপান্তরিত করতে পারে।
  - JVM অনেকগুলো মেশিন বা অপারেটিং সিস্টেমের জন্য লেখা হয়েছে, অর্থাৎ এটি Windows, macOS, Linux, IBM Mainframe, Solaris ইত্যাদি অপারেটিং সিস্টেমের জন্য আলাদা আলাদা করে লেখা।
  - জাভা Machine Independent প্রোগ্রামিং ভাষা।
  - "Write once, run anywhere" (WORA)
- Just-in-time (JIT) Compiler
  - Dynamic Translator
- Java Runtime Environment (JRE)
- Java Development Kit (JDK)
  - জাভাতে প্রোগ্রামিং করার জন্য শুধু JDK হলেই চলে। কারণ এতে কোড লেখার প্রয়োজনীয় সরঞ্জাম যেমন- JRE, Class Loader, Java Compiler, Archiver (jar), Documentation generator, Java debugger ইত্যাদি থাকে।
- জাভা একই সঙ্গে একটি প্রোগ্রামিং ভাষা এবং একটি প্ল্যাটফর্ম। এই প্লাটফর্মে দুটি অংশে রয়েছে Java Virtual Machine ও জাভা অ্যাপ্লিকেশন প্রোগ্রামিং ইন্টারফেস (API)।
- Execution Environment.
- জাভা প্লাটফরমের চারটি সাবসেট রয়েছে। প্রত্যেকটি প্লাটফরমের জন্য জাভা ভারচুয়াল মেশিন ও কতগুলো স্ট্যান্ডার্ড এপিআই রয়েছে।
  - Java Standard Edition (Java SE)
    - Components: Hotspot Virtual Machine, Java Database connectivity (JDBC) technology, Security Component, Java Naming & Directory Interface (JNDI), Abstract window Toolkit (AWT), Java Sound, Java Advanced Imaging, Java 2D & 3D
  - Jakarta Enterprise Edition (Jakarta EE)
    - https://jakartaee-ambassadors.io/who-we-are
    - http://www.eclipse.org/org/foundation
    - https://jakarta.ee
    - Components: Jakarta MVC, Jakarta NoSQL, Jakarta Persistence, Jakarta REST-ful Web Services, Jakarta Security, Jakarta Server Faces, Jakarta Server Pages, Jakarta Servlet, Jakarta Standard Tag Library, Jakarta Transactions, Jakarta EE Platform, Jakarta EE Web Profile, Jakarta Activation, Jakarta Annotations, Jakarta Authentication, Jakarta Authorization, Jakarta Batch, Jakarta Bean Validation ইত্যাদি
  - Java Micro Edition (Java ME)
    - Internet of Things (IoT), Embedded Devise, Mobile Devise, Microcontroller, Sensor, Gateway, PDA, STB, Printer ইত্যাদির জন্য তৈরি।
  - JavaFx
    - Rich Internet Application (RIA)
    - https://openjfx.io

## জাভা ইনস্টল করা

- যে কোন অপারেটিং সিস্টেমেই জাভা ইনস্টল করে প্রোগ্রাম লিখে রান করতে হলে নিচের তিনটি জিনিসের প্রয়োজন হয়-
  1. Test Editor
  2. Terminal
  3. JDK
- এই বইয়ের সব উদাহরণ, কোড এবং ইনস্টাকশন পদ্ধতি Java 17-কে কেন্দ্র করে।
- Windows এ জাভা ইনস্টল করা
  - `> [Environment]::SetEnvironmentVariable("Path", $env:Path;C:\Program Files\Java\jdk-17.0.1\bin", "User")`
  - Windows এ প্রথম জাভা প্রোগ্রাম
- Linux এ জাভা ইনস্টল করা‌
  - https://www.linuxuprising.com
  - Install Oracle Java Using Linux Uprising Script
    - `$ sudo add-apt-repository ppa:linuxuprising/java`
    - `$ sudo apt update`
    - `$ sudo apt install oracle-java17-installer`
    - `$ javac --version`
  - Linux এ প্রথম জাভা প্রোগ্রাম
    ```bash
    $ pwd
    $ mkdir projects
    $ cd projects/
    $ touch Hello.java
    $ ls
    Hello.java
    $ gedit Hello.java &
    ```
    - inside gedit type
    ```java
    public class Hello {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
    ```bash
    $ java Hello.java
    Hello World
    ```

## JShell-এর ব্যবহার

- Commends

  ```shell
  jshell> /help
  |  Type a Java language expression, statement, or declaration.
  |  Or type one of the following commands:
  |  /list [<name or id>|-all|-start]
  ..................................................
  ..................................................
  ..................................................

  ```

  ```shell
  jshell> /exit
  |  Goodbye
  ```

## আইডিইর ব্যবহার

- Integrated Development Environment (IDE)
- আইডিইর ব্যবহারের সুবিধা: Syntax Highlighter, Auto Completion, Code Generation, Code Debugging, Build Tools, Dependency Management, Code Refactoring, Unit Testing ইত্যাদি
- Some IDEs: Eclipse, IntelliJ IDEA, Netbeans
- Some Build Tools: Ant, Maven, Gradle ইত্যাদি।
- IntelliJ IDEA Installation:
  1. Download tar.gz for here: https://www.jetbrains.com/idea/download
  2. `$ sudo tar -xzf idea*.tar.gz -C /opt`
  3. `$ cd /opt/idea`
  4. `$ idea.sh`
- Create Projects set this things
  1. Projects name
  2. Project location
  3. Base package
