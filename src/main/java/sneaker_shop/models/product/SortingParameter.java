package sneaker_shop.models.product;

public enum SortingParameter {
    PRICE_LOW_TO_HIGH, PRICE_HIGH_TO_LOW, NEW_TO_OLD, OLD_TO_NEW;

    public static SortingParameter getSortingParameter(String param){
        for(SortingParameter sortingParameter : SortingParameter.values()){
             if(sortingParameter.toString().equalsIgnoreCase(param)){
                 return sortingParameter;
             }
        }
        throw new IllegalArgumentException("Parameter [" + param + "] not supported.");
    }
}
