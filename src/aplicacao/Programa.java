package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente cl1 = new Cliente("Maria","maria@gmail.com", sdf.parse("20/10/1995"));
		
		System.out.println(cl1);
		
		sc.close();
		

	}

}
