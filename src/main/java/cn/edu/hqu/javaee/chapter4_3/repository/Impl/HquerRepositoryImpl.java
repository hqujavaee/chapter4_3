package cn.edu.hqu.javaee.chapter4_3.repository.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import cn.edu.hqu.javaee.chapter4_3.entity.Hquer;
import cn.edu.hqu.javaee.chapter4_3.repository.HquerRepository;

@Repository
@Transactional
public class HquerRepositoryImpl implements HquerRepository {
	@PersistenceContext
	private EntityManager em;
	@Override
	public void save(Hquer hquer) {
		em.persist(hquer);
	}

	@Override
	public Hquer findByUserName(String userName) {
		return em.find(Hquer.class, userName);
	}
}
