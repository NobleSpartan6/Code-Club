// Ebenezer Eshetu
// Code Club 2019

class Fibonacci {
  public static int sizeOfSequence = 20;

  // main function will doesn't need to be called, it runs on its own
  public static void main(String[] args) {
    // repeatx for every number you print
    for (int i = 0; i < sizeOfSequence; i++) {
      // print the fibonacci number at position i
      System.out.println(getFib(i));
    }
  }

  public static int getFib(int n) {
    // the first element of the sequence is given as 0
    if (n == 0) {
      return 0;
    }

    // the second element of the sequence is given as 1
    if (n == 1) {
      return 1;
    }

    // if it is not a given element of the sequence, do this
    else {
      // use recursion to cycle through every number in the sequence
      // every time this return command runs
      //the whole fibonacci sequence from element 1 to n are created
      return getFib(n - 1) + getFib(n - 2);
    }
  }

}





//version two 

   public class Fibonacci {
      public static int sizeOfSequence = 20;
      public static void main(String[] args) {

        for (int i = 0; i < sizeOfSequence; i++) {
          System.out.println(getFib(i));
        }
      }
      public static int getFib(int n) {
        // get a number at position n in the sequence here
          int[] array = new int[sizeOfSequence];
            array[1] = 1;
             array[2] = 1;

          for (int i =3; i<sizeOfSequence; i++)
          {
            array[i] = array[i-1] + array[i-2];
          }
       return array[n];
      }

    }
