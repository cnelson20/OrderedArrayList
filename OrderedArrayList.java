import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int initCapacity) {
    super(initCapacity);
  }
  public boolean add(T e) throws IllegalArgumentException {
    if (e == null) {throw new IllegalArgumentException("Illegal argument 'null'");}
    else {
      int i = 0;
      while (i < super.size() && e.compareTo(super.get(i)) > 0) {
        i++;
      }
      super.add(i,e);
      return true;
    }
  }
  public void add(int index,T e) throws IllegalArgumentException {
    this.add(e);
  }
  public T set(int index,T e) throws IllegalArgumentException {
    if (e == null) {throw new IllegalArgumentException("Illegal argument 'null'");}
    else {
      T s = super.get(index);
      super.remove(index);
      this.add(e);
      return s;
    }
  }
}
