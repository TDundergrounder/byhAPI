package com.beyondh.model.order;

public class PagedResult<T>  {
    private int TotalPage;

    private int TotalRecord;

    private int PageSize;

    private int PageIndex;

    private T[] Data;

    public int getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage(int totalPage) {
        TotalPage = totalPage;
    }

    public int getTotalRecord() {
        return TotalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        TotalRecord = totalRecord;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int pageIndex) {
        PageIndex = pageIndex;
    }

    public T[] getData() {
        return Data;
    }

    public void setData(T[] data) {
        Data = data;
    }
}
