/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 14: Hiện thực mô hình lớp sau bằng ngôn ngữ lập trình Java
 */


package bai14;

import java.text.DecimalFormat;

public class OrderDetail {
	private int quantity;
	private Product product;

	public OrderDetail(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calcTotalPrice() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %10d | %11s VND", product.toString(),
				quantity, df.format(calcTotalPrice()));
	}

}
