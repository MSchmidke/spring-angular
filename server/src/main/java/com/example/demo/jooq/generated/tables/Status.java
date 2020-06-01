/*
 * This file is generated by jOOQ.
 */
package com.example.demo.jooq.generated.tables;


import com.example.demo.jooq.generated.Keys;
import com.example.demo.jooq.generated.Public;
import com.example.demo.jooq.generated.tables.records.StatusRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Status extends TableImpl<StatusRecord> {

    private static final long serialVersionUID = -509702911;

    /**
     * The reference instance of <code>public.status</code>
     */
    public static final Status STATUS = new Status();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatusRecord> getRecordType() {
        return StatusRecord.class;
    }

    /**
     * The column <code>public.status.id</code>.
     */
    public final TableField<StatusRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.status.name</code>.
     */
    public final TableField<StatusRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.status</code> table reference
     */
    public Status() {
        this(DSL.name("status"), null);
    }

    /**
     * Create an aliased <code>public.status</code> table reference
     */
    public Status(String alias) {
        this(DSL.name(alias), STATUS);
    }

    /**
     * Create an aliased <code>public.status</code> table reference
     */
    public Status(Name alias) {
        this(alias, STATUS);
    }

    private Status(Name alias, Table<StatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private Status(Name alias, Table<StatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Status(Table<O> child, ForeignKey<O, StatusRecord> key) {
        super(child, key, STATUS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<StatusRecord> getPrimaryKey() {
        return Keys.STATUS_PKEY;
    }

    @Override
    public List<UniqueKey<StatusRecord>> getKeys() {
        return Arrays.<UniqueKey<StatusRecord>>asList(Keys.STATUS_PKEY);
    }

    @Override
    public Status as(String alias) {
        return new Status(DSL.name(alias), this);
    }

    @Override
    public Status as(Name alias) {
        return new Status(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Status rename(String name) {
        return new Status(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Status rename(Name name) {
        return new Status(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
