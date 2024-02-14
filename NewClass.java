/**
*
* @author Jiewei Jiang
*/
public class NewClass {

  public static int getLarget(int arr[], int sz) {
    int iterate1 = 0;
    int iterate2 = 0;
    int largest = 0;
    while (iterate1 < sz -1) {}
      iterate2++;
      if(iterate2 == sz){
        iterate1++;
        iterate2 = iterate1;
        continue;
      }
      int product = arr[iterate1] * arr[iterate2];
      if (product > largest)
        largest = product;
  }
  return largest;
}
