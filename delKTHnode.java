import java.util.Scanner;

public class delKTHnode {
    
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        int temp = sc.nextInt();
	        list.addNode(temp);
	    }
	    System.out.print("Linked List: ");
	    list.printList();
	    list.deleteK(3);
	    list.printList();
	}
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList{
        Node head;
        public void addNode(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            else{
                Node temp = head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next = newNode;
            }
        }
        public void deleteK(int k){
            Node temp1 = head;
            Node temp2=head;
            if(head==null){
                return;
            }
            while(k>0){
                temp2 = temp2.next;
                if(temp2==null){
                    System.out.println("Size of Linked List is less than K");
                    return;
                }
                k--;
            }
            Node prev = head;
            while(temp2!=null){
                prev = temp1;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            prev.next = temp1.next;
     
        }
        public void printList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
