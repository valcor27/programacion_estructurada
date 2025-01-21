public class EjemploImperativo {
   public static void main(String[] args) {
      // Declaramos e inicializamos una variable 'sum' que guardará la suma total
      int sum = 0;

      // Iniciamos un ciclo 'for' que va desde 1 hasta 5
      for (int i = 1; i <= 5; i++) {
         // En cada iteración, sumamos el valor de 'i' a la variable 'sum'
         sum += i; // Esto es equivalente a 'sum = sum + i'
      }

      // Imprimimos el resultado final de la suma en la consola
      System.out.println("Suma: " + sum); // Resultado esperado: 15
   }
}
/*En el paradigma imperativo, especificamos explícitamente cómo se deben realizar las acciones paso a paso (por ejemplo, usando un ciclo for). */