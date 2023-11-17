#Threads in Java :-

- Thread is the smallest execution unit of process and a process may have many threads that are executing at the same time.
- Thread has its own execution path within the process and shares the memory of the process with other threads, which are running 
  in the same process.
- Thread doesn't allocate any memory,but it uses the memory alllocated by its process; this help faster and efficient communication
  between thred within the same process.

#Process and Thread

• In parallel programming, there are two ways to achieve the concurrent execution of a same program or
  multiple tasks at the same time from an application or program:
- Processor
- Thread
• There is a huge difference between the processor and thread.
• A process always allocates separate memory in the system for the execution and has a self-contained
  execution environment and executes with the same allocated memory.
• The Java virtual machine runs as a single process and executes java program within the same process, but if
  needed, we can create additional processes using start() of the ProcessBuilder object.
• For example:
  Process p = new ProcessBuilder(“customProcess”,“args”).start();

#Thread :- 
• A thread never allocates its own memory; it always uses the memory allocated by the processor and executes
  within a process.
• Threads are very lightweight and consume fewer resources for execution.
• A simple Java program always starts with a main thread, and a thread can also create further threads to lessen
  the execution of the program
• A thread can communicate with other threads running in the same process using the thread methods such as
  wait(), notify(), and yield().


#Multitasking

• Multitasking is the term use to refer when a machine or person is doing or running multiple works or tasks at
  the same time.
• For example,
  when we work on a computer, at the same time, there are multiple programs and applications running such as
  playing music, writing on a word document, browsing Internet, and many others. So, we can say that our
  computer is multitasking.
  There is no multitasking where multiple tasks are being executed on the CPU. But it is all about utilizing the
  CPU’s ideal time and allowing other processes or threads to execute, when one program is waiting for input or
  other resources.


Introduction to Multithreading

• Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for
  maximum utilization of CPU.
• Each thread defines a separate path of execution.
• This means that a single program can perform two or more tasks simultaneously.
• For example
- One thread is performing typing action on a file at the same time another thread is checking and resolving
  grammatical mistakes at the same time.


#Thread Lifecycle

• A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then
  dies. The following diagram shows the complete life cycle of a thread.
• New : A thread begins its life cycle in the new state. It remains in this state until the program starts the start()
  method.
• Runnable : After a newly born thread is started by invocating start() method on new thread, the thread
  becomes runnable.
• Running : A thread is in running state if the thread scheduler has selected it.
• Waiting : A thread is in waiting state if it waits for another thread to perform a task. In this stage the thread is
  still alive.
• Terminated : A thread enter the terminated state when it complete its task.

