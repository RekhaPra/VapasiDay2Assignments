package oopsassignment;

public class College {
    public static void main(String[] args) {

        Book book1=new Book("16784",true,"Harry");
        Book book2=new Book("16785",true,"Grill");
        Book book3=new Book("16786",false,"Robert");
        Book book4=new Book("16787",false,"John");

        Furniture furniture=new Furniture("chair","Plastic");
        Furniture furniture1=new Furniture("sofa","Wooden");
        Furniture furniture2=new Furniture("chair","Iron");
        Furniture furniture3=new Furniture("chair","Metal");

        Staff staff=new Staff(35,"Rek","G");
        Staff staff2=new Staff(10,"Thana","P");
        Staff staff3=new Staff(5,"Hars","P");
        Staff staff4=new Staff(40,"Prabhu","B");

        Library library=new Library(book1,furniture,staff);
        Library library2=new Library(book2,furniture1,staff2);
        Library library3=new Library(book3,furniture2,staff3);
        Library library4=new Library(book4,furniture3,staff4);

        EnggDept engDept=new EnggDept(library);
        EnggDept engDept2=new EnggDept(library3);
        ArtsDept artsDept=new ArtsDept(library2);
        ArtsDept artsDept2=new ArtsDept(library4);

        System.out.println("Number of books available in college: ");
        book1.numberOfBooks();

        System.out.println("Number of books Rented : ");
        book1.rentedBooks();

        System.out.println("Total Number of chairs :");
        furniture.numberOfChair();

        System.out.println("Total Number of Staff: ");
        staff.staffCount();

        System.out.println("Eldest Staff Details: ");
        staff.getEldestStaff();

    }
}
