import java.util.*;
public class Main{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        SmartShelf shelf=new SmartShelf();


        while(true){
            System.out.println("1. add book");

            System.out.println("2. show shelf");

            System.out.println("3. exit");

            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter book title");

                    String title=sc.nextLine();

                    shelf.addBook(title);

                    break;

                    case 2:
                        shelf.showShelf();

                        break;

                        case 3:
                            System.exit(0);
                            
            }

        }
    }
}