package datapath;

public class ALU {
	
	
	private final static int ADD  = 0;
	private final static int SUB  = 1;
	private final static int AND  = 2;
	private final static int NOR  = 3;
	private final static int SLL  = 4;
	private final static int SRL  = 5;
	private final static int SLT  = 6;
	private final static int SLTU = 7;
	

	public int add(int x, int y) {
		return (x + y);
	}

	public int sub(int x, int y) {
		return (x - y);
	}

	public int nor(int x, int y) {
		return ~(x | y);
	}

	public int and(int x, int y) {
		return (x & y);
	}

	// shift left x by y
	public int sll(int x, int y) {
		return x << y;
	}

	// shift right x by y
	public int srl(int x, int y) {
		return x >>> y;
	}
	public int slt(int x, int y) {
		if(x < y)
			return 1;
		return 0;
	}
	
	private int sltu(int x, int y) {
		for(int i = 31; i >= 0; i--) {
			boolean bitOfFirst = BinaryManiplator.getBitByIndex(x, i);
			boolean bitOfSecond = BinaryManiplator.getBitByIndex(y, i);
			if(!bitOfFirst && bitOfSecond)
				return 1;
			if(bitOfFirst && !bitOfSecond)
				return 0;
		}
		
		return 0;

}

}
