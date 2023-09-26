package com.amit.restServices.RestAPI;

import java.util.List;

import com.amit.restServices.RestAPI.dao.BookDao;
import com.amit.restServices.RestAPI.entity.Books;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/books")
public class BookService {
	
	
	@GET
	@Path("/getAllBooks")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Books> getAllBooks(){
		
		System.out.println("Inside getAllAPI method");
		
		return BookDao.getAllBook();
	}
	
	@GET
	@Path("getBookById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBookById(@PathParam("id")  String id) {
		
		Books book= BookDao.getByID(id);
		
		return Response.status(200).entity(book).build();
	}
	
	@POST
	@Path("/addBook")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBook(Books b) {
		
        String book= BookDao.addBook(b);
		
		return Response.status(200).entity(book).build();
		
	}
	
	@PUT
	@Path("/updateBook")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response  updateBook(Books b) {
		
        String book= BookDao.updateBooks(b);
		
		return Response.status(200).entity(book).build();
		
	}
	
	@DELETE
	@Path("/deleteBook/{bid}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
	public Response  deleteBook( @PathParam("bid") String bid) {
		
        String deletebook= BookDao.deleteBooks(bid);
        if(deletebook.startsWith("Error")) {
        	String response= "error : Book couldn't be deleted " +deletebook;
        	
        	return Response.status(Response.Status.NOT_FOUND).entity(response).build();
        }
		
		return Response.status(Response.Status.ACCEPTED).entity(deletebook).build();
		
	}
	
	

}
