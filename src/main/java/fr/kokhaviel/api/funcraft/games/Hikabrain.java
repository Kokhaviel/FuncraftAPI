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

package fr.kokhaviel.api.funcraft.games;

import org.jsoup.nodes.Element;

public class Hikabrain extends Game {

	public Hikabrain(Element hikabrainElement) {
		final Element playerStats = hikabrainElement.getElementsByClass("player-stats-game").first();
		final Element playerStatsInfo = playerStats.getElementsByClass("player-stats-info").first();

		this.setGameName(playerStats.getElementsByClass("name game-border-hikabrain").first().text());
		setStats(playerStatsInfo);

		final Element victoriesElement = playerStatsInfo.getElementsByClass("stats-entry").get(3);
		final Element defeatsElement = playerStatsInfo.getElementsByClass("stats-entry").get(4);


		this.setVictories(replaceDashByZero(
				victoriesElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setVictoriesLastMonth(replaceDashByZero(
				victoriesElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
		this.setDefeats(replaceDashByZero(
				defeatsElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setDefeatsLastMonth(replaceDashByZero(
				defeatsElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
	}
}
