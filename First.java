// import java.util.*;


// class Calculator{
//     int a;   //these are primitive variables

//     public int add(){
//         System.out.println("in add");
//         return 0;
//     }
// }



// class Human{
//     private int age;
//     private String name;



//     public int getAge(){
//         return age;
//     }
//     public void setAge(int a){
//         this.age=a;
//     }

//     public String getName(){
//         return name;
//     }

//     public void SetName(String n){
//         name=n;
//     }
// }
// // we can generate getters and setters using right click of ide and clicking the variable for which we need the getters and setters and source action






// public class First{
//     public static void main(String args[]){
//         // int a;
//         // int b;
//         // System.out.println("Hello World");

//         // int num=9;
//         // byte by=127;
//         // short sh= 558;
//         // long l= 5854l;

//         // float f= 5.8f;
//         // double d= 5.8;

//         // char ch= 'k';

//         // boolean b= true;


//         //literals
//         // int numm= 0b101;
//         // System.out.println(numm);
//         // we can use _ in between numbers


//         // conditionals-->>> if-else

//         //  ternary operator -->   condition?if-true:if-false

//         // int day=1;

//         // switch(day){
//         //       case 1:
//         //         System.out.println("Monday");
//         //         break;
//         //       case 1:
//         //         System.out.println("Monday");
//         //         break;
//         //       case 2:
//         //         System.out.println("Tuesday");
//         //         break;
//         //       case 3:
//         //         System.out.println("Wednesday");
//         //         break;
//         //       case 4:
//         //         System.out.println("Thursday");
//         //         break;
//         //       case 5:
//         //         System.out.println("Friday");
//         //         break;
//         //       case 6:
//         //         System.out.println("Saturday");
//         //         break;
//         //       case 7:
//         //         System.out.println("Sunday");
//         //         break;
//         //       default:
//         //          System.out.println("Enter a valid number");
//         // }


//         // loops->while,do-while,for

//         // int i=5;

//         // do 
//         // {
//         //     System.out.println("Hi"+i);
//         // }while(i<=4);

//         // for loop
//         // for(int j=0;j<4;j++){
//         //     System.out.println("Hello");
//         // }
//         // for loop should have two semi colons inside it remaining others can be written outside


//         //Calculator c= new Calculator();
//         // c is a variable/object of type calculator
//         //c.add();

//         // completed till method overloading which is 3:33:00


//         // arrays
//         // int nums[]=new int[4];

//         // all the four numbers of the array are -->0


//         // multi -dimensional arrays

//         // how to declare a multi dimensional array->
//         // int nums[][]= new int[3][4];

//         // to print all of the elements we use two for loops

//         // Math.random()gives random values in java in 0,1

//         // enhanced for loop

//         // for(int n[]:nums){
//         //     for(int m:n){
//         //         System.out.println(m+" ");
//         //     }
//         //     System.out.println();
//         // }


//         // jagged arrays->here we specify the rows but columns are not specified


//         // int nums[][]= new int[3][];

//         // an array size can not be expanded or shrinked


//         // collections covers the drawbacks of arrays


//         //to find the length of an array, we use the .length function
//         //for(int i=0;i<nums.length;i++)



//         // Student s1= new Student();
//         // s1.rollno= 1;
//         // s1.name="Navin";
//         // s1.marks= 88;

//         // Student s2= new Student();
//         // s2.rollno=2;
//         // s2.name= "Harsh";
//         // s2.marks= 67;

//         // Student s3 = new Student();
//         // s3.rollno=3;
//         // s3.name="Kiran";
//         // s3.marks=98;

//         // Student students[]= new Student();


//         // students[0]=s1;
//         // students[1]=s2;
//         // students[2]=s3;

//         // enhanced for loop

//         // for(int n:nums){
//         //     System.out.println(n);
//         // }


//         // for(Student stud: students){
//         //     System.out.println(stud.name+" : "+stud.marks);
//         // }



//         //Strings-->started at 4:35:00

//         //String in java is not a primitive data type and a proper class

//         // String name= new String("Tuna");
//         // System.out.println(name);
//         // System.out.println(name.hashCode());


//         // wE USE + TO concatenate strings

//         // charAt(index:1) shows character at index 1

//         //System.out.println(name.charAt(index:1));
//         //System.out.println(name.concat(str:"hello"));

//         // by default Strings in Java are immutable
//         // if we concatenate or do something,it is stored in new memory

 
//         // string buffer vs string builder


//         // string buffer is thread safe while string buklder is not 
//         // StringBuffer sb= new StringBuffer("Navin");
//         // System.out.println(sb);
//         // sb.append("reddy");

