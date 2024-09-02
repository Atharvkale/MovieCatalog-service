package com.wu.movie.MovieCatalogService.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.wu.movie.MovieCatalogService.entity.MovieCatalog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MovieDAOImpl implements MovieDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	public MovieDAOImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}
	
	@Override
	public ArrayList<MovieCatalog> getMovieCatalogItem()
	{
		Session session = entityManager.unwrap(Session.class);
		Query theQuery = session.createQuery("from MovieCatalog", MovieCatalog.class);
		ArrayList<MovieCatalog> mci = (ArrayList<MovieCatalog>) theQuery.getResultList();
		return mci;
	}
}
