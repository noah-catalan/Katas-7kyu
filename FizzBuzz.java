public class FizzBuzz{
    public static int[] solution(int number) {
      
      int contador = 1;
      int contadorA = 0;
      int contadorB = 0;
      int contadorC = 0;
      
      
      while (contador < number) {
        if (contador % 3 == 0 && contador % 5 == 0) {
          contadorC++;
        } else if (contador % 3==0) {
          contadorA++;
        } else if (contador % 5==0) {
          contadorB++;
        } else {
          
        }
        contador++;
      }
      
      int[] FizzBuzzArray = {contadorA, contadorB, contadorC};
      return FizzBuzzArray;
      
    }
}
