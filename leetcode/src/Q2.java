import java.util.ArrayList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }

}

public class Q2 {

     // Q1. answer, problem: exceeds the max of int
     public static ListNode answer(ListNode l1, ListNode l2){
         long result = 0;
         int index = 0;
         while (l1!=null||l2!=null){
             if (l1!=null&&l2!=null){
                 result += (long)((l1.val+l2.val) * ((int)Math.pow(10,index)));
             }else if (l1!=null&&l2==null){
                 result += (long)((l1.val) * ((int)Math.pow(10,index)));
             }else if (l1==null&&l2!=null){
                 result += (long)((l2.val) * ((int)Math.pow(10,index)));
             }
             if(l1!=null){
                 l1 = l1.next;
             }
             if (l2!=null){
                 l2 = l2.next;
             }
             index++;
             System.out.println(result);
         }
         if (result<10){
             return new ListNode((int)result);
         }
         String s = new Long(result).toString();
         System.out.println(s);
         int[] arr = new int[s.length()];
         for (int i=0; i<s.length(); i++){
             arr[i] = (int)(result/((int)Math.pow(10,i))) % 10;
         }
         ListNode first = null;
         ListNode current = null;
         for (int i=0; i<s.length()-1; i++){
             if (first==null){
                 first = new ListNode(arr[i]);
                 current = first;
             }
             current.next = new ListNode(arr[i+1]);
             current = current.next;
         }
         return first;
     }

     // Q2. solution : Linked List
     public ListNode solution(ListNode l1, ListNode l2){
         ListNode dummy = new ListNode(0);
         ListNode cur   = dummy;

         for (int carry = 0; l1!=null || l2!=null || carry>0; ){
             int n1 = l1!=null ? l1.val : 0;
             l1 = l1!=null ? l1.next : null;
             int n2 = l2!=null ? l2.val : 0;
             l2 = l2!=null ? l2.next : null;

             int sum = n1 + n2 + carry;
             ListNode node = new ListNode(sum%10);
             carry = sum/10;
             cur.next = node;
             cur = node;
         }
         return dummy.next;
     }

     public static void main (String[] args){
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        two.next = three;

        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        four.next = five;

        System.out.print(answer(two, four));
     }
}