//         // sb.deleteCharAt(1);
//         // sb.insert(0,"Java ");

//         // System.out.println(sb);



//         // if any variable in a class is tagged as static,thn it is universal for all the objects and it is not to be supposed for a single object
//         // static methods can be called directly without a class name and non-static ones need an object
//         // static methods can be used in non-static methods but non-static methods can't be used in static methods 

//         // the static block will be called once as it contains the things need to be updated only once 



//         // static 
//         // {
//         //     name="Phone";
//         //     System.out.println("in static problem");
//         // }



//         // static block is called first and then the constructor is called 

//         // anonymous object ->used whjen less code and all is required->Use geeks fopr geeks for detailed explanation
//         // https://www.geeksforgeeks.org/java/anonymous-object-in-java/






//         // -----------iNHERITANCE ----------



//         // Dog.java can be a separate file and can be used and extended 
//         // class Dog extends Animal{

//         // }
//     }
// }




// Java only supports single and multi-level inheritance,it does not support multiple inheritance directly 


//single
// class A{

// }
// class B extends A{

// }



// //multi-level
// class A{

// }
// class B extends A{

// }
// class C extends B{

// }





// every constructor has a method named  super where it is automatically called
// class A{
//     public A(){
//         super();
//         System.out.println("in A");
//     }
//     public A(int n){
//         super();
//         System.out.println("in A int");
//     }
// }
// class B extends A{
//     public B(){
//         super();
//         System.out.println("in A");

//     }
//     public B(int n){
//         super(n);
//         System.out.println("in b int");
//     }
// }



// either super() is called or super(int n) is called

// this() will execute the constructor of the same class 




// packages are somewhat like folders and contain multiple java files

// package tools;


// if any file is outside any package and we have to use some class within the package,we write the code as below

//  import package_name.class_name    that is package_name followed by the class name followed with a dot 


// import other.tools and other.*   packages are different bexause .* one imports all the files and not the within in files 



// there are four types of access modifiers ----> public,private,protected and  default 



// public types can be acccessed from anywhere,same file or other

// private variables can be accessed from the same class only

// default variables can be accessed from the same package only...


// protected members can be accessed by subclasses in different packages, whereas default members cannot


// polymorphism is of two types --> runtime polymorphism and compile time polymorphism

// compile time polymorphism is method overloading while runtime polymorphism is method overriding 


// dynamic method dispatch 

// the above concept means creating an object of the parent class and instance of the child class

// class A{
    // public void show(){
    //     System.out.println("In A show");
    // }

// }
// class B extends class A{
    // public void show(){
    //     System.out.println("In B show");
    // }

// }

// public class Demo{
//     public static void main(String args[]){
//         A obj= new A();
//         obj.show();

            // obj= new B();
            // obj.show();
//     }
// }




// the first reference method calls the object of A class while the second class reference calls for B

// final keyword when used with variable makes it constraint to further updating it

// if a class is made final, we cannot further inherit it

// if we maake a method final,we cannot further override it


//we can override the object class methods by defining it by ourselves accordingly

// upcasting means refer to the parent class when creating an instance of lower class
//  downcasting means refer to the lower class to access sub class properties


// A obj= new B();
// obj.show1();

// B obj1= (B) obj;
// obj1.show2();

//Autoboxing in Java is the automatic conversion that the Java compiler makes between a primitive data type and its corresponding object wrapper class. For instance, the compiler automatically converts an int to an Integer, or a double to a Double




// class A{

// }
// class B extends A{

// }
// class Demo{
//     public static void main(String[] args) {
//         A obj= (A) new B();
//         obj1.show();
//     }
// }


// Wrapper class in Java is 
//A wrapper class in Java is a class that encapsulates (wraps) a primitive data type into a corresponding reference object. This enables primitive values to participate in object-oriented operations, such as being stored inside collections or utilized within generic APIS



// abstract method can only belong to abstract class

// also IF we just want to declare the method but want to further use it, so then we use the abstract keyword.We can define it later or in further classes.


// also you cannot create an object of abstract class,abstract means giving a rough idea or plan but not the exact implementation

// abstract class can have abstract or non-abstract methods

// if some abstract method is declared,then all must be written or expanded later 



//inner class---> a class within a class

// class A{
//     int age;
//     int poi;

//     class B{
//         .....
//     }
// }


// ?by compiling it ,we get A$B class 


// A.B obj1 =  obj.new B();

// static can be used in inner class only not outer class


// anonymous inner class

// A obj= new A()
// {
//     public void show(){
//         System.out.println("in new show")
//     }
// };


