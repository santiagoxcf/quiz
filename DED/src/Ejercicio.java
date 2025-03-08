public class Ejercicio {
    public static void main(String[] args) {
        
        
n = int(input("Introduce un número entero positivo: "))


for k in range(1, n + 1):
    linea = []
    for i in range(k):
        # Alternar entre número positivo y negativo
        if i % 2 == 0:
            linea.append(k)
        else:
            linea.append(-k)
    
    # Imprimir la línea correspondiente
    print(" ".join(map(str, linea)))


    


    }
}
