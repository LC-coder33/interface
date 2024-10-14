package main;

import dao_inf.DBdao;
import dao_inf.WordDAO;
import service.WordMainFrame;

public class Main {

	public static void main(String[] args) {
	
		DBdao dao = new WordDAO();
		WordMainFrame ws = new WordMainFrame(dao);

	}

}
