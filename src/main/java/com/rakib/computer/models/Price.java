package com.rakib.computer.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Price {
	 @Id
	  public ObjectId _id;
	  
	  public String name;
	  public Double price;
	  // Constructors
	  public Price() {}
	  
	  public Price(ObjectId _id, String name, Double price) {
	    this._id = _id;
	    this.name = name;
	    this.price = price;
	  }
	  
	  // ObjectId needs to be converted to string
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }
	  
	  public String getName() { return name; }
	  public void setName(String name) { this.name = name; }
	  
	  public Double getPrice() { return price; }
	  public void setPrice(Double price) { this.price = price; }
	  
	 
}
