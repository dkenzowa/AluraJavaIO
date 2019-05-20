package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo

//		OutputStream os = new FileOutputStream("Iorem2.txt");
//		Writer osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("Iorem2.txt"));
		bw.write("testeteste");
		bw.newLine();
		bw.newLine();
		bw.write("mkpaskpmvfkasmfkamsfkmaklmfalksfmaslkf");

		bw.close();
	}
}
