interface Printable { void print(); }
interface Showable { void show(); }

class Document implements Printable, Showable {
    public void print() { System.out.println("Printing document in B&W..."); }
    public void show()  { System.out.println("Displaying document on screen..."); }
}

public class Interfaces {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d.show();
    }
}
