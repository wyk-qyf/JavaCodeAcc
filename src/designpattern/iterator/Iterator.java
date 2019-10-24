package designpattern.iterator;

/**
 * 迭代器接口
 *
 * @param <T>
 * @author liu yuning
 */
public interface Iterator<T> {

    T first();

    T next();

    boolean isDone();

    T currentItem();

}
