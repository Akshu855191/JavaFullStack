#Thread Priorities

Every thread has a priority in Java programming; that thread priority helps the JRE to prioritize the execution of
thread. A thread with high priority always gets executed first. A new thread has its priority initially set equal to the
priority of the creating thread and is a daemon thread if and only if the creating thread is a daemon. There are 10
logical ranges of thread priority; the logical value is an integer number from 1 to 10 and can be set to any thread
object using the setPriority(int) method. There are three static variables defined in the Thread class for priority.
Default priority of a Java thread is
The maximum priority that a thread can have. The logical thread value is 10. The minimum priority that a thread can
have. The logical thread value is between 1 to 4. The default priority that is assigned to a thread. The logical thread
value is between 5 to 9. To identify and get the priority of an executing thread, we may check with the help of the
getPriority() method of Thread
Thread priorities cannot guarantee that a higher priority thread will always be executed first than the lower priority
thread. The selection of the threads for execution depends upon the thread scheduler which is platform dependent.
• Every thread has a priority that determine the order in which each threads are scheduled for execution.
• In java thread priority ranges between 1 to 10
- MIN PRIORITY (a constant of 1)
- MAX PRIORITY (a constant of 10)
• By default every thread is given a
- NORM PRIORITY(a constant of 5).
Creating a thread in Java
• Java defines two ways for creating a thread.
- By implementing the Runnable interface.
- By extending the Thread class.
• When we implement the runnable interface, we must create object of Thread class and pass the object of our
  thread class as a parameter of the Thread class.
• And to start the Thread class, we will call the start method on object of the Thread class, and not on the actual
  Thread class, which we created.
• A class should implement the Runnable interface and override its run() method. The run method is the entry
  point of a thread and starts execution from there when the start() method executed on that thread.
• Let create a class that implements the runnable interface as shown in syntax.
- Syntax : public void run()
• Now as a second step, instantiate a thread object as shown in syntax.
• Thread(Runnable threadObj, String threadName);
• Where,
- threadObj is an instance of a class that implements the Runnable interface.
- threadName is the name given to the new thread.
• Once a Thread object is created, we can start it by calling start() method, which executes a call to run( )
  method. Following is a simple syntax of start() method
- void start()
• Here is an example that creates a new thread using runnable interface
• To call the run() method, start() method is used. On calling start(), a new stack is provided to the thread and
  run() method is called to introduce the new thread into the program.
• If we are implementing Runnable interface in class, then we need to explicitly create a Thread class object and
  need to pass the Runnable interface implemented class object as a argument in its constructor.


Extending the thread class :
- This is another way to create a thread by a new class that extends Thread class and create an instance of that
  class. The extending class must override run() method which is the entry point of new thread.
- This approach provides more flexibility in handling multiple threads.
- We will need to override run( ) method available in Thread class.
  Syntax : public void run( )
- Once Thread object is created, we can start it by calling start() method, which executes a call to run( ) method.
- Following is a simple syntax
  Syntax : void start( )
  Example:
• Here is an example that creates a new thread by extending the Thread class.
• In this case also, we must override the run() and then use the start() method to run the thread.
• Also, when we create ExtendingThread class object, Thread class constructor will also be invoked, as it is the
  super class, hence ExtendingThread class object acts as Thread class object
  package Hello.World;
  public class Hello_World{
  public static void main(String[] args) {
  MultiThraed thread1 = new MultiThraed("Thread1");
  thread1.start();
  MultiThraed thread2 = new MultiThraed("Thread2");
  thread2.start();
  }
  }
  class MultiThraed implements Runnable {
  Thread Cooking;
  private String IoT;
  MultiThraed(String name) {
  IoT = name;
  }
  @Override
  public void run() {
  System.out.println("Thread running" + IoT);
  for (int i = 0; i < 4; i++) {
  System.out.println(i);
  System.out.println(IoT);
  try {
  Thread.sleep(1000);
  }
  catch (InterruptedException e) {
  System.out.println("Thread is interrupted");
  }
  }
  }
  public void start() {
  System.out.println("Thread started");
  if (Cooking == null) {
  Cooking = new Thread(this, IoT);
  Cooking.start();
  }
  }
  }


#Thread Synchronization

• Synchronization is a keyword in the Java programming language that facilitates the programmer to control
  threads that are sharing data.
• This is the best approach in Java technology to provide a mechanism to treat the data carefully.
• Synchronized keywords are used to declare a method or create a method or block of statement thread safe,
  that means only one thread can access that block of code at a time and other threads will be in a waiting state
until the first thread completes the execution.
• This is done when we want to get the updated data after evaluation or while modifying the object so that
  other threads get only the updated value after the successful modification of the object.
• If we do not lock the code block, then other threads may perform the operation on the same object, which
  causes ambiguity and corrupts the actual data

  package coreJava; class
  SynchronizedEx { synchronized
  void show(String p){ try {
  System.out.println("*****");
  System.out.print(p);
  Thread.sleep(1000);
  System.out.println("#####");
  }
  catch(InterruptedException e){
e.printStackTrace();
  } } }
  class MyThread implements Runnable {
  Thread c; String
  m;
  SynchronizedEx r;
  MyThread(SynchronizedEx w, String k) {
  r=w;m=k;
  c=new Thread(this);
  }
  public void run(){
  r.show(m);
  } }
  public class test {
  public static void main(String s[])throws
  InterruptedException {
  SynchronizedEx d=new SynchronizedEx();
  MyThread t1=new MyThread(d,"Hello");
  MyThread t2=new MyThread(d,"JAVA");
  t1.c.start();
  t2.c.start();



