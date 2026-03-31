import java.util.Scanner;

class FindIndexProblem {

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }


        return haystack.indexOf(needle);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       FindIndexProblem solution = new FindIndexProblem();


        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();



        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();

        int result = solution.strStr(haystack, needle);

        if (result != -1) {

            System.out.println("Needle found at index: " + result);
        } else {
            System.out.println("Needle not found (-1)");
        }


        sc.close();
    }
}