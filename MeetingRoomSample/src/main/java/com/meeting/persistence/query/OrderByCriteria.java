package com.meeting.persistence.query;



public class OrderByCriteria {

    private String  columnName;

    private boolean isDesc;

    private OrderByCriteria(String columnName, boolean isDesc) {
        this.columnName = columnName;
        this.isDesc = isDesc;
    }

    public static OrderByCriteria asc(String columnName) {
        return new OrderByCriteria(columnName, false);
    }

    public static OrderByCriteria desc(String columnName) {
        return new OrderByCriteria(columnName, true);
    }

    public String getColumnName() {
        return columnName;
    }

    public boolean isDesc() {
        return isDesc;
    }
}
