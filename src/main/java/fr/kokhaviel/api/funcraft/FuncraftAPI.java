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

package fr.kokhaviel.api.funcraft;

import fr.kokhaviel.api.funcraft.games.*;
import fr.kokhaviel.api.funcraft.player.Player;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Funcraft API Core
 * @author Kokhaviel
 * @since 1.0
 */
public class FuncraftAPI {

	public FuncraftAPI() {
	}

	/**
	 * Get {@link RushRetro} Stats of a Player
	 * @param player username
	 * @return Rush Retro Statistics
	 */
	public RushRetro getRushRetroStats(String player) throws IOException {
		return new RushRetro(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.first());
	}

	/**
	 * Get {@link RushMDT} Stats of a Player
	 * @param player username
	 * @return Rush MDT Statistics
	 */
	public RushMDT getRushMDTStats(String player) throws IOException {
		return new RushMDT(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(1));
	}

	/**
	 * Get {@link Hikabrain} Stats of a Player
	 * @param player username
	 * @return Hikabrain Statistics
	 */
	public Hikabrain getHikabrainStats(String player) throws IOException {
		return new Hikabrain(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(2));
	}

	/**
	 * Get {@link Skywars} Stats of a Player
	 * @param player username
	 * @return Skywars Statistics
	 */
	public Skywars getSkywarsStats(String player) throws IOException {
		return new Skywars(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(3));
	}

	/**
	 * Get {@link Octogone} Stats of a Player
	 * @param player username
	 * @return Octogone Statistics
	 */
	public Octogone getOctogoneStats(String player) throws IOException {
		return new Octogone(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(4));
	}

	/**
	 * Get {@link ShootCraft} Stats of a Player
	 * @param player username
	 * @return Shootcraft Statistics
	 */
	public ShootCraft getShootCraftStats(String player) throws IOException {
		return new ShootCraft(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(5));
	}

	/**
	 * Get {@link Infected} Stats of a Player
	 * @param player username
	 * @return Infected Statistics
	 */
	public Infected getInfectedStats(String player) throws IOException {
		return new Infected(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(6));
	}

	/**
	 * Get {@link Survival} Stats of a Player
	 * @param player username
	 * @return Survival Statistics
	 */
	public Survival getSurvivalStats(String player) throws IOException {
		return new Survival(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(7));
	}

	/**
	 * Get {@link Blitz} Stats of a Player
	 * @param player username
	 * @return Blitz Statistics
	 */
	public Blitz getBlitzStats(String player) throws IOException {
		return new Blitz(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(8));
	}

	/**
	 * Get {@link PvpSmash} Stats of a Player
	 * @param player username
	 * @return PvpSmash Statistics
	 */
	public PvpSmash getPvpSmashStats(String player) throws IOException {
		return new PvpSmash(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(9));
	}

	/**
	 * Get {@link LandRush} Stats of a Player
	 * @param player username
	 * @return LandRush Statistics
	 */
	public LandRush getLandRushStats(String player) throws IOException {
		return new LandRush(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(10));
	}

	/**
	 * Get {@link Player} Stats of a Player
	 * @param player username
	 * @return Player Statistics
	 */
	public Player getPlayerStats(String player) throws IOException {
		return new Player(this.get("Kokhaviel")
				.selectFirst("html")
				.selectFirst("body")
				.getElementById("main-layout")
				.getElementsByClass("container player-banner-margin-top").first()
				.getElementsByClass("box").first()
				.getElementsByClass("player-banner clearfix").first());
	}

	private Document get(String player) throws IOException {
		String baseUrl = "https://www.funcraft.net/fr/joueurs?q=";
		String url = baseUrl + player;

		return Jsoup.connect(url).get();
	}

	private Element getStats(String player) throws IOException {
		return this.get(player).selectFirst("html")
				.selectFirst("body")
				.getElementById("main-layout")
				.getElementsByClass("container player-banner-margin-top").first()
				.getElementsByClass("box").get(1)
				.getElementsByClass("tab-content").first()
				.getElementById("player-stats");
	}
}