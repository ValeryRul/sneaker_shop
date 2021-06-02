package sneaker_shop.models.brand;

public enum Brand {
    NEW_BALANCE, ADIDAS, NIKE;

    public static Brand getBrand(String brandName){
        for(Brand brand: Brand.values()){
            if (brand.toString().equalsIgnoreCase(brandName.trim().replaceAll(" ", "_"))){
                return brand;
            }
        }
        throw new IllegalArgumentException("Name [" + brandName + "] not supported.");
    }
}
