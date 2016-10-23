
package User;

import Designer.Dictionary;

public class StudentDataApp
{
  public static void main(String[] args)
  {
    int maxSize = 100;
    Dictionary d = new Dictionary(maxSize);

    Student anirut = new Student("0002", "Anirut");
    d.insert(anirut);

    Student somrak = new Student("0456", "Somrak");
    d.insert(somrak);

    Student pongsak = new Student("0383", "Pongsak");
    d.insert(pongsak);

    Student niwat = new Student("0139", "Niwat");
    d.insert(niwat);

    d.display();

    String searchID = "0383";
    Student foundStudent = (Student) d.find(searchID);
    if (foundStudent != null)
    {
      System.out.println("Found " + foundStudent);
    }
    else
      System.out.println("Can't find " + searchID);

    System.out.println("Delete 0383");
    d.delete("0383");

    d.display();
    
  }
}
