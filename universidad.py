print("Seleccione cual es el tipo de carrera que esta cursando: ")
print("1.Pregrado.")
print("2.Posgrado.")
desicion = int(input())
if desicion == 1:
    print("Eres estudiante de pregrado por favor ")
    nota1 = float(input("Digite su nota 1: "))
    nota2 = float(input("Digite su nota 2: "))
    nota3 = float(input("Digite su nota 3: "))
    promedio = (nota1+nota2+nota3)/3
    if promedio >= 4.5:
      print("Su promedio es de: ", promedio)
      print(promedio)
      print("Cursaras con 28 creditos y obtendras un 25% de descuento.")
      subtotal = 28*50000
      descuento = (subtotal*25)/100
      total = subtotal-descuento
      print("En total pagaras: ", total)
    else:
      if promedio >= 4.0 and promedio < 4.5:
        print("Su promedio es de: ", promedio)
        print("Cursaras con 25 creditos y obtendras un 10% de descuento.")
        subtotal = 25*50000
        descuento = (subtotal*10)/100
        total = subtotal-descuento
        print("En total pagaras: ", total)
      else:
        if promedio > 3.5 and promedio < 4.0:
          print("Cursaras con 20 creditos.")
          subtotal = 20*50000
          print("En total pagaras: ", subtotal)
        else:
          if promedio >= 2.5 and promedio < 3.5:
            print("Cursaras con 15 creditos.")
            subtotal = 15*50000
            print("En total pagaras: ", subtotal)
          else:
            if promedio < 2.5:
              print("Lo sentimos, no puedes matricularte en la universidad.")
else:              

  if desicion == 2:
        print("Eres estudiante de posgrado por favor ")
        nota1 = float(input("Digite su nota 1: "))
        nota2 = float(input("Digite su nota 2: "))
        nota3 = float(input("Digite su nota 3: "))
        promedio = (nota1+nota2+nota3)/3
        print("Su promedio es: ", promedio)
  if promedio >= 4.5:
        print("Cursaras con 20 creditos y obtendras un 20% de descuento.")
        subtotal = 20*300000
        descuento = (subtotal*20)/100
        total = subtotal-descuento
        print("En total pagaras: ", total)
  elif promedio < 4.5:
        print("Cursaras con 10 creditos")
        subtotal = 10*300000
        print("En total pagaras: ", subtotal)
  else:
    promedio < 2.5
    print("Lo sentimos, no puedes matricularte en la universidad.")
