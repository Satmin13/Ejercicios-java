/**
Ejercicio 21
Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara
**/

public class Ejercicio21 {

  public static void main(String[] args) {
	  
	  int aleatorio = 0;
	  String posicion = "";
	  String posDos = "";
	  String posVeinte = "";
	  String posCinc = "";
	  String posEur = "";
	  String posDosEur = "";
	  
	  for( int i = 0 ; i<6 ; i++) {
	  
	  aleatorio = (int) (Math.random() * (2)); 
	  
	  
		  switch(aleatorio){
			  case 0 :
			  posicion = "cara";
			  break;
			  case 1:
			  posicion = "cruz";
			  break;
			  default:;
			  }
		  if(i==1){
			  posDos = posicion;
			  }
		  if(i==2){
			  posVeinte = posicion;
			  }
		  if(i==3){
			  posCinc = posicion;
			  }
		  if(i==4){
			  posEur = posicion;
			  }
		  if(i==5){
			  posDosEur = posicion;
			  }
	  }
	  System.out.println("2 céntimos: " + posDos + ". 20 cént.: " + posVeinte + ". 50 cént.: " + posCinc + ". Euro: " + posEur + ". Dos Euros: " + posDosEur);
	  
  }
 }
