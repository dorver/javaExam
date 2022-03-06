import java.util.*;

public class MyProtectedUniqueList<T> implements Iterable<T> {
    private List<T> words = new ArrayList<>();
    private String secretWord;

    public MyProtectedUniqueList(List<T> words, String secretWord) {
        this.words = words;
        this.secretWord = secretWord;
    }

    public void add(T s) throws Exception {
        if(s.equals("") || s.equals(null)){
            throw new Exception("The word is empty or null");
        }
        if(!this.words.contains(s)){
            words.add(s);
        }
    }

    public void remove(T s) throws Exception {
        if(s.equals("") || s.equals(null)){
            throw new Exception("The word is empty or null");
        }
        if(words.contains(s)){
            words.remove(s);
        }
    }

    public void removeAt(int index) throws Exception {
        if(index < 0 || index > words.size()){
            throw new Exception("Index is less than 0 or greater than list's size");
        }
        removeAt(index);
    }

    public void clear(String s){
        if(s.equals(secretWord)){
            words.clear();
        }
    }

    public void sort(String s){
        if(s.equals(secretWord)){
            Collections.sort(words,new ElementComparator());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T>{
        private MyProtectedUniqueList<T> list ;
        private  int index=0;

        public GenericListIterator(MyProtectedUniqueList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            if (index<list.words.size()){
                return true;
            }
            return false;
        }

        @Override
        public T next() {

            return list.words.get(index++);
        }
    }
    static class ElementComparator <T extends Comparable<T>> implements Comparator <T> {

        @Override
        public int compare(T o1, T o2) {
            return o2.compareTo(o1);
        }
    };
}
