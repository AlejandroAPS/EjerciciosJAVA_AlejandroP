public class Principal {

	public static void main(String[] args) {
		//Inicializacion del array
		Juego[] arrayJuegos = new Juego[10];
		//Pongo aqui el array con los datos otorgados por BIG GPT
		arrayJuegos[0] = new Juego("Minecraft", "Mojang", 50);

		arrayJuegos[1] = new JuegoAccion("Call of Duty", "Activision", 60, 20, 25);
		arrayJuegos[2] = new JuegoEstrategia("Age of Empires II", "Microsoft", 55, 10, 100);
		arrayJuegos[3] = new JuegoDeporte("FIFA 23", "EA Sports", 70, 15, 30);

		arrayJuegos[4] = new Juego("The Sims 4", "Electronic Arts", 40);

		arrayJuegos[5] = new JuegoAccion("God of War", "Santa Monica Studio", 65, 18, 40);
		arrayJuegos[6] = new JuegoEstrategia("Civilization VI", "Firaxis Games", 58, 12, 80);
		arrayJuegos[7] = new JuegoDeporte("NBA 2K24", "2K Sports", 75, 20, 55);

		arrayJuegos[8] = new JuegoAccion("Fortnite", "Epic Games", 0, 30, 100);

		arrayJuegos[9] = new JuegoEstrategia("StarCraft II", "Blizzard", 62, 8, 60);
		
		double suma = 0;
		double max = 0;
		Juego juegoMax = null;

		for (Juego juego : arrayJuegos) {
			double puntuacionFinal = juego.calcularPuntuacionFinal();
			suma = suma + puntuacionFinal;

			if (puntuacionFinal > max) {
				max = puntuacionFinal;
				juegoMax = juego;
			}

		    System.out.println(juego);
		    System.out.println("Puntuación final: " + puntuacionFinal
		    					+ "\n" +"===============================");
		}

		//Seccion final
		double media = suma / arrayJuegos.length;

		System.out.println("Media de todas las puntuaciones: " + media);

		System.out.println("La puntuación máxima la tiene:");
		System.out.println(juegoMax);
		System.out.println("La puntuación máxima final es de: " + max);
		System.out.println("==========================================");
	}
}

	

