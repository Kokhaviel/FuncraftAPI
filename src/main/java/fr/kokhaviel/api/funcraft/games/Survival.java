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

/**
 * Funcraft Survival Statistics
 * @author Kokhaviel
 * @since 1.0
 */
public class Survival extends Game {

	public Survival(Element survivalElement) {
		final Element playerStats = survivalElement.getElementsByClass("player-stats-game").first();
		final Element playerStatsInfo = playerStats.getElementsByClass("player-stats-info").first();

		this.setGameName(playerStats.getElementsByClass("name game-border-survival").first().text());
		setStats(playerStatsInfo);
	}

	@Override
	public void setStats(Element playerStatsElement) {
		final Element leaderBoardElement = playerStatsElement.getElementsByClass("stats-entry").get(0);
		final Element pointsElement = playerStatsElement.getElementsByClass("stats-entry").get(1);
		final Element gamesElement = playerStatsElement.getElementsByClass("stats-entry").get(2);
		final Element top1Element = playerStatsElement.getElementsByClass("stats-entry").get(3);
		final Element playedTimeElement = playerStatsElement.getElementsByClass("stats-entry").get(4);
		final Element killsElement = playerStatsElement.getElementsByClass("stats-entry").get(5);
		final Element deathsElement = playerStatsElement.getElementsByClass("stats-entry").get(6);

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
		this.setTop1(replaceDashByZero(
				top1Element.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setTop1LastMonth(replaceDashByZero(
				top1Element.getElementsByClass("stats-value stats-value-monthly").first()
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
	}
}
