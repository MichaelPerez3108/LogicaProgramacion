#include <iostream>
#include <iomanip>
using namespace std;
float cantidad,horas,salario;

int main(){
  cout<<"Ingrese la cantidad que desea comprar: "<<endl;
  cin>>cantidad;
  float costo = 800000;
  float precio = cantidad * costo;
  float porcentaje10 = (precio * 10) /100;
	float porcentaje20 = (precio*20)/100;
	float porcentaje40 = (precio*40)/100;
  if (cantidad <5)
  float salariomes = horas*salario;
if(cantidad < 5){
  float total = precio - porcentaje10;
  cout<<"Por su compra de menos de 5 unidades su total con el 10% de descuento es de: $"<<fixed<<setprecision(1)<<total;
  }else{
    if (cantidad >= 5 && cantidad < 10){
     float total = precio - porcentaje20;
     cout<<"Por su compra de mas de 5 unidades su total con el 20% de descuento es de: $"<<fixed<<setprecision(1)<<fixed<<setprecision(1)<<total;
      }else{
        if(cantidad >10){
          float total = precio - porcentaje40;
          cout<<"Por su compra de mas de 10 unidades recibira un descuento del 40% su total es de: $"<<fixed<<setprecision(1)<<total;
           }else{
             cout<<"valor incorrecto.";
              }
    }
  }
}