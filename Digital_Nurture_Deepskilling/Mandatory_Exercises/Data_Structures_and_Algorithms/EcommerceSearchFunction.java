package Digital_Nurture_Deepskilling.Mandatory_Exercises.Data_Structures_and_Algorithms;
public class EcommerceSearchFunction{

    public static Product linearSearch(Product[] products, int targetId){
        for(Product product:products){
            if(product.productId==targetId){
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[]products,int targetId){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].productId==targetId) return products[mid];
            if(products[mid].productId<targetId) low=mid+1;
            else high=mid-1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product []products={
            new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone","Electronics"),
            new Product(103,"Shoes","Fashion"),
            new Product(104,"Watch","Accessories"),
            new Product(105,"Bag","Fashion")
        };
        int searchId=104;
        System.out.println("Linear Search:");
        Product result1=linearSearch(products,searchId);
        if(result1!=null) result1.display();
        else System.out.println("Product not found");
        System.out.println();
        System.out.println("Binary Search:");
        Product result2=binarySearch(products,searchId);
        if(result2!=null) result2.display();
        else System.out.println("Product not found");

    }
}
class Product{
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    void display(){
        System.out.println("ID: "+ productId + ", Name: "+ productName + ", Category: "+ category);
    }
}