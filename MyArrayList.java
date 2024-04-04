public class MyArrayList implements MyList{
  int cap=4;
  int size=0;
  int [] arr = new int [cap];

  @Override
  public boolean add(int x){
    arr[size++]=x;
    return 0;
  }

  public int size(){
    return size;
  }
}
