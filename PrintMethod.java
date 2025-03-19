public class PrintMethod{
    public static void main(String[] args){
	    //using the print()
		System.out.print("\"Learnin Java is Fun\"\n");
		System.out.print(" Hey, come and learn Java with me");
		
		//using the println()
		System.out.println();
		System.out.println("I want to tell you that Java is different from javascript");
		System.out.println("\t This is the indented text");
		
		//using the printf
		System.out.printf("My name is Mercy and I love %s. Good day everyone\n","Java");
		System.out.printf("I am %d years old%n",25);
		System.out.printf("I bought Java JDK with %f naira%n",159.345);
		System.out.printf("I bought Java JDK with %c%.2f naira%n",'$',159.345);
		
		boolean isJavaFun = true;
		System.out.printf("is Java Fun? %b",isJavaFun);
	}
}