// interfaces in easy words(w3 schools)--->

//Interfaces

// Another way to achieve abstraction in Java, is with interfaces.

//An interface is a completely "abstract class" that is used to group related methods with empty bodies:


//// interface
// interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void run(); // interface method (does not have a body)
// }

// abstract class A --> interface A    interface is not a class

// by default its methods are public abstract

// variables in interface are final and static, it means we have to instantiate it with a value

// interface A{
//     int age=40;
//     int val=20;

//     public void show();
//     public void config();
// }


// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
//     public void config(){
//         System.out.println("in config");
//     }
// }


// if I am writing a class which implements the interfaces,then it must complete all the half written methods

// a class can implement multiple interfaces 
// class A implements B,C,D

// interfaces can be extended
// interface Y extends X

// enums-->enumerated constants


// enum Status{
//     Running,Failed,Pending,Success;
// }

// Status s= Status.Running;
// enum works like a class only where the types are like objects



// enum Status{
// 	Running, Failed, Pending, Success;
// }

// public class Demo {
//     public static void main(String[] args) {

//     	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());


    	
    // 	Status[] ss=Status.values();
    // 	System.out.println(ss);
    	
    // 	for(Status s:ss)
    // 	{
    // 		System.out.println(s);
    // 		System.out.println(s+" : "+s.ordinal());
    // 	}
    // }



// enum Status{
// 	Running, Failed, Pending, Success;
// }

// public class Demo {
//     public static void main(String[] args) {

//     	Status s=Status.Pending;
    	
//     	switch(s)
//     	{
//     		case Running:
//     			System.out.println("All Good");
//     			break;
    			
//     		case Failed:
//     			System.out.println("Try Again");
//     			break;
    			
//     		case Pending:
//     			System.out.println("Please Wait");
//     			break;
    		
//     		default:
//     			System.out.println("Done");
//     			break;
//     	}
    	
//     	if(s==Status.Running)
//     		System.out.println("All Good");
//     	else if(s==Status.Failed)
//     		System.out.println("Try Again");
//     	else if ( s==Status.Pending)
//     		System.out.println("Please Wait");
//     	else
//     		System.out.println("Done");
//     }
// }





// @Override---> no use 

// @Deprecated--> used above class,it means use it but don't use it 


// types of interfaces

// normal-->interface with multiple methods

// functional --->sam/ interface with single methods

// marker---> marker/ interface with no methods


// ?functional interface has an annotation --> @FunctionalInterface


// we can use lambda expression with functional interface 


@FunctionalInterface
interface A{
    void show();
}

public class First{
    public static void main(String args[]){
        A obj=()->  System.out.println("In show");

        obj.show();
    }
}



// Exceptions

// compile time error
// runtime error  --> suddenly execution stops bcs of sme missing file 
// logical error


//runtime errors are called exceptions

// int i=0;
// int j=0;

// try{
//     j=18/i;
// }
// catch(Exception e)
// {
//     System.out.println("Something went wrong!!");
// }


// first java tries to run code in try block,then it executes catch part 

// we can write multiple catch blocks

// ArithmeticException
// ArrayIndexOutOfBoundsException
// Exception class handles all of the exception like handles all of them 


// we can print the exception as well


//NullPointerException means exception that makes use of a program that points to null


// exception hierarchy

// throw vs throws


// we can build our own exception


// class NavinException extends Exception{
//     public NavinException(String str){
//         System.out.println(str);
//     }
// }

// public static void main(String args[]){
//       int i=20;
//       int j=0;

//       try{
//         j=18/i;
//         if(j==0)
//             throw new NavinException(string:"I don't want to ")
//       }
//       catch{

//       }
// }


// throws basically means ducking the exception
// d() throws Exception
// e() throws Exception


// if we don't want to write a catch,we use finally

// there are certain steps or processes which we have to surely run instead of the exception,that part is written in the finally 


// newer versions have try with resources instead of try and finally keyword 


// if we want to use thread in a class, we use class A extends Thread or class B extends Thread or Runnable

// in every thread we need to have the run method

// threads are started using the .start() method


// threads priority

// range of priority is 1-10  (by default it is 5) 10 is maximum
// different schedulers have different priority

// obj2.setPriority(Thread.MAX_PRIORITY)


// Thread.sleep(millis:10)  waits for 10 milliseconds

// thread.sleep needs try catch block as it is a checked exception

// thread is a class which implements runnable 


// we can even use lambda version in runnable objects as implementation



// threads vs mutation


// thread safe --> only one thread can work at a time 

// .join() is used to join the two threads   it may throw exception


// synchronized keyword makes sure the method is callled only once