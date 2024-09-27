package com.campusdual.classroom;

import com.campusdual.util.Utils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise18 {
	static Scanner sc = new Scanner(System.in);

	public static int[] createAndInitializeArray(int num){
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = i+1;
		}
		return array;
	}
	public static void showInlineArray(int[] array){
		String valor ="";
		String a="";
		String salida = "";
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			salida += String.valueOf(num);
			if(i < array.length-1){
				a= " ";
				salida +=  a;
			}


			
		}System.out.print(salida);
	}
	public static int solicitarDatos(){
		//System.out.println("Escriba la cantidad de elementos");
		//String peticion = sc.nextInt();
		int dato = Utils.integer("introduce numero");
		return dato;
	}
	public static void main(String[] args) {
			int numero = solicitarDatos();

		int[] array = createAndInitializeArray(numero);
			showInlineArray(array);

	}
}
