package com.linked.list;

import java.util.Iterator;

public interface ILinkedList<E> extends Iterable{

    //public abstract Iterator<E> iterator();

    public abstract void add(E element);
    public abstract void add(int index, E element);
    public abstract void clear();
    public abstract E get(int index);
    public int indexOf(E element);
    public E remove(int index);
    public E set(int index, E element);
    public int size();
    public E[] toArray();
    public String toString();
}
