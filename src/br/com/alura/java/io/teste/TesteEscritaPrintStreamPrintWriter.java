package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo

//		OutputStream os = new FileOutputStream("Iorem2.txt");
//		Writer osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("Iorem2.txt"));
//		PrintStream ps = new PrintStream("Iorem2.txt");
		PrintWriter ps = new PrintWriter("Iorem.txt");
		
		ps.println("testeteste");
		ps.println();
		ps.println();
		ps.println("mkpaskpmvfkasmfkamsfkmaklmfalksfmaslkf");
		
		ps.close();
	}
}
