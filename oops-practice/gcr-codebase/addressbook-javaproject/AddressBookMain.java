import java.util.*;

public class AddressBookMain{

    //uc0

    public static void main(String[] args){

        System.out.println("welcome to address book program");

        Scanner sc=new Scanner(System.in);

        AddressBookSystem system=new AddressBookSystem();

        //uc5
        system.addAddressBook("default");
        AddressBook currentBook=system.getAddressBook("default");

        



        while(true){
            System.out.println("0. display all contacts");
            System.out.println("1. add");

            System.out.println("2. edit");
            System.out.println("3. delete");

           // System.out.println("display all contacts");
            System.out.println("4. search city");
            System.out.println("5. search state");
            System.out.println("6. count city");
            System.out.println("7. count state");
            System.out.println("8. sort name");
            System.out.println("9. sort city");
            System.out.println("10. sort state");
            System.out.println("11. sort zip");
            System.out.println("12. exit");

            int choice=sc.nextInt();

            sc.nextLine();

            switch(choice){

                case 0:
                    currentBook.displayAll();
                    break;

                case 1:
                    System.out.println("enter first name");
                    String firstName=sc.nextLine();
                    System.out.println("enter last name");
                    String lastName=sc.nextLine();
                    System.out.println("enter address");
                    String address=sc.nextLine();
                    System.out.println("enter city");
                    String city=sc.nextLine();
                    System.out.println("enter state");
                    String state=sc.nextLine();
                    System.out.println("enter zip");
                    String zip=sc.nextLine();       
                    System.out.println("enter phone");
                    String phone=sc.nextLine();
                    System.out.println("enter email");
                    String email=sc.nextLine();

                    currentBook.addPerson(new Person(firstName,lastName,address,city,state,zip,phone,email));
                    break;
                        //UC2
                    case 2:
                        System.out.println("enter name to edit");
                        String name=sc.nextLine();
                        currentBook.editPerson(name,sc);
                        break;
                            //uc3
                        case 3:
                            System.out.println("enter name to delete");
                    String nameD=sc.nextLine();
                    currentBook.deletePerson(nameD);
                    break;
                        //uc8

                        case 4:
                            System.out.println("enter city to search");
                            String cityS=sc.nextLine();
                            currentBook.searchByCity(cityS).forEach(System.out::println);
                            break;
                        case 5:
                            System.out.println("enter state to search");
                            String stateS=sc.nextLine();
                            currentBook.searchByState(stateS).forEach(System.out::println);
                            break;
                        
                            //uc9

                            case 6:
                                System.out.println("enter city to count");
                                String cityC=sc.nextLine();
                                System.out.println("count "+currentBook.countByCity(cityC));
                                break;

                                case 7:
                                System.out.println("enter state to count");
                                String stateC=sc.nextLine();
                                System.out.println("count "+currentBook.countByState(stateC));
                                break;

                                //uc10

                                case 8:
                                currentBook.sortByName();
                                break;

                                case 9://uc11
                                currentBook.sortByCity();
                                break;

                                case 10://uc11
                                currentBook.sortByState();
                                break;

                                case 11://uc11
                                currentBook.sortByZip();
                                break;

                                case 12:
                                    System.exit(0);



            }
        }





    }
}