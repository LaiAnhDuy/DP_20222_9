package entity.order;

import entity.media.Media;

public class OrderItem {
    
    private Media media;
    // Có dấu hiệu vi phạm DIP tại đây. Do OrderItem sử dụng trực tiếp Media
    // Để chỉnh sửa trường hợp này, có thể đơn giản biến Media thành abstract class
    // Khi này OrderItem không phụ thuộc trực tiếp vào Media mà phụ thuộc vào abstract của nó.
    
    private int price;
    private int quantity;

    public OrderItem(Media media, int quantity, int price) {
        this.media = media;
        this.quantity = quantity;
        this.price = price;
    }
    
    //Coincidential cohesion do Phương thức này không liên quan đến class, nó cần pahir được cài trong lowps ui hợp hơn
    @Override
    public String toString() {
        return "{" +
            "  media='" + media + "'" +
            ", quantity='" + quantity + "'" +
            ", price='" + price + "'" +
            "}";
    }
    
    public Media getMedia() {
        return this.media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
