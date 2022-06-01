package repository;

import javax.persistence.EntityManager;

import entity.Mall;

public class IMallRepImpl implements IMallRep
{
	private EntityManager entityManager;
	public IMallRepImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall= entityManager.find(Mall.class,id);
		return mall;
	}
	@Override
	public Mall cancelMAll(int id) {
		Mall mall= entityManager.find(Mall.class,id);
		entityManager.remove(mall);
		return mall;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}
	
}

