import java.util.Scanner;
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val ;
        this.next = null;
    }
}


public class MergeListQuestionLeetcode {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
           ListNode dummy = new ListNode(-1);
           ListNode temp = dummy;



           while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1 = list1.next;
                } else{
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;

           }


           if(list2!=null){
            temp.next = list2;
           }

           if(list1!=null){
            temp.next=list1;
           }
           return dummy.next;
    }

    public static ListNode createList(Scanner sc){
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) return null;

        System.out.print("Enter elements (sorted): ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        return head;
    }

    public static void display(ListNode head){
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MergeListQuestionLeetcode sol = new MergeListQuestionLeetcode();

        System.out.println("First Sorted List: ");
        ListNode list1 = createList(sc);

        System.out.println("Second Sorted List: ");
        ListNode list2 = createList(sc);



        ListNode mergedList = sol.mergeTwoLists(list1, list2);

        System.out.println("Merged Sorted List:");
        display(mergedList);
    }
}