package stack;

public class Process<k> {
	INode<k> head;
	INode<k> tail;
	
	public Process() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(INode<k> myNode) {
		if(this.head==null) 
			this.head=myNode;
		if(this.tail==null)
			this.tail=myNode;
		else {
			INode<k> tempNode=this.head;
			this.head=myNode;
			this.head.setNext(tempNode);
		}	
	}
	
	public void peek(){
		System.out.println("The element at the top of the stack is: " + this.head.getKey());
	}
	
	public  void pop() {
		INode<k> temp = this.head;
		this.head=head.getNext();
		System.out.println("Popped element: "+temp.getKey());
	}
	
	public void print() {
		StringBuffer myNodes = new StringBuffer("My stack is : ");
		INode<k> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
