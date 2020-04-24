package bridgeweb.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bridgeweb.addrbook.AddrBook;
import bridgeweb.addrbook.AddrBookDAO;
import bridgeweb.addrbook.AddrBookH2DAO;

@Path("/addrbook")
public class RestApiService {
	Logger logger = Logger.getLogger("RestApiService");
	AddrBookDAO dao = new AddrBookH2DAO();
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Welcome to AddrBook WebService";
    }
    
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<AddrBook> getList() {
    	List<AddrBook> datas = dao.getDBList();
    	logger.info("API call: /list ");
    	return datas;
    }
    
    @GET
    @Path("id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public AddrBook getEntry(@PathParam("id") Integer id) {
        AddrBook data = dao.getDB(id);
        logger.info("API call: /id ");
        return data;
    }
    
    @POST
    @Path("new")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String newEntry(AddrBook addrbook) {
    	dao.insertDB(addrbook);
    	logger.info("API call: /new ");
    	return "Inserted !!";
    }

    @POST
    @Path("update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateEntry(AddrBook addrbook) {
    	dao.updateDB(addrbook);
    	logger.info("API call: /update ");
    	return "updated !!";
    }
    
    @DELETE
    @Path("delete/{id}")
    public void delEntry(@PathParam("id") Integer id) {
        dao.deleteDB(id);
        logger.info("API call: /delete ");
    }
}