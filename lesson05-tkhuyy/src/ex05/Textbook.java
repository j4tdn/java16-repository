package ex05;

public class Textbook {
 private float idBook;
 private  int price;
 private  String producer;
 private String status;
 
  public Textbook(){
	  
  }
  public Textbook(float idBook,int price,String producer,String status) {
	  this.idBook=idBook;
	  this.price=price;
	  this.producer=producer;
	  this.status=status;
  }
public float getIdBook() {
	return idBook;
}
public void setIdBook(float idBook) {
	this.idBook = idBook;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getProducer() {
	return producer;
}
public void setProducer(String producer) {
	this.producer = producer;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String toString() {
	return "Textbook [idBook=" + idBook + ", price=" + price + ", producer=" + producer + ", status=" + status + "]";
}
  
}
