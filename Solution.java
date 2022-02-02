import java.util.Scanner;
public class SinglyLinkedList {
    SinglyLinkedList(){
        
    }
    void insert(){
         System.out.println("insert");
    }
    void delete(){
        System.out.println("delete");
    }
    void traverse(){
         System.out.println("traverse");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList l = new SinglyLinkedList();
        while(true){
             System.out.println("press 1 for insert");
             System.out.println("press 2 for delete");
             System.out.println("press 3 for traverse");
             System.out.println("press 4 for exit");
             
             System.out.println("enter your choice");
             int choice = sc.nextInt();
             
             switch (choice){
                 case 1:
                     l.insert();
                     break;
                 case 2:
                     l.delete();
                     break;
                 case 3:
                     l.traverse();
                     break;
                 case 4:
                     System.exit(0);
                 default:
                     System.out.println("wrong choice");
             }
        }
    }
    
}
