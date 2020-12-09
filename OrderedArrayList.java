import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int initCapacity) {
    super(initCapacity);
  }
  public boolean add(T e) {
    int i = 0;
    while (i < super.size() && e.compareTo(super.get(i)) > 0) {
      i++;
    }
    super.add(i,e);
    return true;
  }
  public void add(int index,T e) {
    this.add(e);
  }
  public T set(int index,T e) {
    super.remove(index);
    this.add(e);
    return e;
  }
}
