package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.BlackJackTable;

public class BlackjackApplication {
	private BlackJackTable bjt = new BlackJackTable();
	public static void main(String[] args) {
		BlackjackApplication bja = new BlackjackApplication();
		bja.launch();
	}
	void launch() {
		bjt.startGame();
	}

}