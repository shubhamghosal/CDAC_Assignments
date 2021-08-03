package tester;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.app.core.CircularQueue;

class CircularQueueTest {
	@Test
	void testForEmpty() {
		CircularQueue cq = new CircularQueue(3);
		assertTrue(cq.isEmpty());
	}
	
	@Test
	void testForFull() {
		CircularQueue cq = new CircularQueue(3);
		assertFalse(cq.isFull());
	}
	
	@Test
	void testEnqueueUtilFull() {
		CircularQueue cq = new CircularQueue(1);
		cq.enQueue(1);
		assertTrue(cq.isFull());
	}
	
	@Test
	void testEnqueueDequeueAndValidate() {
		CircularQueue cq = new CircularQueue(3);
		int e = 10;
		cq.enQueue(e);
		assertTrue(cq.deQueue() == e);
	}

}
