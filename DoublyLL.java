
class DoublyLL {


static class Node
{
	char num;
	Node prev;
	Node next;
}
static Node First = null;

static void Doublyll_rotate( int N)
{
	if (N == 0)
		return;


	Node present = First;

	int count = 1;
	while (count < N && present != null)
	{
		present = present.next;
		count++;
	}


	if (present == null)
		return;

	Node Node_nth = present;


	while (present.next != null)
		present = present.next;

	present.next = First;


	(First).prev = present;


	First = Node_nth.next;

	(First).prev = null;

	Node_nth.next = null;
}


static void push(char new_num)
{
	Node new_node = new Node();
	new_node.num = new_num;
	new_node.prev = null;
	new_node.next = (First);
	if ((First) != null)
		(First).prev = new_node;
First = new_node;
}


static void List_Print(Node node)
{
	while (node != null && node.next != null)
	{
		System.out.print(node.num + " ");
		node = node.next;
	}
	if(node != null)
	System.out.print(node.num);
}

// Driver's Code
public static void main(String[] args)
{

	push( '5');
	push( '4');
	push('3');
	push('2');
	push( '1');

	int N = 3;

	System.out.println("Original list: ");
	List_Print(First);
	Doublyll_rotate( N);
	System.out.println();
	System.out.println("Rotated list: ");
	List_Print(First);
}
}


