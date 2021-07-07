/*
 * Copyright (c) 2021 Kokhaviel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.kokhaviel.api.funcraft.player;

import org.jsoup.nodes.Element;

/**
 * Funcraft Player Statistics
 * @author Kokhaviel
 * @since 1.0
 */
public class Player {

	final String headUrl;
	final String rank;
	final String username;
	final String inscription;
	final String lastConnection;
	final String glories;
	final String gamesPlayed;

	public Player(Element playerElement) {
		this.headUrl = playerElement.getElementsByClass("head").first().selectFirst("img").attr("src");
		this.rank = playerElement.getElementsByClass("info").first()
				.getElementsByClass("playername").first()
				.getElementsByClass("viprank mccolor-BLUE-bg").first().text();
		this.username = playerElement.getElementsByClass("info").first()
				.getElementsByClass("playername").first()
				.getElementsByClass("mccolor-GRAY").first().text();
		this.inscription = playerElement.getElementsByClass("info").first()
				.getElementsByClass("info-base").first()
				.getElementsByClass("info-entry").first()
				.getElementsByClass("tooltips").first().text();
		this.lastConnection = playerElement.getElementsByClass("info-base").first()
				.getElementsByClass("info-entry").get(1)
				.getElementsByClass("tooltips").first().text();
		this.glories = playerElement.getElementsByClass("info").first()
				.getElementsByClass("info-stats").first()
				.getElementsByClass("lbl lbl-me lbl-primary").first().text();
		this.gamesPlayed = playerElement.getElementsByClass("info").first()
				.getElementsByClass("info-stats").first()
				.getElementsByClass("lbl lbl-me").first().text();

	}

	/**
	 * Get Player Head Image Url
	 */
	public String getHeadUrl() {
		return headUrl;
	}

	/**
	 * Get Player In-Game Rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Get Player Username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Get Inscription Date
	 */
	public String getInscription() {
		return inscription;
	}

	/**
	 * Get Last Connection Date
	 */
	public String getLastConnection() {
		return lastConnection;
	}

	/**
	 * Get Total Player Glories
	 */
	public String getGlories() {
		return glories;
	}

	/**
	 * Get Total Games Played by the Player
	 */
	public String getGamesPlayed() {
		return gamesPlayed;
	}
}
