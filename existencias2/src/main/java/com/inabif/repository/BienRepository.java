package com.inabif.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inabif.entity.Bien;


@Repository("bienRepository")
public interface BienRepository extends JpaRepository<Bien,Serializable>{

	
	/*@Query(value="select * from TXBIEN t where t.EJERCICIO = :ano", 
	        nativeQuery=true)
	List<Bien> findBienesByYear(@Param("ano") int ano);*/
	
	
	/*public final static String QUERY_REGISTROS_BY_YEAR_2 = "SELECT b "
            + "FROM TXBIEN b INNER JOIN b.partida p "
            + "WHERE b.ejercicio = :ano";*/
	
	public final static String QUERY_REGISTROS_BY_YEAR_1 = "select * from TXBIEN b where b.EJERCICIO = :ano";
	
	public final static String QUERY_REGISTROS_BY_YEAR_2 = "SELECT * "
            + "FROM TXBIEN b LEFT JOIN TXPARTIDA p ON b.IDPARTIDA = p.PARTIDA "
            + "WHERE b.EJERCICIO = :ano";
	
	@Query(value=QUERY_REGISTROS_BY_YEAR_1,nativeQuery=true)	
	List<Bien> findBienesByYear(@Param("ano") int ano);
	
	public abstract Bien findByIdbien(int idbien);
	
	//public abstract Bien findByFerfechaferiado(Date fechaferiado);
	
}
