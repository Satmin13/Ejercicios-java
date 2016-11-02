/**
Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.**/
public class Ejercicio10{
	public static void main(String[]args){
		System.out.println("¿Que dia naciste? ");
		int diaNacimiento = Integer.parseInt(System.console().readLine());
		System.out.println("¿Qué mes naciste? ");
		int mesNacimiento = Integer.parseInt(System.console().readLine());
			if ((mesNacimiento == 1 && diaNacimiento >= 20) || (mesNacimiento == 12 && diaNacimiento <= 12)){
				System.out.println("Tu horóscopo es Capricornio");
				}else if((mesNacimiento == 1 && diaNacimiento >= 21) || (mesNacimiento == 2 && diaNacimiento <= 19)){
					System.out.println("Tu horóscopo es Acuario");
					}else if((mesNacimiento == 2 && diaNacimiento >= 21) || (mesNacimiento == 3 && diaNacimiento <= 20)){
						System.out.println("Tu horóscopo es Piscis");
						}else if((mesNacimiento == 4 && diaNacimiento >= 21) || (mesNacimiento == 5 && diaNacimiento <= 21)){
							System.out.println("Tu horóscopo es Tauro");
						 }else if((mesNacimiento == 5 && diaNacimiento >= 22) || (mesNacimiento == 6 && diaNacimiento <= 21)){
							System.out.println("Tu horóscopo es Géminis");
							}else if((mesNacimiento == 6 && diaNacimiento >= 22) || (mesNacimiento == 7 && diaNacimiento <= 22)){
								System.out.println("Tu horóscopo es Cáncer");
								}else if ((mesNacimiento == 7 && diaNacimiento >= 23) || (mesNacimiento == 8 && diaNacimiento <= 22)){
									System.out.println("Tu horóscopo es Leo");
									} else if((mesNacimiento == 8 && diaNacimiento >= 23) || (mesNacimiento == 9 && diaNacimiento <= 22)){
										System.out.println("Tu horóscopo es Virgo");
										}else if ((mesNacimiento == 9 && diaNacimiento >= 23) || (mesNacimiento == 10 && diaNacimiento <= 22)){
											System.out.println("Tu horóscopo es Libra <3");
											}else if ((mesNacimiento == 10 && diaNacimiento >= 23) || (mesNacimiento == 11 && diaNacimiento <= 22)){
												System.out.println("Tu horóscopo es Escorpio");
												} else if ((mesNacimiento == 11 && diaNacimiento >= 23) || (mesNacimiento == 12 && diaNacimiento <= 22)){
													System.out.println("Tu horóscopo es Sagitario");
												}else{System.out.println("La fecha no existe no existe");
													}
												
	}

}
