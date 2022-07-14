package mysqlazure.electronics;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Electronics {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String category;
	private long price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Electronics(int id, String name, String category, long price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Electronics [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electronics other = (Electronics) obj;
		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}
	

}
