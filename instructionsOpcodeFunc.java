package datapath;

public class instructionsOpcodeFunc {

	/*
	 * Arithmetic:
	 */

	// Instructions
	public static final String add = "add";
	public static final String addi = "addi";
	public static final String sub = "sub";
	// Opcodes
	public static final int addOpcode = 0x00;
	public static final int addiOpcode = 0x08;
	public static final int subOpcode = 0x00;
	// Functions .. R-Format Instructions
	public static final int addFunction = 0x20;
	public static final int subFunction = 0x22;

	/*
	 * Load/Store:
	 */

	// Instructions
	public static final String lw = "lw";
	public static final String lb = "lb";
	public static final String lbu = "lbu";
	public static final String sw = "sw";
	public static final String sb = "sb";
	public static final String lui = "lui";
	// Opcodes
	public static final int lwOpcode = 0x23;
	public static final int lbOpcode = 0x20;
	public static final int lbuOpcode = 0x24;
	public static final int swOpcode = 0x2B;
	public static final int sbOpcode = 0x28;
	public static final int luiOpcode = 0x0F;

	/*
	 * Logic:
	 */

	// Instructions
	public static final String sll = "sll";
	public static final String srl = "srl";
	public static final String and = "and";
	public static final String nor = "nor";
	// Opcodes
	public static final int sllOpcode = 0x00;
	public static final int srlOpcode = 0x00;
	public static final int andOpcode = 0x00;
	public static final int norOpcode = 0x00;
	// Functions .. R-Format Instructions
	public static final int sllFunction = 0x00;
	public static final int srlFunction = 0x02;
	public static final int andFunction = 0x24;
	public static final int norFunction = 0x27;

	/*
	 * Control Flow:
	 */

	// Instructions
	public static final String beq = "beq";
	public static final String bne = "bne";
	public static final String j = "j";
	public static final String jal = "jal";
	public static final String jr = "jr";
	// Opcodes
	public static final int beqOpcode = 0x04;
	public static final int bneOpcode = 0x05;
	public static final int jOpcode = 0x02;
	public static final int jalOpcode = 0x03;
	public static final int jrOpcode = 0x00;
	// Functions .. R-Format Instructions
	public static final int jrFunction = 0x08;

	/*
	 * Comparison:
	 */

	// Instructions
	public static final String slt = "slt";
	public static final String sltu = "sltu";
	// Opcodes
	public static final int sltOpcode = 0x00;
	public static final int sltuOpcode = 0x00;
	// Functions .. R-Format Instructions
	public static final int sltFunction = 0x2A;
	public static final int sltuFunction = 0x2B;

}
