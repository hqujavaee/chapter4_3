package cn.edu.hqu.javaee.chapter4_3.repository.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cn.edu.hqu.javaee.chapter4_3.entity.Hquer;
import cn.edu.hqu.javaee.chapter4_3.entity.Message;
import cn.edu.hqu.javaee.chapter4_3.repository.MessageRepository;

@Repository
@Transactional
public class MessageRepositoryImpl implements MessageRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Message> findMessageByUserName(String userName) {
		Hquer hquer=em.find(Hquer.class, userName);
		hquer.getMessageList().size();
		return hquer.getMessageList();
	}

	@Override
	public void save(Message message) {
		em.persist(message);
	}

}
