
package net.workingdev.DebugSample;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class DebugSample {
    public static void main(String[] args) throws IOException {
        List sampleNames = createNames();
        printNames(sampleNames);
        addName(sampleNames, "Jane Doe");
        printNames(sampleNames);
    }
    private static List createNames() {
        ArrayList listNames = new ArrayList<String>();
        listNames.add("Jane Doe");
        listNames.add("Madiha");
        return listNames;
    }
    private static void printNames(List<String>
                                           names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static void addName(List<String> l, String name) {
        l.add(name);
    }
    private static void removeNames(List l, String name) {
        int position = l.indexOf(name);
        if (position == -1) {
            // the name is not in the list
        }
        else {
            l.remove(position);
            printNames(l);
        }
    }
}

