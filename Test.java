import java.util.Scanner;
class Node{
	int data;
	Node left=null, right=null;
}
class BinaryTree{
	public Node root=null;
	Node insert(Node sub, int num){
		if(sub==null){
			System.out.println(sub);
			Node t=new Node();
			sub=t;
			t.data=num;
			System.out.println(sub);
		}
		else{
			if(num<sub.data){
				insert(sub.left,num);
			}
			else{
				insert(sub.right,num);
			}
		}
		return sub;
	}/* 
	void pop_back(){
		if(start==null){
			System.out.println("Sorry list is empty.");
		}
		else{
			Node x=start;
			Node y=null;
			while(x.next!=null){
				y=x;
				x=x.next;
			}
			y.next=null;
			x=null;
		}
	}
	void push_front(int num){
		if(start==null){
			Node t=new Node();
			start=t;
			t.data=num;
		}
		else{
			Node t=new Node();
			t.data=num;
			t.next=start;
			start=t;
		}
	}
	void pop_front(){
		if(start==null){
			System.out.println("Sorry list is empty.");
		}
		else{
			Node x=start;
			start=start.next;
			x=null;
		}
	} */
	void inOrder(Node sub){
		//System.out.println(sub);
		if(sub==null){
			return;
		}
		inOrder(sub.left);
		System.out.print(sub.data+" ");
		inOrder(sub.right);
	}
	void menu(){
		System.out.println("Enter your choice.");
		System.out.println("1. Insert.");
		System.out.println("2. Insert at front.");
		System.out.println("3. Delete from back.");
		System.out.println("4. Delete from front.");
		System.out.println("5. Exit.");
	}
}
public class Test{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		BinaryTree b=new BinaryTree();
		b.menu();	
		int choice=scan.nextInt();
		while(choice!=5){
			if(choice>1 || choice<1){
				System.out.println("Sorry, no such choice.Try again.");
				b.menu();
			}
			else{
				int num;
				switch(choice){
					case 1:
					num=scan.nextInt();
					b.root=b.insert(b.root,num);
					System.out.println();
					b.inOrder(b.root);
					System.out.println();
					//System.out.println(b.root);
					break;
				}
			}
			b.menu();
			choice=scan.nextInt();
		}
		System.out.println("Thankyou, Have a nice day.");
	}
}