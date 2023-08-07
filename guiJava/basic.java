import java.awt.print.Book;

class Product{
    String name;
    int price;
    Review[] reviews;
}

class Review{
    int startCount;
    String text;
}


public class basic {
    public static void main(String[] args) {

        // Product vanne class ko aauta object banako
        Product book1 = new Product();

        // tyo Product ko object ma tesko property haru deko
        book1.name="nepsli book";
        book1.price=100;

        // tyo object ko reviews vanne property lai Review class ko object chahine vayeko le Reviews vanne class ko object banako
        // review ko object banum
        Review review1 = new Review();
        review1.startCount=10;
        review1.text="this is a good book";

        Review review2 = new Review();
        review2.startCount=2;
        review2.text="bad book";


        // tyo object my reviews ko array deko
        book1.reviews = new Review[]{review1, review2};
//        int sum =0;
//        for(int i=0; i<book1.reviews.length;i++){
//            sum+=book1.reviews[i].startCount;
//
//        }

        // function ma tyo object diyera avg review start count leko
        int avg=getAvg(book1);

        System.out.println(book1.price);
        System.out.println(book1.name);
        System.out.println(book1.reviews[0].text);
        System.out.println(avg);
    }

    static int getAvg(Product b){
        int sum =0;
        // sabbai reviews ko starCount ko sum leko by help of looping
        for(int i=0; i<b.reviews.length;i++){
            sum+=b.reviews[i].startCount;

        }
        // average return gareko
        return sum/b.reviews.length;
    }

}
