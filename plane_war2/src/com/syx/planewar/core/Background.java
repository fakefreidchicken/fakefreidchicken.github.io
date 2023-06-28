package com.syx.planewar.core;

import java.awt.Graphics;
import java.awt.Image;

import com.syx.planewar.constant.Constant;
import com.syx.planewar.util.ImageUtil;

/**
 * ѭ������ͼ
 * @author �����Q
 *
 */
public class Background implements Drawable,Moveable{
	public int x;
	public int y;
	public double xSpeed ;
	public double ySpeed ;
	public Image backImg ;
	
	@Override
	public void move() {
		
	}
	
	public Background() {
		super();
	}
	
	public Background(double xSpeed, double ySpeed, Image backImg) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.backImg = backImg;
	}
	public Background(double xSpeed, double ySpeed, String imageName) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.backImg = ImageUtil.images.get(imageName);
	}
	@Override
	public void draw(Graphics g) {
		g.drawImage(backImg, x, y, null);
		g.drawImage(backImg, x, y- Constant.GAME_HEIGHT,null);
		y+=ySpeed;
		x+=xSpeed;
		if(y>Constant.GAME_HEIGHT){
			y = 0;
		}
	}
}
