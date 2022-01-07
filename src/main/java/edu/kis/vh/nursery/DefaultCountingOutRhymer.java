package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int LAST_INDEX = 11;
	private static final int NUM_OF_NUMBERS = 12;
	private static final int NO_ELEMENTS = -1;
	private final int[] numbers = new int[NUM_OF_NUMBERS];

	private int total = NO_ELEMENTS;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == NO_ELEMENTS;
	}
		
	public boolean isFull() {
		return total == LAST_INDEX;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return NO_ELEMENTS;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return NO_ELEMENTS;
		return numbers[total--];
	}

}
