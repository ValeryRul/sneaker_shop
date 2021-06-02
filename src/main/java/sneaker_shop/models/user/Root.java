package sneaker_shop.models.user;


import sneaker_shop.models.product.Sex;

public enum  Root {
    MAIN_ADMIN,
    ADMIN,
    USER;

    public static Root getRoot(String root){
        root = root.toUpperCase().replaceAll(" ", "_");
        switch (root){
            case "MAIN_ADMIN":
                return Root.MAIN_ADMIN;
            case "ADMIN":
                return Root.ADMIN;
            case "USER":
                return Root.USER;
            default:
                throw new IllegalArgumentException("Name [" + root
                        + "] not supported.");
        }
    }
}
