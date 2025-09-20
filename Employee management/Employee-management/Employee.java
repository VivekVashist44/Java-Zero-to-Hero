import java.util.Arrays;
import java.util.*;
// slight change here
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
        Employee []arr = new Employee[500];

        int i=0;
        boolean flag=true;
        
        while(flag){
            
            System.out.println(1 +" : add");
            System.out.println(2 +" : remove");
            System.out.println(3 +" : Update");
            System.out.println(4 +" : View");
            System.out.println(5 +" : exit");
            System.out.print("Choose an option : ");
            int option1 =sc.nextInt();

            switch(option1){
                case 1:
                    System.out.print("Enter name : ");
                    String name=sc.next();

                    System.out.print("Enter id : ");
                    int id=sc.nextInt();
                    
                    arr[i]=new Employee(id,name);

                    System.out.println("Employee added sucessuly with id = " + id + " and name = " + name);
                    i+=1;
                    break;
                
                case 2:
                    int k=1;
                    for(Employee val : arr){
                        if(val==null){
                            break;
                        }
                        System.out.println(k+ " : " +val);
                        k+=1;
                    }
                    System.out.print("Select the employee you want to remove : ");

                    int res =sc.nextInt();
                    i-=1;
                    System.out.println("you removed "+ arr[res-1]);

                    for(int l=res-1;l<arr.length;l++){
                        if(arr[l]==null) break;
                        if(l==arr.length-1){
                            arr[l]=null;
                            break;
                        }
                        arr[l]=arr[l+1];
                    }
                    break;

                case 3:
                    int t=1;
                    for(Employee val : arr){
                        if(val==null){
                            break;
                        }
                        System.out.println(t+ " : " +val);
                        t+=1;
                    }
                    System.out.print(" Select the employee you want to update : ");
                    
                    res =sc.nextInt();

                    System.out.print("Enter the updated name : ");
                    String st=sc.next();

                    arr[res-1]=new Employee(arr[res-1].id,st);
                    System.out.println("Employee details are updated.");
                    break;

                case 4:
                    for(int j=0;j<arr.length;j++){
                        if(arr[j]==null){
                            break;
                        }
                        System.out.println(arr[j]);
                    }
                    break;
                
                case 5:
                    System.out.println("Shutting down bye bye.....");
                    flag=false;
                    break;

                default:
                    System.out.println("This is default case ");
            }
        }
    }

}