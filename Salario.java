import java.util.Scanner;

public class Salario{
public static void main (String [] args){

  Scanner dato = new Scanner (System.in);
  System.out.println("Ingrese su nombre: ");
  String nombre = dato.next();
  System.out.println("Ingrese su salario por hora: ");
  float salario = dato.nextFloat();
  System.out.println("Ingrese sus horas de trabajo al mes: ");
  float horas = dato.nextFloat();
  float salariomes = horas*salario;
  if(salariomes > 450000){
    System.out.println("Hola "+nombre+" Su salario mensual es de: $"+salariomes+"");
  }else{
    System.out.println(nombre);
        }
      }
    }
  
