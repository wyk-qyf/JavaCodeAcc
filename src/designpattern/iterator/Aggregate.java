package designpattern.iterator;

/**
 * 聚集接口
 *
 * @param <T>
 * @author liu yuning
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();
}
