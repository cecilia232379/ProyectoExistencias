package com.inabif.component;

import org.springframework.stereotype.Component;

import com.inabif.entity.Bien;
import com.inabif.model.BienModel;



@Component("bienConverter")
public class BienConverter {
	
	public Bien convertBienModel2Bien(BienModel bienModel) {

		Bien bien = new Bien();
		bien.setIdbien(bienModel.getIdbien());
		bien.setIdpartida(bienModel.getIdpartida());
		bien.setDescripcion(bienModel.getDescripcion());
		bien.setCodigo(bienModel.getCodigo());
		bien.setUnidad(bienModel.getUnidad());
		bien.setTipo(bienModel.getTipo());
		bien.setPrecioprom(bienModel.getPrecioprom());
		bien.setEjercicio(bienModel.getEjercicio());
		
		//bien.setPartida((Partida) bienModel.getPartida());
	    return bien;
		
	} 
	
	
	public BienModel convertBien2BienModel(Bien bien) {
		BienModel bienModel = new BienModel();
		
		bienModel.setIdbien(bien.getIdbien());
		bienModel.setIdpartida(bien.getIdpartida());
		bienModel.setDescripcion(bien.getDescripcion());
		bienModel.setCodigo(bien.getCodigo());
		bienModel.setUnidad(bien.getUnidad());
		bienModel.setTipo(bien.getTipo());
		bienModel.setPrecioprom(bien.getPrecioprom());
		bienModel.setEjercicio(bien.getEjercicio());
		
		//bienModel.setPartida((Partida)bien.getPartida());
		return bienModel;	
	}
}
