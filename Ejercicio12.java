/**Ejercicio 12
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.**/

public class Ejercicio12 {
	public static void main (String[]args){
		System.out.println("Vamos a hacerte unas preguntillas: \n Estás Preparad@? \n");
		int puntos = 0;
		String acierto = "Respuesta correcta! Sumas un punto :)\n ";
		String fallo = "Ohh...has fallado...\n";
		
		String pregunta1 = "¿Qué es una variable? \n";
		String respuesta1a = "a. Un contenedor de información.\n";
		String respuesta1b = "b. Un contenedor que sólo guarda números.\n";
		String respuesta1c = "c. Un contenedor que sólo guarda texto.\n";
		
		System.out.print(pregunta1 + respuesta1a + respuesta1b + respuesta1c);
		String res1 = System.console().readLine();
		if (res1.equals("a")){		
			System.out.print(acierto);
			puntos++;
			} else {System.out.print(fallo);}
					
		String pregunta2 = "¿Qué puede ser una variable boolean?\n";
		String respuesta2a = "a. Verdadero y Falso.\n";
		String respuesta2b = "b. Una cadena de caracteres.\n";
		String respuesta2c = "c. Ambas son ciertas.\n";
		
		System.out.print(pregunta2 + respuesta2a + respuesta2b + respuesta2c);
		String res2 = System.console().readLine();
		if (res2.equals("a")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}			
			
		String pregunta3 = "¿Cómo recogemos datos por teclado?\n";
		String respuesta3a = "a. String[]args \n";
		String respuesta3b = "b. System.out.print().\n";
		String respuesta3c = "c. System.console().readLine().\n";
		
		System.out.print(pregunta3 + respuesta3a + respuesta3b + respuesta3c);
		String res3 = System.console().readLine();
		if (res3.equals("c")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}	
				
		String pregunta4 = "¿Cuál es una variable con decimales?\n";
		String respuesta4a = "a. String \n";
		String respuesta4b = "b. Double\n";
		String respuesta4c = "c. Int \n";
		
		System.out.print(pregunta4 + respuesta4a + respuesta4b + respuesta4c);
		String res4 = System.console().readLine();
		if (res4.equals("b")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}
				
				
		String pregunta5 = "¿Para qué sirve System.out.printf?\n";
		String respuesta5a = "a. Para formatear un texto, pudiendo elegir los caracteres que quieres mostrar y el tipo que son. \n";
		String respuesta5b = "b. Para mostrar texto normal.\n";
		String respuesta5c = "c. Ninguna es correcta. \n";
		
		System.out.print(pregunta5 + respuesta5a + respuesta5b + respuesta5c);
		String res5 = System.console().readLine();
		if (res5.equals("a")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}	
				
		String pregunta6 = "¿Cómo se le llaman a estas llaves {}?\n";
		String respuesta6a = "a. Las llaves de programación. \n";
		String respuesta6b = "b. Las llaves egipcias. \n";
		String respuesta6c = "c. No se le han puesto nombre. \n";
		
		System.out.print(pregunta6 + respuesta6a + respuesta6b + respuesta6c);
		String res6 = System.console().readLine();
		if (res6.equals("b")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}				
				
		String pregunta7 = "En un if ¿cómo comparas la variable respuesta a la palabra hola?\n";
		String respuesta7a = "a. respuesta.hola \n";
		String respuesta7b = "b. respuesta = hola\n";
		String respuesta7c = "c. respuesta.equals(hola)\n";
		
		System.out.print(pregunta7 + respuesta7a + respuesta7b + respuesta7c);
		String res7 = System.console().readLine();
		if (res7.equals("c")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}
		
		String pregunta8 = "Señala cuales no son operadores de Java. \n";
		String respuesta8a = "a. =< y =>\n";
		String respuesta8b = "b. <= y >= \n";
		String respuesta8c = "c. == y !=\n";
		
		System.out.print(pregunta8 + respuesta8a + respuesta8b + respuesta8c);
		String res8 = System.console().readLine();
		if (res8.equals("a")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}
				
				
		String pregunta9 = "¿Qué utilizarás si quieres mostrar un resultado dependiendo de si es caso = 1 o caso =2?\n";
		String respuesta9a = "a. If o Switch \n";
		String respuesta9b = "b. Else \n";
		String respuesta9c = "c. Ninguno \n";
		
		System.out.print(pregunta9 + respuesta9a + respuesta9b + respuesta9c);
		String res9 = System.console().readLine();
		if (res9.equals("a")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}
				
		String pregunta10 = "¿Como termina cada case del switch?\n";
		String respuesta10a = "a. Con end. \n";
		String respuesta10b = "b. Con nada. \n";
		String respuesta10c = "c. Con break. \n";
		
		System.out.print(pregunta10 + respuesta10a + respuesta10b + respuesta10c);
		String res10 = System.console().readLine();
		if (res10.equals("c")){		
			System.out.print(acierto);
			puntos ++;			
			} else {
				System.out.print(fallo);
				}
		
									
		System.out.print("Tu puntuación: " + puntos + "\n");
		
		}	
	}
