import java.util.Arrays;
import java.util.*;

public class Employee{

    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return this.id + " " + this.name;
    }

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        Employee []arr = new Employee[5];

    
        // System.out.println("Enter name");
        // String name=sc.nextLine();

        // System.out.println("Enter id");
        // int id=sc.nextInt();

        // arr[0]= new Employee(id,name);
        // arr[1] = new Employee(2,"VK");

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);


        

        int i=0;
        
        while(true){
            

            System.out.println("Choose an option :");
            System.out.println(1 +": add");
            System.out.println("2 : remove");
            System.out.println("3 : Update");
            System.out.println("4 : exit");
            int option1 =sc.nextInt();

            switch(option1){
                case 1:
                    System.out.println("Enter name");
                    String name=sc.next();

                    System.out.println("Enter id");
                    int id=sc.nextInt();
                    
                    arr[i]=new Employee(id,name);

                    System.out.println("Employee added sucessuly with id =" + id + "and name =" + name);
                    i+=1;
                    break;
                default:
                    System.out.println("cvbnmnhgghj");
            }


            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
            }
        }
    }

}