package com.tienda.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.tienda.app.model.TipoDocuModelo;
import com.tienda.app.procedure.TipoDocProcedure;

@Repository
public class TipoDocDao {

	@Autowired
	JdbcTemplate dbTemplate;

	/**
	 * AdministrationRowMapper that works as a rowMaper to get all information
	 * related.
	 */
	class TipoDocRowMapper implements RowMapper<TipoDocuModelo> {

		@Override
		public TipoDocuModelo mapRow(ResultSet oRes, int numFila) throws SQLException {

			final TipoDocuModelo oTipoDocum = new TipoDocuModelo();
			oTipoDocum.setIdTipoDoc(oRes.getInt(TipoDocProcedure.idTipoDoc));
			oTipoDocum.setTipoDoc(oRes.getString(TipoDocProcedure.tipoDoc));
			oTipoDocum.setDescTipdoc(oRes.getString(TipoDocProcedure.descTipdoc));
			oTipoDocum.setEstado(oRes.getBoolean(TipoDocProcedure.estado));
			oTipoDocum.setFechaCon(oRes.getDate(TipoDocProcedure.fechaCon));
			oTipoDocum.setUsuario(oRes.getString(TipoDocProcedure.usuario));
			oTipoDocum.setObser(oRes.getString(TipoDocProcedure.obser));
			return oTipoDocum;
		}
	}

	public TipoDocuModelo TraerTipoDoc(String TipoDoc) {

		SimpleJdbcCall oDbCall = new SimpleJdbcCall(dbTemplate)
				.withProcedureName(TipoDocProcedure.SP_TRAER_TIPODOC)
				.returningResultSet("TraerTipoDoc", new TipoDocRowMapper());

		SqlParameterSource oParametros = new MapSqlParameterSource()
				.addValue(TipoDocProcedure.tipoDoc, TipoDoc);

		Map<String, Object> out = oDbCall.execute(oParametros);
		return (TipoDocuModelo) out.get("TraerTipoDoc");

	}

	public List<TipoDocuModelo> MostrarTodos() {

		SimpleJdbcCall oDbCall = new SimpleJdbcCall(dbTemplate).withProcedureName(TipoDocProcedure.SP_MOSTRAR_TIPODOC)
				.returningResultSet("MostrarTodos", new TipoDocRowMapper());

		Map<String, Object> out = oDbCall.execute();
		return (List<TipoDocuModelo>) out.get("MostrarTodos");

	}
}
