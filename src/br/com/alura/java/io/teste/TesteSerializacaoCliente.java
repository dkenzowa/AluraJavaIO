package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Danilo Kenzo");
		cliente.setProfissao("Analista de T.I");
		cliente.setCpf("34124314122");
		
		String nome = "Danilo Kenzo";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());
	}

}
