package datapath;


public class Register32 {
private int[] registers;
	
	public Register32() {
		registers = new int[32];
	}
	
	public int getReg(int reg) {
		return registers[reg];
	}
	
	public void setReg(int reg, int data) {
		registers[reg] = data;
	}
	public String toString() {
		String reg = "{\n";
		 for(int i=0;i<31;i++)
			 reg += "\t" + i + " : " + registers[i] + "\n";
		reg += "}";
		return reg;
	}
}	


