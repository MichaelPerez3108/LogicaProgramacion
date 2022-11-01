import java.util.Scanner;


public class universidad{
public static void main (String [] args){

    Scanner dato = new Scanner(System.in);
    float nota1 =0;
    float nota2 =0;
    float nota3 =0;
    System.out.println("Seleccione cual es el tipo de carrera que esta cursando: "); 
    System.out.println("1: Pregrado.");
    System.out.println("2: Posgrado.");
    int seleccion = dato.nextInt();
    switch (seleccion){
        case 1:
        System.out.println("Eres estudiante de pregrado, porfavor");
        System.out.println("Digite su nota 1: ");
        nota1 = dato.nextFloat();
        System.out.println("Digite su nota 2: ");
        nota2 = dato.nextFloat();
        System.out.println("Digite su nota 3: ");
        nota3 = dato.nextFloat();

        float promedio = (nota1+nota2+nota3)/3;
        if(promedio >= 4.5){
            System.out.println("Su promedio es de: "+promedio+" ");
            System.out.println("Cursaras con 28 creditos y obtendras un 25% de descuento.");
            float subtotal = 28*50000;
            float descuento = (subtotal*25)/100;
            float total = subtotal- descuento;
            System.out.println("En total pagaras: "+total);
        }else{
            if (promedio >= 4.0 && promedio < 4.5){
                System.out.println("Su promedio es de: "+promedio+" ");
                System.out.println("Cursaras con 25 creditos y obtendras un 10% de descuento.");
                float subtotal = 25*50000;
                float descuento = (subtotal*10)/100;
                float total = subtotal- descuento;
                System.out.println("En total pagaras: "+total); 
            }else{
                if (promedio > 3.5 && promedio < 4.0){
                    System.out.println("Su promedio es de: "+promedio+" ");
                    System.out.println("Cursaras con 20 creditos.");
                    float subtotal = 20*50000;
                    System.out.println("En total pagaras: "+subtotal);
                }else{
                    if(promedio >= 2.5 && promedio < 3.4){
                        System.out.println("Su promedio es de: "+promedio+" ");
                        System.out.println("Cursaras con 15 creditos.");
                        float subtotal = 15*50000;
                        System.out.println("En total pagaras: "+subtotal);
                    }else{
                        if(promedio < 2.5){
                            System.out.println("Su promedio es de: "+promedio+" ");
                            System.out.println("Lo sentimos, no puedes matricularte en la universidad.");
                        }
                    }
                }
            }
        }

        break;
    
        case 2:{
            System.out.println("Eres estudiante de posgrado porfavor ");
            System.out.println("Eres estudiante de pregrado, porfavor");
            System.out.println("Digite su nota 1: ");
            nota1 = dato.nextFloat();
            System.out.println("Digite su nota 2: ");
            nota2 = dato.nextFloat();
            System.out.println("Digite su nota 3: ");
            nota3 = dato.nextFloat();
            promedio = (nota1+nota2+nota3)/3;
            if (promedio >= 4.5){
                System.out.println("Su promedio es de: "+promedio+" ");
                System.out.println("Cursaras con 20 creditos y obtendras un 20% de descuento.");
                float subtotal = 20*300000;
                float descuento = (subtotal*20)/100;
                float total = subtotal - descuento;
                System.out.println("En total pagaras: "+total);
            }else{
                if(promedio < 4.5){
                    System.out.println("Su promedio es de: "+promedio+" ");
                    System.out.println("Cursaras con 10 creditos.");
                    float subtotal = 10*300000;
                    System.out.println("En total pagaras: "+subtotal);
                }
            }
        }

        }
    }
}
