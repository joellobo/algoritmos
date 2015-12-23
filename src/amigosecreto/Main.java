package amigosecreto;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<String> participantes = new ArrayList<String>();
	
	static {
		participantes.add("Jose");
		participantes.add("Joao");
		participantes.add("Maria");
		participantes.add("Ana");
		participantes.add("Raimunda");
	}
	
	public static void main(String[] args) {
		if (participantes.size() < 1) {
			throw new RuntimeException("Numero de participantes invalido");
		}
		
		List<String> amigos = new ArrayList<String>(participantes.size());
		String ultimo = participantes.get(participantes.size()-1);
		
		amigos.add(ultimo);
		for (int i = 0; i < participantes.size()-1; i++) {
			amigos.add(participantes.get(i));
		}
		
		for (int i = 0; i < participantes.size(); i++) {
			System.out.println(participantes.get(i) + "," + amigos.get(i));
		}
	}
}
