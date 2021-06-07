/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MorseCode {
public static Scanner sc;
public static void main(String args[]) throws IOException 
{
int opcion = 0;
String sentenciaIntroducida = "",SentenciaACmorse = "",SentenciaAtextoNormal = "";
char[] LenguajeNormal = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
   //definicion de letras y numeros en lenguaje norml

String[] LenguajeMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
"-----" };  //Definicion de letras y numeros en LenguajeMorse 
sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("==Traduccion de texto a código morse y viceversa==");
System.out.println("");
do
{
System.out.println("QUE TAREA DESEA REALIZAR ");
System.out.println("1.Lenguaje de texto normal a codigo morse\n2.Generar morse a texto normal\n13.Salir ");
System.out.print("Opcion a realizar:");
//si introduce un valor que no sea numerico lanza un error y pide que realice una operacion valida
while(!sc.hasNextInt()) 
{
System.out.println("");
System.err.println("ERROR: Ingrese un dígito numerico");
System.out.print("Opcion a realizar:");
sc.next();   
}
opcion = sc.nextInt();
switch(opcion)
{
case 1:
{
System.out.println("");
System.out.println("Introduce el texto que deseas convertir a codigo morse ");
System.out.print("Texto Normal:");
sentenciaIntroducida = br.readLine();
System.out.println("");
sentenciaIntroducida = sentenciaIntroducida.toLowerCase(); 
char[] morsec = sentenciaIntroducida.toCharArray();
for(int i = 0; i < morsec.length;i++)  
{
for(int j = 0;j<LenguajeNormal.length;j++)   
{
if(LenguajeNormal[j] == morsec[i])  
{
SentenciaACmorse = SentenciaACmorse + LenguajeMorse[j] + " ";  
} 
}
}
System.out.println("El Texto traducido a morse es:");
System.out.print("Texto en morse: ");
System.out.println(SentenciaACmorse);
System.out.println("");
break;
}
case 2:
{
System.out.println("");
System.out.println("Introduce el codigo morse que deseas convertir a texto ");
System.out.print("Texto en morse: ");
sentenciaIntroducida = br.readLine();
System.out.println("");
String[] morsec = sentenciaIntroducida.split(" ");   
for(int i = 0;i < morsec.length;i++)
{
for(int j = 0;j < LenguajeMorse.length;j++)
{
if(LenguajeMorse[j].equals(morsec[i]))  
{
SentenciaAtextoNormal = SentenciaAtextoNormal + LenguajeNormal[j];  
}
}
}
System.out.println("El Texto traducido a lenguajeNormal es:");
System.out.print("Texto Normal:");
System.out.println(SentenciaAtextoNormal);
System.out.println("");
break;
}
case 3:
{
System.out.println("=========================");
System.out.println("Operaciones finalizadas");
System.out.println("=========================");
break;
}
default:
{
System.err.println("ERROR:opcion invalida");
System.out.println("");
break;
}
}
}
while(opcion!=3);
}}