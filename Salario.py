nombre = input("Ingrese su nombre: ")
salario = int(input("Ingrese su salario por hora: "))
horas = int(input("Ingrese sus horas trabajadas al mes: "))
salariomes = horas*salario

if (salariomes > 450000):
  print("Su nombre es",nombre.upper()," Y su salario mensual es: $",salariomes)
else:
  print(nombre)