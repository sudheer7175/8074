import java.io.*;
import java.util.*;
class thread1 extends Thread
{
void display1()
{
System.out.println("Good morning");
}
}
class thread2 extends Thread
{
void display2()
{
System.out.println("Hello");
}
}
class thread3 extends Thread
{
void display3()
{
System.out.println("Welcome");
}
}
class threadj6
{
public static void main(String args[])throws interrupted Exception
{
thread t1=new thread1();
Thread.sleep(1000);
t1.display1();
thread2 t2=new thread2();
Thread.sleep(2000);
t2.display2();
thread3 t3=new thread3();
Thread.sleep(3000);
t3.display3();
}
}
