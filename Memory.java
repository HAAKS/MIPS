package datapath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Memory {
	// key:address, value:8 bits
	
	HashMap<Integer, Integer> memory = new HashMap<Integer, Integer>();

	public Memory() {
		}

	

	public int getMemory(int address) {
		return memory.get(address);
	}

	public void setMemory(int address, int value) {
		if (memory.containsKey(address)) {
			this.memory.replace(address, value);
		} else {
			System.out.println("This address is not available.");
		}
	}

	public HashMap<Integer, Integer> getDataMemory() {
		return memory;
	}



	public String getInstruction(int address) {
		String instruction = "";
		for (int i = 0; i < 4; i++) {
			for (String temp : InstructionMemory.get(address + i)) {
				instruction = instruction + temp;
			}
		}
		return instruction;
	}
	/*
	 * private HashMap<Integer, Integer> memory = new HashMap<Integer,
	 * Integer>(); private ArrayList<Integer> write = new ArrayList<Integer>();
	 * 
	 * private List<List<String>> dataMemory = new ArrayList<List<String>>();
	 * private List<List<String>> instrMemory = new ArrayList<List<String>>();
	 * 
	 * private int setBytesInWord(int address, int value) { return
	 * memory.put(address, value); }
	 * 
	 * public int getBytesInWord(final int address) { return
	 * memory.get(address); }
	 * 
	 * /* If you want to discompose a value in bytes: unsigned int a = 12345678;
	 * // 32 bits value, unsigned, signed needs some special considerations
	 * unsigned char b1, b2, b3, b4; // bytes
	 * 
	 * b1 = a & 0xFF; // least significant byte b2 = (a & 0xFF00) >> 8; b3 = (a
	 * & 0xFF0000) >> 16; b3 = (a & 0xFF000000) >> 24; // most significant value
	 * 
	 * public int setWord(int address, int word) { write.add(address);
	 * write.add(address + 1); write.add(address + 2); write.add(address + 3);
	 * 
	 * return setWordByte(address, word); }
	 * 
	 * private int setWordByte(int address, int newWord) { final int oldWord =
	 * getWordByte(address);
	 * 
	 * setBytesInWord(address, (byte) (newWord >> 24)); setBytesInWord(address +
	 * 1, (byte) (newWord >> 16 & 0xFF)); setBytesInWord(address + 2, (byte)
	 * (newWord >> 8 & 0xFF)); setBytesInWord(address + 3, (byte) (newWord &
	 * 0xFF));
	 * 
	 * return oldWord; }
	 * 
	 * public int getWordByte(final int address) { final int byte0 =
	 * getBytesInWord(address); final int byte1 = getBytesInWord(address + 1);
	 * final int byte2 = getBytesInWord(address + 2); final int byte3 =
	 * getBytesInWord(address + 3);
	 * 
	 * return (byte0 << 24) | ((byte1 << 16) & 0xFF0000) | ((byte2 << 8) &
	 * 0xFF00) | (byte3 & 0xFF); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * }
	 */
}
