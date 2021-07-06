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

public class Blitz extends Game {

	public Blitz(Element blitzElement) {
		final Element playerStats = blitzElement.getElementsByClass("player-stats-game").first();
		final Element playerStatsInfo = playerStats.getElementsByClass("player-stats-info").first();

		this.setGameName(playerStats.getElementsByClass("name game-border-blitz").first().text());
		setStats(playerStatsInfo);
	}

	@Override
	public void setStats(Element playerStatsElement) {
		final Element leaderBoardElement = playerStatsElement.getElementsByClass("stats-entry").get(0);
		final Element pointsElement = playerStatsElement.getElementsByClass("stats-entry").get(1);
		final Element gamesElement = playerStatsElement.getElementsByClass("stats-entry").get(2);
		final Element victoriesElement = playerStatsElement.getElementsByClass("stats-entry").get(3);
		final Element defeatsElement = playerStatsElement.getElementsByClass("stats-entry").get(4);
		final Element playedTimeElement = playerStatsElement.getElementsByClass("stats-entry").get(5);
		final Element killsElement = playerStatsElement.getElementsByClass("stats-entry").get(6);
		final Element deathsElement = playerStatsElement.getElementsByClass("stats-entry").get(7);
		final Element nexusDamageElement = playerStatsElement.getElementsByClass("stats-entry").get(8);

		this.setLeaderBoard(replaceDashByZero(
				leaderBoardElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setLeaderBoardLastMonth(replaceDashByZero(
				leaderBoardElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
		this.setPoints(replaceDashByZero(
				pointsElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setPointsLastMonth(replaceDashByZero(
				pointsElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
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
		this.setGames(replaceDashByZero(
				gamesElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setGamesLastMonth(replaceDashByZero(
				gamesElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
		this.setPlayedTime(replaceDashByZero(
				playedTimeElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setPlayedTimeLastMonth(replaceDashByZero(
				playedTimeElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
		this.setKills(replaceDashByZero(
				killsElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setKillsLastMonth(replaceDashByZero(
				killsElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
		this.setDeaths(replaceDashByZero(
				deathsElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setDeathsLastMonth(replaceDashByZero(
				deathsElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
		this.setNexusDamage(replaceDashByZero(
				nexusDamageElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setNexusDamageLastMonth(replaceDashByZero(
				nexusDamageElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
	}
}
