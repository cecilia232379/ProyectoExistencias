package com.inabif.component;

import org.springframework.stereotype.Component;

import com.inabif.entity.Bien;
import com.inabif.model.BienModel;



@Component("bienConverter")
public class BienConverter {
	
	public Bien convertBienModel2Bien(BienModel bienModel) {

		Bien bien = new Bien();
		bien.setIdBien(bienModel.getIdBien());
		bien.setPartida(bienModel.getPartida());
		bien.setMedida(bienModel.getMedida());
		bien.setTipobien(bienModel.getTipobien());
		bien.setDescripcion(bienModel.getDescripcion());
		bien.setCodigo(bienModel.getCodigo());
		bien.setPrecioProm(bienModel.getPrecioProm());
		bien.setEjercicio(bienModel.getEjercicio());
		bien.setFechaCreacion(bienModel.getFechaCreacion());
		bien.setHoraCreacion(bienModel.getHoraCreacion());
		bien.setFechaModificacion(bienModel.getFechaModificacion());
		bien.setHoraModificacion(bienModel.getHoraModificacion());
		bien.setUsuario(bienModel.getUsuario());
		
	    return bien;
		
	} 
	
	
	public BienModel convertBien2BienModel(Bien bien) {
		BienModel bienModel = new BienModel();
		
		bienModel.setIdBien(bien.getIdBien());
		bienModel.setPartida(bien.getPartida());
		bienModel.setMedida(bien.getMedida());
		bienModel.setTipobien(bien.getTipobien());
		bienModel.setDescripcion(bien.getDescripcion());
		bienModel.setCodigo(bien.getCodigo());
		bienModel.setPrecioProm(bien.getPrecioProm());
		bienModel.setEjercicio(bien.getEjercicio());
		bienModel.setFechaCreacion(bien.getFechaCreacion());
		bienModel.setHoraCreacion(bien.getHoraCreacion());
		bienModel.setFechaModificacion(bien.getFechaModificacion());
		bienModel.setHoraModificacion(bien.getHoraModificacion());
		bienModel.setUsuario(bien.getUsuario());
		
		return bienModel;	
	}
}
