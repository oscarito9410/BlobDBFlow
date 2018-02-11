package com.cetech.cardview;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.data.Blob;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.Date;

/**
 * Created by oemy9 on 10/02/2018.
 */
@Table(database = MyDataBase.class)
public class NotaTable extends BaseModel {
    @Column
    @PrimaryKey(autoincrement = true)
    int id;
    @Column
    private String titulo;
    @Column
    private Date fecha;

    @Column
    private Blob imagen;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha () {
        return fecha;
    }

    public void setFecha (Date fecha) {
        this.fecha = fecha;
    }

    public Blob getImagen () {
        return imagen;
    }

    public void setImagen (Blob imagen) {
        this.imagen = imagen;
    }
}
