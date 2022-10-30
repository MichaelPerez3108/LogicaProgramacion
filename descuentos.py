cantidad = float(input("Ingrese la cantidad que desea comprar: "))
costo = 800000
precio = cantidad * costo
porcentaje10 = (precio*10)/100
porcentaje20 = (precio*20)/100
porcentaje40 = (precio*40)/100
if cantidad < 5:
  total = precio - porcentaje10
  print("Por su compra de menos de 5 unidades su total con el 10% de descuento es de: $",total)
elif cantidad >= 5 and cantidad < 10:
  total = precio - porcentaje20
  print("Por su compra de mas de 5 unidades su total con el 20% de descuento es de: $",total)
elif cantidad >= 10:
  total = precio - porcentaje40
  print("Por su compra de mas de 10 unidades recibira un descuento del 40% su total es de: $",total)
else:
  print("Valor no admitido...")

  