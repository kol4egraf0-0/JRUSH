import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class zd78 implements List<Long>{
    private ArrayList<Long> original = new ArrayList<>();
    /* 
    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized boolean add(Object o) {
        return original.add((Long) o);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return original.add((Long) o);
    }

    @Override
    public synchronized boolean addAll(Collection c) {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Object element) {
        return original.set(index, (Long) element);
    }

    @Override
    public synchronized void add(int index, Object element) {
        original.set(index, (Long) element);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf((Long) o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf((Long) o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
    }

    @Override
    public synchronized boolean retainAll(Collection c) {
        return original.retainAll(c);
    }

    @Override
    public synchronized boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public synchronized Long[] toArray(Object[] a) {
        return original.toArray((Long[]) a);
    }
        */
        @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }


    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return original.toArray(a);
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return original.containsAll(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        return original.addAll(index, c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return original.retainAll(c);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index, element);
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(index, element);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
    }
    public static void main(String[] args) {

    }
}

