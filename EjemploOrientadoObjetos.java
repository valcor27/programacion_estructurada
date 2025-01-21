// Clase principal para representar el cálculo de la suma de los números
public class EjemploOrientadoObjetos {
   // Clase interna para representar una serie de números
   static class NumberSeries {
      private int start; // Número inicial
      private int end;   // Número final
      // Constructor que recibe el número inicial y final
      public NumberSeries(int start, int end) {
         this.start = start;
         this.end = end;
      }
      // Método para generar los números entre start y end
      public int[] generateNumbers() {
         int[] numbers = new int[end - start + 1]; // Creamos un array para los números
         for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i; // Asignamos los números en el array
         }
         return numbers;
      }
      // Método para sumar los números generados
      public int sumNumbers(int[] numbers) {
         int sum = 0;
         for (int number : numbers) {
            sum += number; // Sumamos los números en el array
         }
         return sum;
      }
   }
   public static void main(String[] args) {
      // Creamos una instancia de NumberSeries con un rango de 1 a 5
      NumberSeries series = new NumberSeries(1, 5);
      // Generamos los números del 1 al 5
      int[] numbers = series.generateNumbers();
      // Sumamos los números generados
      int sum = series.sumNumbers(numbers);
      // Imprimimos el resultado de la suma
      System.out.println("Suma: " + sum); // Resultado esperado: 15
   }
}
