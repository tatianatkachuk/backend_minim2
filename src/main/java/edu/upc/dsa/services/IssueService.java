package edu.upc.dsa.services;

import edu.upc.dsa.dao.IIssueDAO;
import edu.upc.dsa.dao.implementations.IssueDAOImpl;
import edu.upc.dsa.models.Issue;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(value = "/issue", description = "Endpoint to User Service")
@Path("/issue")
public class IssueService {
    private IIssueDAO manager;

   /** public IssueService(){
        this.manager = IssueDAOImpl.getInstance();
    }**/

    // Denunciar un abuso
    @POST
    @ApiOperation(value = "Denuncia de un abuso", notes = "fecha + víctima + mensaje")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Issue.class),
            @ApiResponse(code = 500, message = "Information Error")
    })
    @Path("/report")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response reportIssue(Issue issueInfo) {
        if (issueInfo.getDate().isEmpty() || issueInfo.getInformer().isEmpty() || issueInfo.getMessage().isEmpty())
            return Response.status(500).build();

        else {
            /**this.manager.addIssue(
                    issueInfo.getDate(), issueInfo.getInformer(), issueInfo.getMessage());
            **/
             return Response.status(201).entity(issueInfo).build();
        }
    }


}

