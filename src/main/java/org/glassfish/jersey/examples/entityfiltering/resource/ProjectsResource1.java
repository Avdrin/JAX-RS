//package org.glassfish.jersey.examples.entityfiltering.resource;
//
//import org.glassfish.jersey.examples.entityfiltering.domain.EntityStore;
//import org.glassfish.jersey.examples.entityfiltering.domain.ProductPrice;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import java.util.List;
//
//@Path("priceList")
////@Produces("application/json")
//@Produces(MediaType.APPLICATION_JSON)
//public class ProjectsResource1 {
//
//    @GET
//    @Path("{id}")
//    public ProductPrice getProject(@PathParam("id") Long id) {
//        return EntityStore.getProject(id);
////        return getDetailedProject(id);
//    }
//
//
//    @GET
//    public List<ProductPrice> getProjects() {
//        return EntityStore.getProductPrice();
////        return getDetailedProjects();
//    }
//
//
//
////    @GET
////    @Path("detailed/{id}")
////    public ProductPrice getDetailedProject(@PathParam("id") Long id) {
////        return EntityStore.getProject(id);
////    }
//
////    @GET
////    @Path("{productName}")
////    public String getPrice(@PathParam("productName") String productName){
////        return getPriceByProdName(productName);
////    };
////    @GET
////    @Path("detailed/{productName}")
////    public String getPriceByProdName(@PathParam("productName") String prodName) {
////        return EntityStore.getPriceProject(prodName);
////    }
//
//
//
//
//
//
//
//
//
////    @GET
////    public List<ProductPrice> getProjects() {
////        return EntityStore.getProductPrice();
//////        return getDetailedProjects();
////    }
//
//
////    @GET
////    @Path("detailed")
////    public List<ProductPrice> getDetailedProjects() {
////        return EntityStore.getProductPrice();
////    }
//
//
//
//
//
//}
