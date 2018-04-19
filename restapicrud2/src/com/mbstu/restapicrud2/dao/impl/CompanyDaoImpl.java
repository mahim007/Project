package com.mbstu.restapicrud2.dao.impl;

import com.mbstu.restapicrud2.dao.CompanyDao;
import com.mbstu.restapicrud2.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("CompanyDao")
@Transactional
public class CompanyDaoImpl implements CompanyDao {
    @Autowired
    SessionFactory sessionFactory;
//    @PersistenceContext(unitName = "entityManager") private EntityManager entityManager;

    protected final Session getCurrentSession(){
    return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void saveOrUpdateCompany(Company company) throws Exception{
        Session session = this.getCurrentSession();
        session.saveOrUpdate(company);
    }

    @Override
    public void deleteCompany(Long companyId) throws Exception{
        Session session = this.getCurrentSession();
        org.hibernate.Query query;
        query =  session.createQuery("DELETE Company c WHERE c.id = :companyId");//: thakle parameter pass hoy
        query.setParameter("companyId", companyId);
        query.executeUpdate();

    }

    @Override
    public List<Company> getCompanyList(Long companyId) throws Exception{
        Session session = this.getCurrentSession();
        org.hibernate.Query query;
        if(companyId != null && companyId > 0){
            query = session.createQuery("FROM Company c WHERE c.id = :companyId");
            query.setParameter("companyId", companyId);
        } else {
            query = session.createQuery("FROM  Company");
        }
        List<Company> companyList = query.list();
       return companyList;
    }

}