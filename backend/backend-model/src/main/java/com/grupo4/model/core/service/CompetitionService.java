package com.grupo4.model.core.service;

import com.grupo4.api.core.service.ICompetitionService;
import com.grupo4.model.core.dao.CompetitionDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("CompetitionService")
public class CompetitionService implements ICompetitionService {

    @Autowired
    private CompetitionDao competitionDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;


    public EntityResult competitionQuery(Map<String, Object> keysValues, List<String> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.competitionDao, keysValues, attrMap);
    }

    public EntityResult publicCompetitionQuery(Map<String, Object> keysValues, List<String> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.competitionDao, keysValues, attrMap, "public");
    }

    public EntityResult publicCountCompetitionQuery(Map<String, Object> keysValues, List<String> attrMap) throws OntimizeJEERuntimeException {
        return r this.daoHelper.query(this.competitionDao, keysValues, attrMap, "publicCount");
    }

    public EntityResult allCountCompetitionQuery(Map<String, Object> keysValues, List<String> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.competitionDao, keysValues, attrMap, "allCount");
    }

    public EntityResult competitionInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(competitionDao, attrMap);
    }

    public EntityResult competitionUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.update(competitionDao, attrMap, keyMap);
    }

    public EntityResult competitionDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.competitionDao, keyMap);
    }

}
