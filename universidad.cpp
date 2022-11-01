#include <iostream>
#include <iomanip>
using namespace std;

string nombre;
float nota1;
float nota2;
float nota3;
float promedio;
string desicion;
int Vprecreditos = 50000;
int Vposcreditos = 300000;
int creditos;
float total;
int main() {
	cout<< "Nombre del alumno: "<<endl;
	cin >> nombre;
	cout<< "notas del alumno: "<< endl;
	cin >> nota1;
	cin >> nota2;
	cin >> nota3;
	cout << "estudio superior del estudiante: " << endl;
	cin >> desicion;
	promedio = (nota1 + nota2 + nota3)/3;
	cout << promedio << endl;
  if (desicion == "pregrado"){ 
	  if (promedio >= 4.5)
  {
    creditos= 28;
		total = Vprecreditos*creditos*0.25;
		cout <<fixed<<setprecision(1)<<total<< endl;
  } 
	if (promedio >= 4.0 && promedio < 4.5)
  {
    creditos= 25;
		total = Vprecreditos*creditos*0.10;
		cout << total << endl;
  }
	if (promedio>3.5 && promedio<4.0)
  {
		creditos=20;
		total=Vprecreditos*creditos,
		cout <<fixed<<setprecision(1)<<total << endl;
  }

	if (promedio>=2.5 && promedio<3.5)
  {
    creditos=15;
		total=Vprecreditos*creditos,
		cout << total << endl;
  }
	if (promedio<2.5)
  {
    cout << "no podra graduarse" << endl;
  }
  }
  else
    if (desicion == "posgrado")
	if (promedio >= 4.5)
  {
    creditos=20;
    total=Vposcreditos*creditos*0.2;
    cout<< fixed<<setprecision(1)<<total<< endl;
  }
	if (promedio < 4.5)
  {
    creditos=10;
    total=Vposcreditos*creditos;
    cout <<fixed<<setprecision(1)<<total<< endl;
  }
}