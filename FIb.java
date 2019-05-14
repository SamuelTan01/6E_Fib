public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */

    public static long fib_recurrence( int n) {
        //decision between base cases and recursive cases
        if (n== 0) return 0;     // instructions for
        else if (n==1) return 1; // base cases

        else{ //instructions for recursive cases
              return fib_recurrence(n-1) //recursive abstraction
                     +  // combining operator
                     fib_recurrence(n-2); //recursive abstraction
        }

    }


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int nMinusOne = 1;
        int nMinusTwo = 0;

        if(n == 0)return nMinusTwo;
        else if(n==1) return nMinusOne;
        int fibNum = 1;
        for(int i = 1
            ; i < n
            ; fibNum = nMinusOne + nMinusTwo
             ,nMinusTwo = nMinusOne
             ,nMinusOne = fibNum
             ,i++
              )
              ;
        return fibNum;
    }
    /* Time complexity:
       Consider the size of the problem to be n

       As the proxy for the time required, count the number of iterates

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because for each additional item, the JVM must iterate through the for loops once more.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = ( 1 + Math.sqrt(5))/2;
        double psi = ( 1 - Math.sqrt(5))/2;

        return ( Math.pow( phi, n) - Math.pow(psi, n))
                /
                Math.sqrt(5)
                ; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be n

       As the proxy for the time required, count the number of Math operations
     */

    public static void main(String[] commandLine){

        // to calculate which indexes fib_recurrence is feasible for
        // answer: [0,38)
        for(int i = 0; ; i++){
            System.out.println( "F_"
                              + i
                              +": "
                              + fib_recurrence(i)
                              );
        }
    }
}
