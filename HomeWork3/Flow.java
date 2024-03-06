package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;

public class Flow implements Iterable<Group>{
    private ArrayList<Group> groups;
    
    public Flow(ArrayList<Group> groups){
        this.groups = groups;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}
