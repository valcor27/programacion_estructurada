import java.util.stream.IntStream;

public class EjemploDeclarativo {
   public static void main(String[] args) {
      // Usamos un Stream para generar los números del 1 al 5 y sumarlos de manera declarativa
      int sum = IntStream.rangeClosed(1, 5) // Genera un rango de números del 1 al 5
         .sum(); // Suma todos los números generados por el Stream

      // Imprimimos el resultado de la suma
      System.out.println("Suma: " + sum); // Resultado esperado: 15
      System.out.println("Suma: " + sum); // Resultado esperado: 15
   }
}
/*

public class EjemploDeclarativo {
   public static void main(String[] args) {
      // Sumamos los números del 1 al 10 usando un ciclo 'while' de manera más declarativa
      int sum = 0;
      int i = 1;

      // Usamos un ciclo while para sumar
      while (i <= 10) {
         sum += i; // Sumar el valor de 'i' a 'sum'
         i++; // Incrementamos 'i' después de cada ciclo
      }

      // Imprimir el resultado
      System.out.println("Suma de los números del 1 al 10: " + sum);
   }
}
En el paradigma declarativo, nos centramos en qué queremos lograr, y delegamos los detalles de la implementación a las bibliotecas o a las funcionalidades del lenguaje (como los streams en Java). */
