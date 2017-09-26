package edu.cnm.deepdive.algorithms;

import sun.management.GcInfoCompositeData;

/**
 * Implements the classic Euclid algorithm for finding the GD of 2 integers. When run as a Java
 * application, the input values are read from the command line arguments.
 *
 * @author FeliciaUrioste
 */
public class Euclid {

  /*Format starting used for display of input values and GCD. */
  public static final String DISPLAY_FORMAT = "GCD(%,d, %,d) = %,d%n";

  /**
   * Reads 2 integer values from the command line and display their GCD, along with the original
   * input values.
   *
   * @param args intger input value
   */
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int gcd = gcd(a, b);
    System.out.printf(DISPLAY_FORMAT, a, b, gcd);


  }

  /**
   * Computes and returns the GCD of 2 intergers, using the classical form of modular division of
   * Euclid's algorithm.
   *
   * @param a first input
   * @param b second input
   * @return GCD of <code>a</code> and <code>b</code>
   */
  public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    int c = Math.max(a, b);
    b = Math.min(a, b);
    a = c;
    while (b > 0) {
      c = a % b;
      a = b;
      b = c;
    }
    return a;
  }
}