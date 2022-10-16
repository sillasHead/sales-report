package sillashead.backend.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sillashead.backend.entities.pk.ProductSalePk;

@Entity
@Table(name = "tb_product_sale")
public class ProductSale implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ProductSalePk id = new ProductSalePk();

    private Integer quantity;

    public ProductSale() {
    }

    public ProductSale(Sale sale, Product product, Integer quantity) {
        id.setSale(sale);
        id.setProduct(product);
        this.quantity = quantity;
    }

    @JsonIgnore
    public Sale getSale() {
        return id.getSale();
    }

    public void setSale(Sale sale) {
        id.setSale(sale);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductSale other = (ProductSale) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
