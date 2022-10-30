#include <iostream>
using namespace std;

float horas,salario,salariomes;
string nombre;
int main(){
  cout<<"Ingrese su nombre: "<<endl;
  cin>>nombre;
    cout<<"Ingrese su salario por hora: "<<endl;
  cin>>salario;
    cout<<"Ingrese sus horas trabajadas al mes: "<<endl;
  cin>>horas;
  float salariomes = horas*salario;
if (salariomes > 450000){
  cout<<"Su nombre es: "<<nombre<<" Y su salario es de: $"<<salariomes<<endl;
}
  else{
  cout<<nombre<<endl;
}
}