
public class HashTable{
  public static final int tableSize = 10;//tableSize cannot be changed
  public Pair<Integer, String>[] table;//Pair typed array
  public HashTable(){
    table = new Pair[tableSize];
  }

  public int getIndex(Integer key){
    int hashKey =0;
    hashKey = key % tableSize;
    return hashKey;
  }

  public void putPair(Integer key, String value){
    Pair curr = table[getIndex(key)];
    Pair newPair = new Pair(key, value);

    if(curr == null){
      table[getIndex(key)] = newPair;
    }
    else{
      while(curr.next != null){
        curr = curr.next;
      }
      curr.next = newPair;//insert the newPair to the end of the list
    }
  }

  public String getValue(Integer key){
    Pair curr = table[getIndex(key)];
    if (curr == null)
      return "";
    else{
      while(curr != null){
        if(curr.key.equals(key))
          return curr.value.toString();
        else
          curr = curr.next;
      }
    }
    return "";
  }

  public int numberOfPairsInList(int index){
    int counter =0;
    Pair curr = table[index];
    if(curr == null)
      return counter;
    else{
      while(curr!= null){
        counter ++;
        curr = curr.next;
      }

      return counter;
    }
  }

  public Pair deletePair(Integer key){
    Pair curr = table[getIndex(key)];
    if(curr == null)//no pair
      return null;
    else{//one or more pair
      Pair prev = null;
      while(curr != null){
        if(curr.key.equals(key)){
          Pair temp = curr;
          if(prev == null) //if key is the first pair
            table[getIndex(key)] = curr.next;
          else
            prev.next = curr.next;
          return temp;
          }
        else{
          prev = curr;
          curr = curr.next;
        }
    }
    return null;//did not find the pair
    }
  }

  public void printTable(){
    System.out.println("Index\tItems");
    for(int i=0; i<tableSize; i++){
      Pair curr = table[i];
      if(curr == null)
        System.out.print(i);
      else{
        System.out.print(i + "\t" + curr.key + " " + curr.value);
        while(curr.next != null){
          curr = curr.next;
          System.out.print(" -> " + curr.key + " " + curr.value);
        }
        // System.out.print("-> " + curr.key + " " + curr.value);
      }
      System.out.println("");
    }
  }
}