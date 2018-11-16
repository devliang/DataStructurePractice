public class Pair<K,V>{
  K key;
  V value;
  Pair<K,V> next;

  public Pair(K k, V v){
    key = k;
    value = v;
    next = null;
  }
}