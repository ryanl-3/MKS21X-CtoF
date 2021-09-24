public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(2.0));
    System.out.println(fahrenheitToCelsius(2.0));

  }

  public static double celsiusToFahrenheit(double c){
    return (c * (9.0 / 5.0)) + 32.0;
  }

  public static double fahrenheitToCelsius(double f){
    return (f - 32.0) * (5.0 / 9.0);
  }
}
