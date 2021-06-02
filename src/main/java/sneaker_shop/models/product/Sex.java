package sneaker_shop.models.product;

public enum Sex {
    MAN, WOMAN, CHILD, UNISEX;

    private Sex name;

    public static Sex getSex(String name){
        name = name.toUpperCase();
        switch (name){
            case "MAN":
                return Sex.MAN;
            case "WOMAN":
                return Sex.WOMAN;
            case "CHILD":
                return Sex.CHILD;
            case "UNISEX":
                return Sex.UNISEX;
            default:
                throw new IllegalArgumentException("Name [" + name
                        + "] not supported.");
        }
    }
}
