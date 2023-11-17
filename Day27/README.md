File

• The File class is the class that provides access to the file system to JVM.
• Syntax to declare an object of the File class is as follows:
  File newFile = new File(including name of the file);
• A pathname could be either relative or absolute path.
• A relative path must be interpreted in terms of information taken from some other pathname or current path
of the application, which is typically the path where JVM is running the application and program.
• An absolute pathname is complete, including drive and directory in which no other information is required to
locate the file.
• By default, the classes in the java.io package always resolve relative pathnames against the current user
directory

Example:
import java.io.File;
import java.io.IOException;
public class FileExample {
public static void main(String[] args) throws IOException {
File newFile = new File("ListOfCourses.txt");
if (newFile.createNewFile()) {
System.out.println("File created.");
} else {
System.out.println("File exists.");
} } }
Output:
File created.
• These program will create the file, ListOfCourses.txt under the current project directory, because we have
given only the filename as a parameter of the File class, which will be treated as a relative path by JVM.
• The next line of code is checking the file presence of file with the same name in the system using the method
createNewFile() that returns true or false.
• Based on the return of we are printing a text message on console; so, in our case, the method returns true and
create a file

• These program will create the file, ListOfCourses.txt under the current project directory, because we have
given only the filename as a parameter of the File class, which will be treated as a relative path by JVM.
• The next line of code is checking the file presence of file with the same name in the system using the method
createNewFile() that returns true or false.
• Based on the return of we are printing a text message on console; so, in our case, the method returns true and
create a file
• Hence the cursor goes in to the if section and prints the message “File created”


 #Stream
• Stream is the sequence of data flowing from source to destination. Here, source is called input and destination
is called output. Input and Output streams support many data types such as character,
string, and object. There are two types of streams - input and output and both implement byte and character
type of streams to read and write the data
• Byte Byte Streams are used to perform input and output of 8-bit bytes. Classes such as FileInputStream and
FileOutputStream support byte streams.
• Character Character Streams are used to perform input and output of 16-bit Unicode characters. Classes such
as FileReader and FileWriter support character streams


#Input Stream & File Reader
• Input is the process to read the data from any source such as file, device, socket, and console.
• When a third-party application of human interact with system, the system will expect some input to process
further steps.
• Input Stream helps us to read the bytes coming from external sources.
• InputStream is an abstract class and super class of all the input classes
• FileReader is the class that helps to read the characters or text from file using the default buffer size.
• This only reads the stream of characters from file and makes a connection with the file.


#FileInputStream
• FileInputStream is a class that helps us to obtain input byte from file and build a connection between file
stored in the storage system and application.
• The syntax of FileInputStream constructor for opening connection to a file, the parameter object or name is
the file stored in the file system:
FileInputStream(File fileObject) or
FileInputStream(String fileName)
• Output stream writes data as an output into an array or file or any output device.
• This is an abstract class, and its sub-classes get implemented to generate the output.
• Class that is part of output streams are FileOutputStream
• Let’s discuss output streams in detail

#FileOutputStream
• FileOutputStream is used to create a file in the filesystem and write data into that file.
• If you try to write data into an existing file using FileOutputStream and that named file doesn’t exist in the file
system, then FileOutputStream will create a file with given name and add the data into it.
• Let’s see the syntax for creating
OutputStream f = new FileOutputStream(“path of the file. Or object of the File class”)
• To create a file using FileOutputStream, we need to pass an argument that will call the constructor and create
the file. The argument can be an absolute or relative path of the file, or an object of File class
Example:
import java.io.FileOutputStream;import java.io.IOException;
import java.io.OutputStream;
public class OutputStreamExample {
public static void main(String args[]) {
try {
OutputStream oStream = new FileOutputStream("Output.txt");
oStream.write(70);
oStream.write(65);
oStream.write(78);
oStream.close();
System.out.println("Successfully created and written the file.");
} catch (IOException e) {
System.out.print("Exception");
} } }
Output :- Successfully created and written the file.
• The preceding program will successfully create a file Output.txt in the current directory and write the Unicode
characters for numbers 70, 65, and 78 (FAN).
• The above figure shows the content of the Output.txt file





 
