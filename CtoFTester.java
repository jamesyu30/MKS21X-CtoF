//the parameters are celsius and fahrenheit. They should both be doubles and should return either celsius or fahrenheit.

public class demo{
      public static void main(String[] args){

        System.out.println(" ");
        System.out.println(celsiusToFahrenheit (100));

        System.out.println(" ");
        System.out.println(FahrenheitToCelsius (212));


      }

public static double celsiusToFahrenheit (double c){
  return ((9 * c) / 5 + 32);
}

public static double FahrenheitToCelsius (double f){
  return ((5 * f) / 9 - 32);
}
}
