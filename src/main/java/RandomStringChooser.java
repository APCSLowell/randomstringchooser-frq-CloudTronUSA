import java.util.*;
public class RandomStringChooser {
  private String[] a;
  private int n;
  public RandomStringChooser(String[] arr){
    a = arr.clone();
    n = a.length;
  }
  public String getNext(){
      if(n==0) return "NONE";
      int i = (int)(Math.random()*n);
      String s = a[i];
      a[i] = a[--n];
      return s;
  }
}
