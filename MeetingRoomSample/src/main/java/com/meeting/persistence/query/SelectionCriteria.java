package com.meeting.persistence.query;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SelectionCriteria {


    protected int                   offset                 = 0;

    protected int                   limit                  = 10;

    protected List<OrderByCriteria> defaultOrderByCriteria = new ArrayList<OrderByCriteria>();

    private List<OrderByCriteria>   orderByCriteriaList    = new ArrayList<OrderByCriteria>();

    public SelectionCriteria() {

    }

    public SelectionCriteria(SelectionCriteria sc) {
        this.offset = sc.offset;
        this.limit = sc.limit;
        Collections.copy(this.defaultOrderByCriteria, sc.defaultOrderByCriteria);
        Collections.copy(this.orderByCriteriaList, sc.orderByCriteriaList);
    }

    public SelectionCriteria(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void addOrderByCriteria(OrderByCriteria orderByCriteria) {
        this.orderByCriteriaList.add(orderByCriteria);
    }

    public List<OrderByCriteria> getOrderByCriteriaList() {
        return orderByCriteriaList.isEmpty() ? defaultOrderByCriteria : orderByCriteriaList;
    }



}
