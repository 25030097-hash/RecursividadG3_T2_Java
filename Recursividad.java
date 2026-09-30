package recursividad;
public class Recursividad {
public static int factorial(int n) {
if (n <= 1)
return 1;
return n * factorial(n - 1);
}
public static int fibonacci(int n) {
if (n <= 1)
return n;
return fibonacci(n - 1) + fibonacci(n - 2);
}
public static int sumaNaturales(int n) {
if (n == 0)
return 0;
return n + sumaNaturales(n - 1);
}
public static void main(String[] args) {
System.out.println("Factorial de 5: " + factorial(5));
System.out.println("Fibonacci de 6: " + fibonacci(6));
System.out.println("Suma hasta 5: " + sumaNaturales(5));
}
}
