package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Comparator;

// ⭐ Step2-2: 연도 역순 Iterator
public class BookShelfYearIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private Integer[] indices;
    private int current;

    public BookShelfYearIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        int size = bookShelf.getLength();
        this.indices = new Integer[size];

        for (int i = 0; i < size; i++) {
            indices[i] = i;
        }

        // ⭐ Step2-2: 연도 기준 내림차순 정렬
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return bookShelf.getBookAt(i2).getYear()
                     - bookShelf.getBookAt(i1).getYear();
            }
        });

        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < indices.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return bookShelf.getBookAt(indices[current++]);
    }
}