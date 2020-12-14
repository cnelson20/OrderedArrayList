import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int initCapacity) {
    super(initCapacity);
  }
  public boolean add(T e) throws IllegalArgumentException {
    if (e == null) {throw new IllegalArgumentException("Illegal argument 'null'");}
    else {
      return super.add(e);
    }
  }
  public void add(int index,T e) throws IllegalArgumentException {
    if (e == null) {throw new IllegalArgumentException("Illegal argument 'null'");}
    else {
      super.add(index,e);
    }
  }
  public T set(int index,T e) throws IllegalArgumentException {
    if (e == null) {throw new IllegalArgumentException("Illegal argument 'null'");}
    else {
      return super.set(index,e);
    }
  }
}
