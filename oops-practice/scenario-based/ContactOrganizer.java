import java.util.*;

class InvalidContactNumberException extends Exception{
    public InvalidContactNumberException(String input){
        super(input);
    }
}

class Contact{
    private String name;
    private String contactNumber;

    public Contact(String name,String contactNumber){
        this.name=name;
        this.contactNumber=contactNumber;
    }


    public String getName(){
        return name;
    }

    public String getContactNumber(){
        return contactNumber;
    }

    @Override

    public String toString(){
        return "name " +name+" contact "+contactNumber;

    }
}


class ContactManager{
    private List<Contact> contacts=new ArrayList<>();
    private void validatePhoneNumber(String contactNumber) throws InvalidContactNumberException{
        if(!contactNumber.matches("\\d{10}")){
            throw new InvalidContactNumberException("phone number must contain 10 digits");
        }
    }


    private boolean isDuplicate(String contactNumber){
        for(Contact c:contacts){
            if(c.getContactNumber().equals(contactNumber)){
                return true;
            }
        }
        return false;
    }




    public void addContact(String name, String contactNumber) throws InvalidContactNumberException{

        validatePhoneNumber(contactNumber);
        if(isDuplicate(contactNumber)){
            System.out.println("duplicate contact number!!!!!");
            return;
        }
        contacts.add(new Contact(name,contactNumber));
        System.out.println("contact number added successfully");


    }



    public void deleteContact(String contactNumber){
        boolean removed=contacts.removeIf(c->c.getContactNumber().equals(contactNumber));
        if(removed){
            System.out.println("contact deleted successfully");}
            else{
                System.out.println("contact not found");
            }
        

        }



        public void searchContact(String keyword){
            boolean found=false;

            for(Contact c:contacts){
                if(c.getName().equalsIgnoreCase(keyword)||c.getContactNumber().equalsIgnoreCase(keyword)){
                    System.out.println(c);
                    found=true;
                }
            }

                if(!found){
                    System.out.println("contact not found");
                }
            }



            public  void  displayAllContacts(){
                if(contacts.isEmpty()){
                    System.out.println("no contacts available");
                    return;

                }

                for(Contact c:contacts){
                    System.out.println(c);
                }
            }
        }




        
    


        public class ContactOrganizer{
            public static void main(String args[]){
                Scanner sc=new Scanner(System.in);

                ContactManager manager=new ContactManager();

                while(true){
                    System.out.println("1. add contact");
                    System.out.println("2. delete contact");
                    System.out.println("3. search contact");
                    System.out.println("4. display all contacts");
                    System.out.println("5. exit");

                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    sc.nextLine();


                    try{
                        switch(choice){
                            case 1:
                                System.out.println("enter name");
                                String name=sc.nextLine();
                                System.out.println("enter contact number");
                                String contactNumber=sc.nextLine();
                                manager.addContact(name,contactNumber);
                                break;
                            case 2:
                                   System.out.println("enter name to delete");
                                manager.deleteContact(sc.nextLine());
                                break;
                                
                                
                                case 3:
                                     System.out.println("enter name or number to search");
                                manager.searchContact(sc.nextLine());
                                break;

                                case 4:
                                    manager.displayAllContacts();
                                    break;

                                    case 5:
                                        System.out.println("exiting...");
                                        return;

                                    default:
                                        System.out.println("invalid choice");




                    }
                }
                catch(InvalidContactNumberException e){
                    System.out.println("error: "+e.getMessage());

                }
            }
        }



    }
    

