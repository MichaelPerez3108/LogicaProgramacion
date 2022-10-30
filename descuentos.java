import java.util.Scanner;
public class descuentos{
public static void main (String [] args){

  Scanner dato = new Scanner (System.in);
  System.out.println("Ingrese la cantidad que desea comprar: ");
  float cantidad = dato.nextFloat();
  float costo = 800000;
  float precio = cantidad * costo;
  float porcentaje10 = (precio * 10) /100;
	float porcentaje20 = (precio*20)/100;
	float porcentaje40 = (precio*40)/100;
  if(cantidad < 5){
    float total = precio - porcentaje10;
    System.out.println("Por su compra de menos de 5 unidades su total con el 10% de descuento es de: $"+total);
    }else{
    if (cantidad >=5 && cantidad <10){
      float total = precio - porcentaje20;
    System.out.println("Por su compra de mas de 5 unidades su total con el 20% de descuento es de: $"+total);
          }else{
            if (cantidad >10){
              float total = precio - porcentaje40;
              System.out.println("Por su compra de mas de 10 unidades recibira un descuento del 40% su total es de: $"+total);
            }else{
              System.out.println("valor incorrecto.");
              }
            }
          }
        }
      }
    