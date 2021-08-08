package stack;

public class Mystack {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(20);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		
		Process process = new Process();
		process.push(myFirstNode);
		process.push(mySecondNode);
		process.push(myThirdNode);
		process.print();
		process.pop();
		
		
		process.print();
		process.peek();
	}
}
