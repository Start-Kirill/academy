package by.academy.homework3.deal;

import java.time.LocalDate;

public class Deal {

	private Person seller;
	private Person buyer;
	private Product[] products;
	private LocalDate deadlineDate;

	public Deal() {
		super();
		deadlineDate = LocalDate.now().plusDays(10);
	}

	public Deal(Person seller, Person buyer, Product[] products) {
		this();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Person getSeller() {
		return seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public Product[] getProducts() {
		return products;
	}
	
	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public double calcAmount() {
		double amount = 0;

		for (Product product : products) {
			if (product != null) {
				amount += product.calcPrice() * product.discount();
			}
		}
		return amount;
	}

	public boolean deal() {
		double amount = calcAmount();
		
		if (amount <= buyer.getMoney()) {
			buyer.setMoney(buyer.getMoney() - amount);
			seller.setMoney(seller.getMoney() + amount);
			return true;
		} else {
			System.out.println("Buyer doesn't have enough money!");
			return false;
		}

	}
	
}
