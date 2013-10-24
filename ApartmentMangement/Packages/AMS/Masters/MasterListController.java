/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.Masters;

import AMS.Masters.Dto.ApartmentDto;
import AMS.Masters.Dto.MasterDto;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Mozhi
 */
@Path("/Masters")
public class MasterListController {

    @GET
    @Path("/{module}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MasterDto> GetList(@PathParam("module") String module,
    @QueryParam("pageSize") int pageSize,
    @QueryParam("pageNo") int pageNo,
    @QueryParam("searchText") String searchText) {
        
        List<ApartmentDto> apartments = new ArrayList<ApartmentDto>();
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        apartments.add(new ApartmentDto());
        List<MasterDto> results = new ArrayList<MasterDto>();
        for (MasterDto m : apartments) {
            results.add(m);
        }
        return results;//Response.status(Response.Status.OK).entity(module).build();
    }
}
