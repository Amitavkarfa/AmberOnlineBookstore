package com.bookstore.amber.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.amber.Entiry.Books;
import com.bookstore.amber.Service.BService;

@RestController
public class BookController {

    @Autowired
    BService bs;

    @PostMapping("/addBook")
    public Books addBooks(@RequestBody Books book){

        return bs.addBooks(book);
    }
    
	  @GetMapping("/getBooks")
	    public List<Books> getAllBooks() {
	        return bs.fetchAllBooks();
	    }
	  
	  @GetMapping("/getBooks/{id}") 
	  public Books getBooksById(@PathVariable("id")int id)
	  {
		  return bs.getBooksById(id);
	  }
	  
	  @DeleteMapping("/Books/{id}")
	  public String deleteBooks(@PathVariable("id") int id) {
		  return bs.deleteBooksById(id);
	  }
    
}
