class Pair<T extends U, U extends T> {
    private final T first;
    private final U second;
    public Pair(T first, U second) { 
      this.first=first; this.second=second; 
    }
    public T getFirst() { 
      return first; 
    }
    public U getSecond() { 
      return second; 
    }
  }

  // Original Code Credits - https://github.com/amigoscode/java-generics