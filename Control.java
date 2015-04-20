package datapath;

public class Control {
	public String RegDst = "0";
	public String ALUSrc = "0";
	public String MemToReg = "0";
	public String RegWrite = "0";
	public String MemRead = "0";
	public String MemWrite = "0";
	public String Branch = "0";
	public String Jump = "0";
	// ALUOp 2 bits 00,01,10
	public String ALUOp0 = "0";
	public String ALUOp1 = "0";
	public String ALUControl;
	public String Zero = "0";

	public Control(String opCode, String function) {
		switch (opCode) {
		case "000000":
			// R Type
			RegDst = "1";
			ALUSrc = "0";
			MemToReg = "0";
			RegWrite = "1";
			MemRead = "0";
			MemWrite = "0";
			Branch = "0";
			ALUOp0 = "0";
			ALUOp1 = "1";
			break;

		case "100011":
			// LW
			RegDst = "0";
			ALUSrc = "1";
			MemToReg = "1";
			RegWrite = "1";
			MemRead = "1";
			MemWrite = "0";
			Branch = "0";
			ALUOp0 = "0";
			ALUOp1 = "0";
			break;

		case "101011":
			// sw
			RegDst = "0";
			ALUSrc = "1";
			MemToReg = "0";
			RegWrite = "0";
			MemRead = "0";
			MemWrite = "1";
			Branch = "0";
			ALUOp0 = "0";
			ALUOp1 = "0";
			break;

		case "000100":
			// beq
			RegDst = "0";
			ALUSrc = "0";
			MemToReg = "0";
			RegWrite = "0";
			MemRead = "0";
			MemWrite = "0";
			Branch = "1";
			ALUOp0 = "1";
			ALUOp1 = "0";
			break;

		case "001000":
			// addi
			RegDst = "0";
			ALUSrc = "1";
			MemToReg = "0";
			RegWrite = "1";
			MemRead = "0";
			MemWrite = "0";
			Branch = "0";
			ALUOp0 = "0";
			ALUOp1 = "0";
			break;

		case "000010":
			// Jump
			Jump = "1";
			break;

		default:
			System.out.println("This opcode is not valid.");
			return;
		}
		this.ALUControl(function);
	}

	private void ALUControl(String function) {
		if ((ALUOp0.equals("0")) & ((ALUOp1.equals("0")))) {
			// lw/sw
			ALUControl = "0010";
		} else if ((ALUOp0.equals("1")) & ((ALUOp1.equals("0")))) {
			// beq
			ALUControl = "0110";
		} else if ((ALUOp1.equals("1"))) {
			if (function.equals("100000")) {
				// add
				ALUControl = "0010";
			} else if (function.equals("100010")) {
				// sub
				ALUControl = "0110";
			} else if (function.equals("100100")) {
				// and
				ALUControl = "0000";
			} else if (function.equals("101010")) {
				// slt
				ALUControl = "0111";
			} else if (function.equals("100111")) {
				// nor
				ALUControl = "1100";
			}

		}
	}
}
