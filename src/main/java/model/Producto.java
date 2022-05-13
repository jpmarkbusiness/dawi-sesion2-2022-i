package model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@Table(name = "tb_productos")
public class Producto {

	@Id
	private String id_prod;

	private String des_prod;

	private int stk_prod;

	private double pre_prod;

	@ManyToOne
	@JoinColumn(name = "idcategoria", insertable = false, updatable = false)
	private Categoria categoria; // Sirve solo para listado JOIN

	private int idcategoria; // Sirve para grabar nuevo producto NO BORRAR

	private int est_prod;

	@ManyToOne
	@JoinColumn(name = "idprovedor", insertable = false, updatable = false)
	private Proveedor proveedor;

	private int idprovedor;

}