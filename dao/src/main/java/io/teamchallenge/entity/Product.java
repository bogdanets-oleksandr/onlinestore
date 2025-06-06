package io.teamchallenge.entity;

import io.teamchallenge.entity.attributes.ProductAttribute;
import io.teamchallenge.entity.cartitem.CartItem;
import io.teamchallenge.entity.reviews.Review;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"category","brand","images","cartItems"})
@Builder
@EqualsAndHashCode(exclude = {"category","brand","images","cartItems"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "short_desc", nullable = false)
    private String shortDesc;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer quantity;

    @Setter(AccessLevel.PRIVATE)
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval = true)
    @Setter(AccessLevel.PRIVATE)
    private List<Image> images = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    @Setter(AccessLevel.PRIVATE)
    private List<CartItem> cartItems = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    @Setter(AccessLevel.PRIVATE)
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL, orphanRemoval = true)
    @Setter(AccessLevel.PRIVATE)
    private List<ProductAttribute> productAttributes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(unique = true, nullable = false)
    private String code;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @Setter(AccessLevel.PRIVATE)
    private List<AlternativeProduct> alternativeProducts;


    /**
     * Adds an image to the product and sets the product for the image.
     *
     * @param image The image to add to the product.
     */
    public void addImage(Image image) {
        images.add(image);
        image.setProduct(this);
    }

    /**
     * Removes an image from the product and sets the product of the image to null.
     *
     * @param image The image to remove from the product.
     */
    public void removeImage(Image image) {
        images.remove(image);
        image.setProduct(null);
    }

    /**
     * Adds a cart item to the user's list of cart items.
     * Also sets this product as the product associated with the added cart item.
     *
     * @param cartItem The cart item to be added.
     */
    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
        cartItem.setProduct(this);
    }

    /**
     * Removes a cart item from the user's list of cart items.
     * Also removes the association of this product from the removed cart item.
     *
     * @param cartItem The cart item to be removed.
     */
    public void removeCartItem(CartItem cartItem) {
        cartItems.remove(cartItem);
        cartItem.setProduct(null);
    }

    /**
     * Adds a product attribute to the list of attributes associated with this product.
     * This method also sets the product reference in the added attribute.
     *
     * @param productAttribute The product attribute to add.
     */
    public void addProductAttribute(ProductAttribute productAttribute) {
        productAttributes.add(productAttribute);
        productAttribute.setProduct(this);
    }

    /**
     * Removes a product attribute from the list of attributes associated with this product.
     * This method also removes the product reference from the removed attribute.
     *
     * @param productAttribute The product attribute to remove.
     */
    public void removeProductAttribute(ProductAttribute productAttribute) {
        productAttributes.remove(productAttribute);
        productAttribute.setProduct(null);
    }

    /**
     * Clears all images associated with the product.
     * This method removes the association of each image with the product and clears the list of images.
     */
    public void clearAllImages() {
        images.forEach(image -> image.setProduct(null));
        images.clear();
    }

    /**
     * Adds a review to the product's list of reviews.
     * Also sets the product for the added review.
     *
     * @param review The cart item to be added.
     */
    public void addReview(Review review) {
        reviews.add(review);
        review.setProduct(this);
    }

    /**
     * Removes a review from the product's list of reviews.
     * Also sets the product of the removed review to null.
     *
     * @param review The cart item to be removed.
     */
    public void removeReview(Review review) {
        reviews.remove(review);
        review.setProduct(null);
    }
}
