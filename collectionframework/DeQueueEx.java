package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueEx {

	public static void main(String[] args) {
		Deque<Integer> qq=new ArrayDeque<Integer>();
		qq.offer(7);
		qq.offerFirst(8);
		qq.addLast(9);
		System.out.println(qq);
		int r=qq.pollLast(); //last element deleted
		System.out.println(r);
		System.out.println(qq);

	}

}
