/*
 * This file is generated by jOOQ.
 */
package com.example.demo.jooq.generated.tables.records;


import com.example.demo.jooq.generated.tables.Coaster;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoasterRecord extends UpdatableRecordImpl<CoasterRecord> implements Record8<Integer, String, String, Integer, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = -316056425;

    /**
     * Setter for <code>public.coaster.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.coaster.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.coaster.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.coaster.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.coaster.opened</code>.
     */
    public void setOpened(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.coaster.opened</code>.
     */
    public String getOpened() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.coaster.design_id</code>.
     */
    public void setDesignId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.coaster.design_id</code>.
     */
    public Integer getDesignId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.coaster.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.coaster.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.coaster.status_id</code>.
     */
    public void setStatusId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.coaster.status_id</code>.
     */
    public Integer getStatusId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.coaster.typ_id</code>.
     */
    public void setTypId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.coaster.typ_id</code>.
     */
    public Integer getTypId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.coaster.opened_date</code>.
     */
    public void setOpenedDate(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.coaster.opened_date</code>.
     */
    public String getOpenedDate() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, String, Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Coaster.COASTER.ID;
    }

    @Override
    public Field<String> field2() {
        return Coaster.COASTER.NAME;
    }

    @Override
    public Field<String> field3() {
        return Coaster.COASTER.OPENED;
    }

    @Override
    public Field<Integer> field4() {
        return Coaster.COASTER.DESIGN_ID;
    }

    @Override
    public Field<Integer> field5() {
        return Coaster.COASTER.LOCATION_ID;
    }

    @Override
    public Field<Integer> field6() {
        return Coaster.COASTER.STATUS_ID;
    }

    @Override
    public Field<Integer> field7() {
        return Coaster.COASTER.TYP_ID;
    }

    @Override
    public Field<String> field8() {
        return Coaster.COASTER.OPENED_DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getOpened();
    }

    @Override
    public Integer component4() {
        return getDesignId();
    }

    @Override
    public Integer component5() {
        return getLocationId();
    }

    @Override
    public Integer component6() {
        return getStatusId();
    }

    @Override
    public Integer component7() {
        return getTypId();
    }

    @Override
    public String component8() {
        return getOpenedDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getOpened();
    }

    @Override
    public Integer value4() {
        return getDesignId();
    }

    @Override
    public Integer value5() {
        return getLocationId();
    }

    @Override
    public Integer value6() {
        return getStatusId();
    }

    @Override
    public Integer value7() {
        return getTypId();
    }

    @Override
    public String value8() {
        return getOpenedDate();
    }

    @Override
    public CoasterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CoasterRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CoasterRecord value3(String value) {
        setOpened(value);
        return this;
    }

    @Override
    public CoasterRecord value4(Integer value) {
        setDesignId(value);
        return this;
    }

    @Override
    public CoasterRecord value5(Integer value) {
        setLocationId(value);
        return this;
    }

    @Override
    public CoasterRecord value6(Integer value) {
        setStatusId(value);
        return this;
    }

    @Override
    public CoasterRecord value7(Integer value) {
        setTypId(value);
        return this;
    }

    @Override
    public CoasterRecord value8(String value) {
        setOpenedDate(value);
        return this;
    }

    @Override
    public CoasterRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoasterRecord
     */
    public CoasterRecord() {
        super(Coaster.COASTER);
    }

    /**
     * Create a detached, initialised CoasterRecord
     */
    public CoasterRecord(Integer id, String name, String opened, Integer designId, Integer locationId, Integer statusId, Integer typId, String openedDate) {
        super(Coaster.COASTER);

        set(0, id);
        set(1, name);
        set(2, opened);
        set(3, designId);
        set(4, locationId);
        set(5, statusId);
        set(6, typId);
        set(7, openedDate);
    }
}
