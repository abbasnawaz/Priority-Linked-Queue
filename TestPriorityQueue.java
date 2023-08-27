public class TestPriorityQueue
{
	public static void main(String[] args)
	{
		QueueInterface<String> check0 = new LinkedQueue<String>();

		check0.enqueue("191370041",5);
		check0.enqueue("Muhammad",1);
		check0.enqueue("Nawaz",2);
		check0.enqueue("Abbas",2);
		check0.enqueue(" GIFT ",4);
		check0.print();

		check0.dequeue();
		check0.dequeue();
		check0.print();

		System.out.println(" Front = "+check0.getFront());
		System.out.println(" isEmpty = "+check0.isEmpty());

		System.out.println();
		System.out.println();

		QueueInterface<Integer> check1 = new LinkedQueue<Integer>();
		check1.enqueue(0,4);
		check1.enqueue(19,1);
		check1.enqueue(13,2);
		check1.enqueue(41,5);
		check1.enqueue(70,3);
		check1.print();

		check1.dequeue();
		check1.dequeue();
		check1.print();

		System.out.println(" Front = "+check1.getFront());
		System.out.println(" isEmpty = "+check1.isEmpty());



	}
}