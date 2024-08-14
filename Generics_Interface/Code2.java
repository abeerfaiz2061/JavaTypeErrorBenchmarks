interface Comparable<T> {
    public int compareTo(T o);
  }
  class Integer implements Comparable<T> {
    private final int value;
    public Integer(int value) { 
      this.value = value; 
    }
    public int compareTo(Integer i) {
      return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
    }
  }

  // Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2