/**
*
* @author Jiewei Jiang
*/
public class NewClass {

  public static int getLarget(int arr[], int sz) {
    int iterate1 = 0;
    int iterate2 = 0;
    int largest = 0;
    while (iterate1 < sz - 1) { //The outer loop  runs "sz - 1" times
      iterate2++;
      if (iterate2 == sz) { //inner loop runs "sz - interate1 -1" times on average for each iteration of the outer loop
        iterate1++;
        iterate2 = iterate1;
        continue;
      }

      /*
       * set "x" be the size of array 'arr'
       * then outer loop runs sz-1, which is O(n)
       * then inner loop runs (n-1) + (n+2) + ... +1 times, which sums up to n * n / 2
       * therefore the time of algorithm is O(n * n)
       */
      int product = arr[iterate1] * arr[iterate2];
      if (product > largest)
        largest = product;
    }

    /*
     * Label the bag from 1 to 20,
     * take one M&M from bag 1, two from 2...., weight all these M&M together on the scale
     * total weight should be 1+2+3...+20 = 210
     * if total more than 210 it means that bag with 1.1 contributed to the extra weight
     * difference between the total weight and 210 grams will tell which bag has the heavier M&Ms
     */
    return largest;
  }
}
