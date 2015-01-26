package ntuOopExercises;

public class Book {

	//
	// Variables
	//
	
	private String name;
	
	private double price;
	private int qtyInStock;
	private int numAuthors = 0;
	private Author[] authors = new Author [5]; //Declare and allocate the array of authors but not the instances
	
	//
	// Constructors
	//
	
	// Constructor creating a Book without the qtyInStock
	public Book(String name, double price)
	{
//		this.name = name;
//		this.author = author;
//		this.price = price;
		//All these can be defined in one function that will pass them through to the next constructor
		//as well.
		this(name, price,0);//This will pass all three variables from the current constructor to the
									//next one in line.
									//NOTE: we must pass through the next contructor's variables as well
									//(in this case the zero).
		//The next constructor is also defining these variables.
	}
	
	// Constructor creating a Book with the qtyInStock
	public Book(String name, double price, int qtyInStock)
	{
		this.name = name;	
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	//
	// Getters 
	//
	
	// Get name
	public String getName()
	{
		return name;
	}
	
	// Get author
	public Author[]  getAuthors()
	{
		return authors;
	}	
		
	// Get price
	public double getPrice()
	{
		return price;
	}
	
	// Get quantity in stock
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	
	//
	// Setters
	//
	
	// Setter for price
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	// Setter for quantity in stock
	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock;
	}
	
	public void addAuthor(Author author) //Creates instances of author.
	{
		arrayLengthIncrease();
		authors[numAuthors] = author;
		numAuthors++;
	}
	
	//Func for increasing the array size in case the user trys inserting more authors.
	public void arrayLengthIncrease()
	{
		if (authors.length == numAuthors)
		{
			Author[] hold_authors = new Author [numAuthors+1]; //hold_authors will hold the current authors array.
			for (int i = 0; i < authors.length; i++)
			{
				hold_authors[i] = authors[i];
			}		
			authors = hold_authors;

		}
	
	}
	
	//Func for removing authors by name
	public boolean removeAuthorByName(String name)
	{
		boolean nameIsFound = false;
		for(int i = 0; i <= authors.length; i++)
		if (authors[i].getName() == name)
			nameIsFound = true;
		return nameIsFound;
		//TODO: Create an array to hold the current array minus the author found by name.
	}
	
	//
	// toString
	//
	
	// Setting the to String
	public String toString()
	{
		return "Book: Name = " + name + " Price = " + price + " Quantity In Stock = " + qtyInStock;
	}
}
