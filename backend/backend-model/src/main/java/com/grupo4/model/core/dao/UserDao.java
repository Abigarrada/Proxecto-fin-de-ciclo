package com.grupo4.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "UserDao")
@ConfigurationFile(
	configurationFile = "dao/UserDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class UserDao extends OntimizeJdbcDaoSupport {

    public static final String USER_ID = "USER_ID";
    public static final String USER_ = "USER_";
    public static final String PASSWORD = "PASSWORD";
    public static final String NAME = "NAME";
    public static final String SURNAME = "SURNAME";
    public static final String EMAIL = "EMAIL";


}
