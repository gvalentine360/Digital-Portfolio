# Lab 1 Orientation
## Purpose
The purpose of this lab is to get oriented to writing programs in Java using a command line interface in Linux.  To that end, in this lab we will learn how to:
* Setup a Ubuntu Linux workspace with JDK on cloud9.
* Use some Linux commands to create some directories (folders), rename some files, delete some files, print some files.
* Use javac to compile a Java source file
*	Use java to run a Java class file
*	Review looping and if statements in Java

## Evaluation
Students will be awarded up to 10 points for successfully completing this lab as outlined below.

## Instructions

1. Log into your [Cloud9 account](https://c9.io).

2. Create a workspace or open an existing workspace.

3. Find the terminal window with the following and experiment with Linux commands:
```shell
baochuan:~/workspace $
```
You can maximize the terminal using ![the maximize icon](/images/maximize@2x.png)

* Create a directory named CS2 using ```mkdir```, the "Make Directory" command.
```shell
baochuan:~/workspace $ mkdir CS2
```


* Now "list" your files and directories using the ```ls``` command.
```shell
baochuan:~/workspace $ ls
```

*	Now, move to the CS2 directory using the "Change Directory" command, ```cd```.
```shell
baochuan:~/workspace $ cd CS2
baochuan:~/workspace/CS2 $
```
Notice your "prompt" has changed to indicate you have moved to a new directory.  We would call CS2 our current directory.

* Before you leave the CS2 directory, make a new subdirectory in the CS2 directory called "lab1.""

*	Make lab1 your current directory by moving to it with the ```cd``` command.

4. Create a new file named, of course, "HelloWorld.java" using ```nano HelloWorld.java``` commands in the lab1 directory you created earlier.
Write the traditional HelloWorld program shown below:
```java
public class HelloWorld{
  public static void main (String [] args){
    System.out.println("Hello World!");
  }//main
}//HelloWorld
```
Save your file. You should see it appear in the "workspace" window.

5. Running HelloWorld.java in Linux. Start by listing the contents of your CS2/lab1 directory with the ```ls``` command. Do you see the HelloWorld.java file you created?
To compile your program, you should use the Java compiler called "Javac." The command is shown below:
```shell
baochuan:~/workspace/CS2/lab1 $ javac HelloWorld.java
```
If everything is OK syntax-wise, you’ll be rewarded with another prompt.  If there are problems, Javac will try and tell you where they are in the code.  You’ll need to go and fix them before proceeding.
Once your program compiles, Javac will produce a class file, which can be run.  See if you can find the class file with the list command.
Now you are ready to run your program as shown below.
```shello
baochuan:~/workspace/CS2/lab1 $ java HelloWorld
Hello World!
```
6. Practice
Now that you know how to write and run a Java program in Linux, you should practice your new-found skill by modifying your HelloWorld program.  Review looping (for, while, do) and selection (if) control structures by creating a different loop to produce each of the following sequences. You should end up with 4 different loops in your main method.  Use at least one for loop, one while loop, and one do loop.
*	987654321
*	2 0 3 0 4 0 5 0 6 0 7
*	4 9 14 19 24
*	111 110 109 108 107 106 105 104
