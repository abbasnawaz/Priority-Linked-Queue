import java.util.NoSuchElementException;
public final class LinkedQueue<T> implements QueueInterface<T>
{
   private Node<T> head;
   private Node<T> tail; 
  	
	public LinkedQueue()
	{
		head = null;
		tail = null;
	}

	public void enqueue(T newEntry, int loc)
	{
		Node<T> data = new Node<T>(newEntry,loc,null);
		data.setNextNode(null);
		if(isEmpty())
		{
			head=data;
			tail=data;
		}
		else
		{
			if(loc>=tail.getpriority())
			{
				tail.setNextNode(data);
				tail=data;
			}
			else if(loc<=head.getpriority())
			{
				data.setNextNode(head);
				head=data;
			}
			else
			{
				Node<T> before = getNodeAt(loc);
				Node<T> after = before.getNextNode();
				before.setNextNode(data);
				data.setNextNode(after);
			}
		}
	 
	}

	private Node<T> getNodeAt(int pos)
	{
		if(!isEmpty())
		{
			Node<T> toReturn = head;
			Node<T> curr = head;
			while(pos>curr.getpriority()&&curr!=null)
			{
				toReturn=curr;
				curr=curr.getNextNode();
			}
			return toReturn;
		}
		else
			throw new NullPointerException(" Empty ");
	}

	public T getFront()
	{
		if(head==null)
		{
			throw new NoSuchElementException(" Stack is Empty");
		}
		else
			return (T)head.getData();
	}

	public T dequeue()
	{
		T front = getFront(); 
	   if(head!=null)
	   {
			head.setData(null);
	   		head =head.getNextNode();
	   	}
	   if (head == null)
	   {
	      tail = null;
	   }

	   return front;
	}


	public boolean isEmpty()
	{

	   return (head==null)&&(tail==null);
	} 

	public void clear()
	{
		head=null;
		tail=null;
	   
	}

	public void print() 
	{  
        Node<T> current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
        }  
        else 
        {  
            System.out.println("Nodes of the linked list: ");  
			while(current!=null)
			{
				System.out.println(current.getData());
				current=current.getNextNode();
			}
    	}
    }


    private class Node<T>
	{
		private T data;
		private int priority;
		private Node<T> nextNode;


		public Node(T data,int priority2, Node<T> nextNode)
		{
			
			this.data = data;
			this.priority = priority2;
			this.nextNode = nextNode;
		}
		public T getData()
		{
			return data;
		}
		public int getpriority()
		{
			return priority;
		}
		public void setData(T data)
		{
			this.data = data;
		}
		public void setpriority(int p)
		{
			this.priority = p;
		}
		public Node<T> getNextNode()
		{
			return nextNode;
		}
		public void setNextNode(Node<T> nextNode)
		{
			this.nextNode = nextNode;
		}






	}



}