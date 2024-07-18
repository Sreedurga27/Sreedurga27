package FirstJavaProgram;

public class jvm {

	public static void main(String[] args) {
		System.out.println("JVM - Java Virtual Machine");
		System.out.println("Java is both complied and interpreted language");
		System.out.println("JVM consists of three components");
		System.out.println("They are Class loader, Runtime Memory/Data Area, Execution Engine");
		System.out.println("In class loader there are three phases They are Loading, Linking, Initialization");
		System.out.println("Loading consists of Bootstrap class loader, Extension class loader and Application class loader");
		System.out.println("Linking consists of verify, prepare and resolve");
		System.out.println("Initialization involves executing the initialization method of the class or interface (known as <clinit>)");
		System.out.println("There are five components inside the runtime data area");
		System.out.println("they are method area, heap area, stack area,PC register,Native method stack");
		System.out.println("Stack frame is divided into three sub-parts they are Local variables, Operand stack, and Frame data");
		System.out.println("Execution engine consists of Interpreter, JIT Compiler and Garbage collector");
		System.out.println("The interpreter reads and executes the bytecode instructions line by line");
		System.out.println("JIT compiler has the following components Intermediate code generator, code optimizer, target code generator,profiler");
		System.out.println("The garbage collector collects and removes unreferenced objects from the heap area. There are 3 types of GC They are Serial GC,Parallel GC, Garbage First(G1)GC");

	}

}
