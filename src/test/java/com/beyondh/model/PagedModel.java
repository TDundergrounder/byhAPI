package com.beyondh.model;

import java.io.Serializable;

public class PagedModel<T> implements Serializable {
    public int PageCount ;
    public T[] Content;

    public int getPageCount() {
        return PageCount;
    }

    public void setPageCount(int pageCount) {
        PageCount = pageCount;
    }

    public T[] getContent() {
        return Content;
    }

    public void setContent(T[] content) {
        Content = content;
    }
}
