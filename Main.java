import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static LinkedList linkedList = new LinkedList();
    static List list = new List();

    public static void main(String[] args) throws IOException {
        fillList();
        createList();
    }

    static void createList() {
        String line;
        LinkedList tempList = linkedList;
        while(!(line = tempList.searchNumber()).equals("")) {
            list.add(line);
        }
        list.show();
    }

    static void fillList() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:/Siaod1.4/src/data.txt"));
        String line;
        while((line = bf.readLine()) != null) {
            linkedList.add(line);
        }
    }
}

