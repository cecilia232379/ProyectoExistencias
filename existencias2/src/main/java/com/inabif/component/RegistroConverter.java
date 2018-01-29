package com.inabif.component;

import org.springframework.stereotype.Component;

import com.inabif.entity.Registro;
import com.inabif.model.RegistroModel;

@Component("registroConverter")
public class RegistroConverter {
	
	public Registro convertRegistroModel2Registro(RegistroModel registroModel) {
		Registro registro = new Registro();
		registro.setIdbien(registroModel.getIdbien());
		registro.setCantidad(registroModel.getCantidad());
		registro.setPrecio(registroModel.getPrecio());
		registro.setProcedencia(registroModel.getProcedencia());
		registro.setFechaprocedencia(registroModel.getFechaprocedencia());
		registro.setEjercicio(registroModel.getEjercicio());
		registro.setDependencia(registroModel.getDependencia());
		registro.setIdregistro(registroModel.getIdregistro());
		registro.setResolucion(registroModel.getResolucion());
		
		registro.setItem(registroModel.getItem());
		registro.setPartida(registroModel.getPartida());
		registro.setTipo(registroModel.getTipo());
		registro.setDescripcion(registroModel.getDescripcion());
		registro.setUnidad(registroModel.getUnidad());
		registro.setImporte(registroModel.getImporte());
		
	    return registro;
		
	} 
	
	
	public RegistroModel convertRegistro2RegistroModel(Registro registro) {
		RegistroModel registroModel = new RegistroModel();		
		registroModel.setIdbien(registro.getIdbien());
		registroModel.setResolucion(registro.getResolucion());
		
		registroModel.setItem(registro.getItem());
		registroModel.setPartida(registro.getPartida());
		registroModel.setIdregistro(registro.getIdregistro());		
		registroModel.setTipo(registro.getTipo());
		registroModel.setDescripcion(registro.getDescripcion());
		registroModel.setUnidad(registro.getUnidad());
		registroModel.setCantidad(registro.getCantidad());
		registroModel.setPrecio(registro.getPrecio());
		registroModel.setImporte(registro.getImporte());
		registroModel.setProcedencia(registro.getProcedencia());
		registroModel.setFechaprocedencia(registro.getFechaprocedencia());
		registroModel.setEjercicio(registro.getEjercicio());
		registroModel.setDependencia(registro.getDependencia());
		return registroModel;	
	}
}
