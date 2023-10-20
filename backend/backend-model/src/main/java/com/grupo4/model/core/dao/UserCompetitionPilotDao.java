package com.grupo4.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value ="UserCompetitionPilotDao")
@ConfigurationFile(
        configurationFile = "dao/UserCompetitionPilotDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class UserCompetitionPilotDao extends OntimizeJdbcDaoSupport {

    public static final String UCP_ID = "UCP_ID";
    public static final String UC_ID = "UC_ID";
    public static final String PIL_ID = "PIL_ID";
}
