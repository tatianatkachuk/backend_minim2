package edu.upc.dsa.dao.implementations;

import edu.upc.dsa.dao.IIssueDAO;
import edu.upc.dsa.models.Issue;
import org.apache.log4j.Logger;

public class IssueDAOImpl implements IIssueDAO {

    private static IssueDAOImpl instance;
    final static Logger logger = Logger.getLogger(IssueDAOImpl.class);

    @Override
    public Issue addIssue(String date, String informer, String message) {
        Issue i = new Issue(date,informer,message);
        logger.info("Add new issue: " + i);
        return i;
    }
    /** private SessionImpl session;

    private UserDAOImpl(){
        this.session = SessionImpl.getInstance();
    }
     **/


}
