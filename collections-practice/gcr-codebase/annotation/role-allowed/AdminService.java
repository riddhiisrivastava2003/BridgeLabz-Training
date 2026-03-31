public class AdminService{

    @RoleAllowed("ADMIN")
    public void deleteUser(){
        System.out.println("user deleted successfully");
    }

    public void viewProfile(){
        System.out.println("user profile viewed successfully");
    
    }
}