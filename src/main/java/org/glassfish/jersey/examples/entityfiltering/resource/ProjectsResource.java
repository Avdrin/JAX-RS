package org.glassfish.jersey.examples.entityfiltering.resource;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jersey.repackaged.com.google.common.collect.Lists;
import org.glassfish.jersey.examples.entityfiltering.DBDataSources;
import org.glassfish.jersey.examples.entityfiltering.domain.EntityStore;
import org.glassfish.jersey.examples.entityfiltering.domain.Price;
import org.glassfish.jersey.examples.entityfiltering.domain.ProductPrice;

@Path("priceList")
//@Produces("application/json")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProjectsResource {

    DBDataSources dbDataSources;


//    @GET
//    @Path("{productName}")
//    public Price getProject(@PathParam("productName") String productName) {
//        return EntityStore.getPrice(productName); //getProject(id);
//    }


    @GET
    @Path("price")
    public Response getPrice(@NotNull @QueryParam("productName") String productName, @NotNull @QueryParam("date") RESTDateParam date) {//},
//                           @NotNull @QueryParam("date") LocalDate date) {

        //productName = "xcv";
//        date.toString();
        System.out.print(date);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate lDate = LocalDate.parse((date.getDate()).toString(), format);


        Price price = EntityStore.getPrice(productName, lDate);

        if (price != null) {
            GenericEntity<Price> entity = new GenericEntity<Price>(price) {
            };

            return Response.ok(entity).build();
        } else {
            return Response.status(Response.Status.NO_CONTENT).entity("NO_CONTENT").build();
        }

//        return date.toString(); //BigDecimal.valueOf(2.3f);
    }


    @GET
//    @Path("listPrices/{productName}")
    @Path("listPrices")
    public Response getPrices(@NotNull @QueryParam("productName") String productName) {
//List<Price>

        List<Price> priceList = EntityStore.getListPrices(productName);
//        if (priceList.size()==0){
//            Response.status(Response.Status.NOT_FOUND).entity("Resource not found for ID: " + uuid).build();
//           return Response.status(Response.Status.NOT_FOUND).entity("NOT_FOUND").build();
//           return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("INTERNAL_SERVER_ERROR").build();

        if (priceList.size() == 0) {
            return Response.status(Response.Status.NOT_FOUND).entity("NOT_FOUND").build();
        } else {

            GenericEntity<List<Price>> entity =
                    new GenericEntity<List<Price>>(Lists.newArrayList(priceList)) {
                    };

            return Response.ok(entity).build();
        }
//           return Response.ok(Lists.newArrayList(priceList)).build();//status(200).entity(priceList).build();
//        }else {
//          return priceList;
//        }

//        return ;//getProductPrice();
//        String output = "Message requested :"; // + productName;
//        return Response.status(200).entity("cbncgcggdr").build();
//        Collections.sort(priceList);
//return priceList;
    }


    @GET
    @Path("query")
    public Response getUsers(
            @QueryParam("from") int from,
            @QueryParam("to") int to,
            @QueryParam("orderBy") List<String> orderBy) {

        return Response
                .status(200)
                .entity("getUsers is called, from : " + from + ", to : " + to
                        + ", orderBy" + orderBy.toString()).build();

    }


//    @GET
//    @Path("detailed/{id}")
//    public ProductPrice getDetailedProject(@PathParam("id") Long id) {
//        return EntityStore.getProject(id);
//    }

//    @GET
//    @Path("{productName}")
//    public String getPrice(@PathParam("productName") String productName){
//        return getPriceByProdName(productName);
//    };
//    @GET
//    @Path("detailed/{productName}")
//    public String getPriceByProdName(@PathParam("productName") String prodName) {
//        return EntityStore.getPriceProject(prodName);
//    }


//    @GET
//    public List<ProductPrice> getProjects() {
//        return EntityStore.getProductPrice();
////        return getDetailedProjects();
//    }


//    @GET
//    @Path("detailed")
//    public List<ProductPrice> getDetailedProjects() {
//        return EntityStore.getProductPrice();
//    }


}
