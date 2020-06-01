/*
 * This file is generated by jOOQ.
 */
package com.example.demo.jooq.generated.tables;


import com.example.demo.jooq.generated.Keys;
import com.example.demo.jooq.generated.Public;
import com.example.demo.jooq.generated.tables.records.CoasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class Coaster extends TableImpl<CoasterRecord> {

    private static final long serialVersionUID = 1893983968;

    /**
     * The reference instance of <code>public.coaster</code>
     */
    public static final Coaster COASTER = new Coaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoasterRecord> getRecordType() {
        return CoasterRecord.class;
    }

    /**
     * The column <code>public.coaster.id</code>.
     */
    public final TableField<CoasterRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.coaster.name</code>.
     */
    public final TableField<CoasterRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.coaster.opened</code>.
     */
    public final TableField<CoasterRecord, String> OPENED = createField(DSL.name("opened"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.coaster.design_id</code>.
     */
    public final TableField<CoasterRecord, Integer> DESIGN_ID = createField(DSL.name("design_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.coaster.location_id</code>.
     */
    public final TableField<CoasterRecord, Integer> LOCATION_ID = createField(DSL.name("location_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.coaster.status_id</code>.
     */
    public final TableField<CoasterRecord, Integer> STATUS_ID = createField(DSL.name("status_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.coaster.typ_id</code>.
     */
    public final TableField<CoasterRecord, Integer> TYP_ID = createField(DSL.name("typ_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.coaster.opened_date</code>.
     */
    public final TableField<CoasterRecord, String> OPENED_DATE = createField(DSL.name("opened_date"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.coaster</code> table reference
     */
    public Coaster() {
        this(DSL.name("coaster"), null);
    }

    /**
     * Create an aliased <code>public.coaster</code> table reference
     */
    public Coaster(String alias) {
        this(DSL.name(alias), COASTER);
    }

    /**
     * Create an aliased <code>public.coaster</code> table reference
     */
    public Coaster(Name alias) {
        this(alias, COASTER);
    }

    private Coaster(Name alias, Table<CoasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private Coaster(Name alias, Table<CoasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Coaster(Table<O> child, ForeignKey<O, CoasterRecord> key) {
        super(child, key, COASTER);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<CoasterRecord> getPrimaryKey() {
        return Keys.COASTER_PKEY;
    }

    @Override
    public List<UniqueKey<CoasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CoasterRecord>>asList(Keys.COASTER_PKEY);
    }

    @Override
    public List<ForeignKey<CoasterRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CoasterRecord, ?>>asList(Keys.COASTER__FK1Q6NXOU9SJXH312DOQ4TAR7ID, Keys.COASTER__FKJ3U6TV539DHS9SLEQHR4MNHI0, Keys.COASTER__FKL17SL3GK030X9WIKYO8A1EMH5, Keys.COASTER__FKDAFMKN0H2PY7CAB468JA02R2R);
    }

    public Design design() {
        return new Design(this, Keys.COASTER__FK1Q6NXOU9SJXH312DOQ4TAR7ID);
    }

    public Location location() {
        return new Location(this, Keys.COASTER__FKJ3U6TV539DHS9SLEQHR4MNHI0);
    }

    public Status status() {
        return new Status(this, Keys.COASTER__FKL17SL3GK030X9WIKYO8A1EMH5);
    }

    public Typ typ() {
        return new Typ(this, Keys.COASTER__FKDAFMKN0H2PY7CAB468JA02R2R);
    }

    @Override
    public Coaster as(String alias) {
        return new Coaster(DSL.name(alias), this);
    }

    @Override
    public Coaster as(Name alias) {
        return new Coaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Coaster rename(String name) {
        return new Coaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Coaster rename(Name name) {
        return new Coaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}