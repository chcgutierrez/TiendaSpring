package com.tienda.app.model;

import java.io.Serializable;
import java.util.Date;

public class TipoDocuModelo implements Serializable {

	private static final long serialVersionUID = -4269481260168583779L;
	
	private Integer idTipoDoc;
    private String tipoDoc;
    private String descTipdoc;
    private Boolean estado;
    private Date fechaCon;
    private String usuario;
    private String obser;
    
	public Integer getIdTipoDoc() {
		return idTipoDoc;
	}


	public void setIdTipoDoc(Integer idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}


	public String getTipoDoc() {
		return tipoDoc;
	}


	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}


	public String getDescTipdoc() {
		return descTipdoc;
	}


	public void setDescTipdoc(String descTipdoc) {
		this.descTipdoc = descTipdoc;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public Date getFechaCon() {
		return fechaCon;
	}


	public void setFechaCon(Date fechaCon) {
		this.fechaCon = fechaCon;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getObser() {
		return obser;
	}


	public void setObser(String obser) {
		this.obser = obser;
	}


	public TipoDocuModelo() {
		super();
	}

	public TipoDocuModelo(Integer idTipoDoc, String tipoDoc, String descTipdoc, Boolean estado, Date fechaCon,
			String usuario, String obser) {
		super();
		this.idTipoDoc = idTipoDoc;
		this.tipoDoc = tipoDoc;
		this.descTipdoc = descTipdoc;
		this.estado = estado;
		this.fechaCon = fechaCon;
		this.usuario = usuario;
		this.obser = obser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descTipdoc == null) ? 0 : descTipdoc.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaCon == null) ? 0 : fechaCon.hashCode());
		result = prime * result + ((idTipoDoc == null) ? 0 : idTipoDoc.hashCode());
		result = prime * result + ((obser == null) ? 0 : obser.hashCode());
		result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoDocuModelo other = (TipoDocuModelo) obj;
		if (descTipdoc == null) {
			if (other.descTipdoc != null)
				return false;
		} else if (!descTipdoc.equals(other.descTipdoc))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaCon == null) {
			if (other.fechaCon != null)
				return false;
		} else if (!fechaCon.equals(other.fechaCon))
			return false;
		if (idTipoDoc == null) {
			if (other.idTipoDoc != null)
				return false;
		} else if (!idTipoDoc.equals(other.idTipoDoc))
			return false;
		if (obser == null) {
			if (other.obser != null)
				return false;
		} else if (!obser.equals(other.obser))
			return false;
		if (tipoDoc == null) {
			if (other.tipoDoc != null)
				return false;
		} else if (!tipoDoc.equals(other.tipoDoc))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoDocuModelo [idTipoDoc=" + idTipoDoc + ", tipoDoc=" + tipoDoc + ", descTipdoc=" + descTipdoc
				+ ", estado=" + estado + ", fechaCon=" + fechaCon + ", usuario=" + usuario + ", obser=" + obser + "]";
	}

    
}
