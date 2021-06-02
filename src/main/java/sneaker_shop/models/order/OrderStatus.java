package sneaker_shop.models.order;

public enum OrderStatus {
    IMPLEMENTED, CANCELED, DELIVERED, SENT, READY_TO_SENT;

    public static OrderStatus getOrderStatus(String statusName){
        for(OrderStatus status: OrderStatus.values()){
            if (status.toString().equalsIgnoreCase(statusName.replaceAll("_", " "))){
                return status;
            }
        }
        throw new IllegalArgumentException("Name [" + statusName + "] not supported.");
    }
}
