
package Designer;


public class Dictionary implements DictionaryADT
{
  // using an unordered array to store
  // items in the dictionary
  private DictionaryItem[] a;
  private int nItems;

  // implementation of methods & constructors
  public Dictionary(int max)
  {
    a = new DictionaryItem[max];
    nItems = 0;
  }
  public DictionaryItem find(Object key)
  {
    for (int j=0; j<nItems; j++)
      if (a[j].compareTo(key) == 0)
        return a[j];
    return null;
  }
  /*
  public void insert(DictionaryItem item)
       throws DictionaryFullException
  {
    if (nItems == a.length)
      throw new DictionaryFullException("Dictionary is full.");
    a[nItems] = item;
    nItems++;
  }
 
  public boolean delete(Object key)
  {
    int j;
    for (j=0; j<nItems; j++)
      if (a[j].compareTo(key) == 0)
        break;
    if (j==nItems)
      return false;
    else
    {
      // item to be deleted is a[j]
      a[j] = a[nItems-1]; // move the last item to fill the gap
      nItems--;
      return true;
    }
  }
 */
  public void display()
  {
    for(int j=0; j<nItems; j++)
      System.out.println(a[j]);
  }  
  
  //Prob 1.1
  public Dictionary(){
      a = new DictionaryItem[100];
      nItems = 0;
  }
  
  //Prob 1.2
  public void insert(DictionaryItem item){
      DictionaryItem[] b;
      if(nItems == a.length){
          b = new DictionaryItem[a.length * 2];
          a = b;
      }
      a[nItems++] = item;
  }
  
  //Prob 1.3
  public boolean delete(Object key){
      int j;
      DictionaryItem[] b;
      for (j=0; j<nItems; j++)
        if (a[j].compareTo(key) == 0)
            break;
      
      a[j] = a[(nItems--)-1];
      
      if(nItems < (a.length / 4)){
          b = new DictionaryItem[a.length/2];
          for(int i=0; i<nItems;i++)
              b[i] = a[i];
          
          a = b;
      }
          
      return true;
  }
  
  //Prob2
  public DictionaryItem getMaxkey() {
      int max = 0;
      if(nItems == 0)
          return null;
      for(int i=1; i<nItems;i++){
          if(a[i].compareTo(a[max].getKey()) > 0)
              max = i;
      }
      return a[max];
  }

    //Prob3
    public boolean removeMaxKeyItem() {
        if(nItems == 0)
            return false;
        int max = 0;
        for(int i=1; i<nItems;i++){
          if(a[i].compareTo(a[max].getKey()) > 0)
              max = i;
        } 
        a[max] = a[(nItems--)- 1];
        return true;
    }
}
