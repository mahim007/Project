package com.mbstu.restapicrud2.dao;

//import com.dsinv.restApiCrud.model.Company;

import com.mbstu.restapicrud2.model.Company;

import java.util.List;

public interface CompanyDao {

    void saveOrUpdateCompany(Company company) throws Exception;
    void deleteCompany(Long companyId) throws Exception;
    List<Company> getCompanyList(Long companyId) throws Exception;
}
