package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com um arquivo
		
		OutputStream os = new FileOutputStream("Iorem2.txt");
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("testeteste");
		bw.newLine();
		bw.write("mkpaskpmvfkasmfkamsfkmaklmfalksfmaslkf");
		
		bw.close();
	}
}