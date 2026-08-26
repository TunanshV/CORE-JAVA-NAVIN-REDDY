import java.util.*;


class Calculator{
    int a;   //these are primitive variables

    public int add(){
        System.out.println("in add");
        return 0;
    }
}



class Human{
    private int age;
    private String name;



    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age=a;
    }

    public String getName(){
        return name;
    }

    public void SetName(String n){
        name=n;
    }
}
// we can generate getters and setters using right click of ide and clicking the variable for which we need the getters and setters and source action






public class First{
    public static void main(String args[]){
        // int a;
        // int b;
        // System.out.println("Hello World");

        // int num=9;
        // byte by=127;
        // short sh= 558;
        // long l= 5854l;

        // float f= 5.8f;
        // double d= 5.8;

        // char ch= 'k';

        // boolean b= true;


        //literals
        // int numm= 0b101;
        // System.out.println(numm);
        // we can use _ in between numbers


        // conditionals-->>> if-else

        //  ternary operator -->   condition?if-true:if-false

        // int day=1;

        // switch(day){
        //       case 1:
        //         System.out.println("Monday");
        //         break;
        //       case 1:
        //         System.out.println("Monday");
        //         break;
        //       case 2:
        //         System.out.println("Tuesday");
        //         break;
        //       case 3:
        //         System.out.println("Wednesday");
        //         break;
        //       case 4:
        //         System.out.println("Thursday");
        //         break;
        //       case 5:
        //         System.out.println("Friday");
        //         break;
        //       case 6:
        //         System.out.println("Saturday");
        //         break;
        //       case 7:
        //         System.out.println("Sunday");
        //         break;
        //       default:
        //          System.out.println("Enter a valid number");
        // }


        // loops->while,do-while,for

        // int i=5;

        // do 
        // {
        //     System.out.println("Hi"+i);
        // }while(i<=4);

        // for loop
        // for(int j=0;j<4;j++){
        //     System.out.println("Hello");
        // }
        // for loop should have two semi colons inside it remaining others can be written outside


        //Calculator c= new Calculator();
        // c is a variable/object of type calculator
        //c.add();

        // completed till method overloading which is 3:33:00


        // arrays
        // int nums[]=new int[4];

        // all the four numbers of the array are -->0


        // multi -dimensional arrays

        // how to declare a multi dimensional array->
        // int nums[][]= new int[3][4];

        // to print all of the elements we use two for loops

        // Math.random()gives random values in java in 0,1

        // enhanced for loop

        // for(int n[]:nums){
        //     for(int m:n){
        //         System.out.println(m+" ");
        //     }
        //     System.out.println();
        // }


        // jagged arrays->here we specify the rows but columns are not specified


        // int nums[][]= new int[3][];

        // an array size can not be expanded or shrinked


        // collections covers the drawbacks of arrays


        //to find the length of an array, we use the .length function
        //for(int i=0;i<nums.length;i++)



        // Student s1= new Student();
        // s1.rollno= 1;
        // s1.name="Navin";
        // s1.marks= 88;

        // Student s2= new Student();
        // s2.rollno=2;
        // s2.name= "Harsh";
        // s2.marks= 67;

        // Student s3 = new Student();
        // s3.rollno=3;
        // s3.name="Kiran";
        // s3.marks=98;

        // Student students[]= new Student();


        // students[0]=s1;
        // students[1]=s2;
        // students[2]=s3;

        // enhanced for loop

        // for(int n:nums){
        //     System.out.println(n);
        // }


        // for(Student stud: students){
        //     System.out.println(stud.name+" : "+stud.marks);
        // }



        //Strings-->started at 4:35:00

        //String in java is not a primitive data type and a proper class

        // String name= new String("Tuna");
        // System.out.println(name);
        // System.out.println(name.hashCode());


        // wE USE + TO concatenate strings

        // charAt(index:1) shows character at index 1

        //System.out.println(name.charAt(index:1));
        //System.out.println(name.concat(str:"hello"));

        // by default Strings in Java are immutable
        // if we concatenate or do something,it is stored in new memory

 
        // string buffer vs string builder


        // string buffer is thread safe while string buklder is not 
        StringBuffer sb= new StringBuffer("Navin");
        System.out.println(sb);
        sb.append("reddy");

        // sb.deleteCharAt(1);
        sb.insert(0,"Java ");

        System.out.println(sb);



        // if any variable in a class is tagged as static,thn it is universal for all the objects and it is not to be supposed for a single object
        // static methods can be called directly without a class name and non-static ones need an object
        // static methods can be used in non-static methods but non-static methods can't be used in static methods 

        // the static block will be called once as it contains the things need to be updated only once 



        // static 
        // {
        //     name="Phone";
        //     System.out.println("in static problem");
        // }



        // static block is called first and then the constructor is called 

        // anonymous object ->used whjen less code and all is required->Use geeks fopr geeks for detailed explanation
        // https://www.geeksforgeeks.org/java/anonymous-object-in-java/
    }
}