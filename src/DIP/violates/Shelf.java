package DIP.violates;

// High level class

//Everything looks fine, but as the high-level Shelf class depends on the low-level Book,
// the above code violates the Dependency Inversion Principle.
// This becomes clear when the store asks us to enable customers to add DVDs to their shelves, too.
// In order to fulfil the demand, we create a new DVD class:
public class Shelf {

    Book book;

    void addBook(Book book) {

    }



    void customizeShelf() {

    }

    DVD dvd;


    void addDvd(DVD dvd) {

    }

}
