/*
 * Threads
 * By: Nkgolo Lebelo 
 * 2018 Notes 
 */
 
 /*****************************************************************************************/
 The loader class ectends the Thread class and  overrides its run() method. When we create
 the obj object and call its start(), the run() statements executes on a different thread. 
 Every Java threads is prioritized to help the OS determine the order in which to schedule
 threads. The priorities range from 1 to 10, with each thread defaulting to priority 5. You
 can set the threads priority with the setPriority() method. 
/*****************************************************************************************/
 
 class Loader extends Threads {
	 public void run() {
		 System.out.print('Hello");
	 }
 }
 
 class MyClass { 
	 public static void main (String arg[]) {
		 Loader obj = new Loader();
		 obj.start();
	 }
 }
 
/********************************************************************************************/
 It may seeems that implementing the Runnable interface is a bit more complex then extending 
 from the Thread class. However, implemeting the Runnable interface is the preferred way to 
 start a Thread, because it enables you to extend from another class as well. 
/********************************************************************************************/
 
class Loader implements Runnable {
	public void run(){
		System.out.println("Hello");
	}
}

class MyClass {
	public static void main (String args[]) {
		Thread newThread = new Thread(new Loader());
		newThread.start();
	}
}	 
 
