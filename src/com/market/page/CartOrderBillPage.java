package com.market.page;

import javax.swing.*;

import com.market.bookitem.BookInIt;
import com.market.cart.Cart;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.market.member.UserInIt;
public class CartOrderBillPage extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Cart mCart;
	JPanel shippingPanel;
	JPanel radioPanel;
	
	public CartOrderBillPage(JPanel panel, Cart cart) {
		
		setLayout(null);
		
		Rectangle rect = panel.getBounds();
		System.out.println(rect);
		setPreferredSize(rect.getSize());
		
		this.mCart = cart;
		
		shippingPanel = new JPanel();
		//shippingPanel.setBounds(200, 50, 700, 500);
		shippingPanel.setBounds(0,0,700,500);
		shippingPanel.setLayout(null);
		//add(shippingPanel);
		panel.add(shippingPanel);
		
		printBillInfo(UserInIt.getmUser().getName(), String.valueOf(UserInIt.getmUser().getPhone()),UserInIt.getmUser().getAddress());
	}
public void printBillInfo(String name, String phone, String address) {
	
	Font ft;
	ft = new Font("함초롬돋움",Font.BOLD,15);
	
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
	String strDate = formatter.format(date);
	
	JPanel panel01 = new JPanel();
	panel01.setBounds(0,0,500,30);
	//panel01.setBackground(Color.Gray);
	JLabel label01 = new JLabel("------배송받을 고객 정보----------");
	label01.setFont(ft);
	panel01.add(label01);
	shippingPanel.add(panel01);
	
	JPanel panel02 = new JPanel();
	panel02.setBounds(0,30,500,30);
	JLabel label02 = new JLabel("고객명:"+name+
			"                    연락처:" +phone);
	label02.setHorizontalAlignment(JLabel.LEFT);
	label02.setFont(ft);
	panel02.add(label02);
	shippingPanel.add(panel02);
	
	JPanel panel03 = new JPanel();
	panel03.setBounds(0,60,500,30);
	JLabel label03 = new JLabel("배송지:"+address+
			"              발송일: " +strDate);
	label03.setHorizontalAlignment(JLabel.LEFT);
	label03.setFont(ft);
	panel03.add(label03);
	shippingPanel.add(panel03);
	
	JPanel printPanel = new JPanel();
	printPanel.setBounds(0,100,500,300);
	printCart(printPanel);
	shippingPanel.add(printPanel);
	
}
public void printCart(JPanel panel) {
	Font ft;
	ft = new Font("함초롬돋움",Font.BOLD,12);
	JPanel panel01 = new JPanel();
	panel01.setBounds(0,0,500,5);
	JLabel label01 = new JLabel(" 장바구니 상품 목록:");
	label01.setFont(ft);
	panel01.add(label01);
	panel.add(panel01);
	
	JPanel panel02 = new JPanel();
	panel02.setBounds(0,20,500,5);
	JLabel label02 = new JLabel(" -------------");
	label02.setFont(ft);
	panel02.add(label02);
	panel.add(panel02);
	
	JPanel panel03 = new JPanel();
	panel03.setBounds(0,25,500,5);
	JLabel label03 = new JLabel(" 도서ID | 수량 | 합계 ");
	label03.setFont(ft);
	panel03.add(label03);
	panel.add(panel03);
	
	JPanel panel04 = new JPanel();
	panel04.setBounds(0,30,500,5);
	JLabel label04 = new JLabel(" ---------------");
	label04.setFont(ft);
	panel04.add(label04);
	panel.add(panel04);
	
	for(int i = 0; i<mCart.mCartItem.size(); i++) {//13
		JPanel panel05 = new JPanel();
		panel05.setBounds(0,35+(i*5),500,5);
		JLabel label05 = new JLabel("           "+
		mCart.mCartItem.get(i).getBookID()+"          "+
		mCart.mCartItem.get(i).getQuantity()+"          "+
		mCart.mCartItem.get(i).getTotalPrice());
		label05.setFont(ft);
		panel05.add(label05);
		panel.add(panel05);
	}
	
	JPanel panel06 = new JPanel();
	panel04.setBounds(0,35+(mCart.mCartItem.size()*5),500,5);
	JLabel label06 = new JLabel(" ---------------");
	label06.setFont(ft);
	panel06.add(label06);
	panel.add(panel06);
	
	for(int i = 0; i<Cart.mCartCount; i++) {
	}
	System.out.println("------------"+ Cart.mCartCount);
	
	JPanel panel07 = new JPanel();
	panel07.setBounds(0,40+(mCart.mCartItem.size()*5),500, 5);
	JLabel label07 = new JLabel(" ---------------");
	// 
	label07.setFont(new Font("함초롬돋움",Font.BOLD,15));
	panel07.add(label07);
	panel.add(panel07);
}
}