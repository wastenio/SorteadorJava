package sorteador;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorteio {
	public static void main(String[] args) {
		Set<String> participantes = new LinkedHashSet<>();
		participantes.add("wastenio");
		participantes.add("fabio");
		participantes.add("aylson");
		participantes.add("natalia");
		participantes.add("eduarda");
		participantes.add("lorena");
		participantes.add("solange");
		
		List<String> participantesEmbaralhados = participantes.stream().collect(Collectors.toList());
		Collections.shuffle(participantesEmbaralhados);
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(participantes.size());
		
		System.out.println(participantesEmbaralhados.get(numeroAleatorio));
	}

}
