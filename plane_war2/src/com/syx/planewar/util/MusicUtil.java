package com.syx.planewar.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.net.URL;

import javazoom.jl.player.Player;
/**
 * ���ֲ�����
 * @author �����Q
 *
 */
public class MusicUtil extends Thread {
	private boolean loop;
	private static String fileName;
	
	public MusicUtil(String fileName,boolean loop) {
		this.loop = loop;
		this.fileName = fileName;
	}

	public MusicUtil(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * �����Ƿ�ѭ����������
	 */
	@Override
	public void run() {
		try{
			if(loop){
				while(true){
					play();
				}
			}else{
				play();
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	/**
	 * �������ֵ����·����ȡ����(mp3)
	 * @param fileName
	 * @return
	 */
	private void play(){
        Player p=null;
		try {   
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream("src/com/syx/planewar/music/"+fileName+".mp3"));
            p=new Player(buffer);
            p.play(); 
        } catch (Exception e) {   
             System.out.println(e);   
        }  
	}
}
