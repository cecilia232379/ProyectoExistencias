package com.inabif.repository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inabif.entity.Bien;
import com.inabif.entity.Registro;



@Repository("registroRepository")
public interface RegistroRepository extends JpaRepository<Registro,Serializable>{

	Session session = null;
	
	public static final String QUERY_REGISTROS_BY_YEAR_0="select * from TXREGISTRO t where t.DEPENDENCIA = :idDependencia AND t.EJERCICIO = :ano";
	
	public static final String QUERY_REGISTROS_BY_YEAR_1="SELECT ROW_NUMBER() OVER (ORDER BY B.DESCRIPCION ASC) AS ITEM, "
			+ "B.IDPARTIDA AS PARTIDA,IDREGISTRO,B.TIPO,B.DESCRIPCION,B.UNIDAD,CANTIDAD,TO_CHAR(PRECIO,'99990.99') PRECIO,TO_CHAR(CANTIDAD * PRECIO,'99990.99') AS IMPORTE, "
			+ "DECODE(PROCEDENCIA,1,'PECOSA-SEDE CENTRAL',2,'COMPRA',3,'DONACION')||'-'||RESOLUCION PROCEDENCIA,TO_CHAR(FECHAPROCEDENCIA,'DD/MM/YY') AS FECHAPROCEDENCIA, "
			+ "R.EJERCICIO, DEPENDENCIA FROM TXREGISTRO R "
			+ "INNER JOIN TXBIEN B ON R.IDBIEN = B.IDBIEN LEFT JOIN TXPARTIDA P "
			+ "ON P.PARTIDA = B.IDPARTIDA "
			+ "WHERE B.EJERCICIO = :ano AND DEPENDENCIA = :idDependencia AND R.EJERCICIO =  :ano "
			+ "ORDER BY DESCRIPCION ASC";

	/*@Query(value=QUERY_REGISTROS_BY_YEAR_1,nativeQuery=true)
	List<Registro> findRegistrosByYear(@Param("ano") int ano, @Param("idDependencia") int idDependencia);*/
	
	
	public final static String QUERY_REGISTROS_BY_YEAR_2 = "SELECT * "
            + "FROM TXBIEN b LEFT JOIN TXPARTIDA p ON b.idpartida = p.partida "
            + "WHERE b.ejercicio = :ano";
	
	@Query(value=QUERY_REGISTROS_BY_YEAR_2,nativeQuery=true)	
	public static List <Bien> findRegistrosByYear(@Param("ano") int ano) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public static  List<Registro> findRegistrosByYear( int ano, int idDependencia){
		List<Registro> ListRegistro= null;
		Object object;
		
		
		/*List l = em.createQuery(
		        "SELECT DISTINCT p FROM Department d JOIN d.employees e JOIN e.projects p")
		        .getResultList();
		    for (Object p : l) {
		      printResult(p);
		    }*/
		
		/*Criteria criteria = session.createCriteria(Registro.class);
		criteria.setFetchMode("TXBIEN", FetchMode.JOIN);
		List list = criteria.list();
		
		Iterator itr = list.iterator();
		System.out.println("\n");
		System.out.println("Student Details :- \n");
		if (list.size() == 0) {
			System.out.println("No Result Found !");
		}
		
		while (itr.hasNext()) {
			object = (Object) itr.next();
			System.out.printf("\t");
			System.out.println("First Name : "+ ((Registro) object).getDescripcion());
		}*/
	    
		//return ListRegistro;
	//}*/
	
	public abstract Registro findByIdbien(int idbien);
	
	//public abstract Bien findByFerfechaferiado(Date fechaferiado);
	
}
