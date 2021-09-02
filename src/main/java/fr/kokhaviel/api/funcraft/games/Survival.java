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

	final Element playerStats;

	final Element leaderBoardElement;
	final Element pointsElement;
	final Element gamesElement;
	final Element top1Element;
	final Element playedTimeElement;
	final Element killsElement;
	final Element deathsElement;

	public Survival(Element survivalElement) {
		playerStats = survivalElement.getElementsByClass("player-stats-game").first();
		final Element playerStatsInfo = playerStats.getElementsByClass("player-stats-info").first();

		leaderBoardElement = playerStatsInfo.getElementsByClass("stats-entry").get(0);
		pointsElement = playerStatsInfo.getElementsByClass("stats-entry").get(1);
		gamesElement = playerStatsInfo.getElementsByClass("stats-entry").get(2);
		top1Element = playerStatsInfo.getElementsByClass("stats-entry").get(3);
		playedTimeElement = playerStatsInfo.getElementsByClass("stats-entry").get(4);
		killsElement = playerStatsInfo.getElementsByClass("stats-entry").get(5);
		deathsElement = playerStatsInfo.getElementsByClass("stats-entry").get(6);
	}

	@Override
	public String getGameName() {
		return playerStats.getElementsByClass("name game-border-survival").first().text();
	}

	@Override
	public String getLeaderBoard() {
		return leaderBoardElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getPoints() {
		return pointsElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getGames() {
		return gamesElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getVictories() {
		return "null";
	}

	@Override
	public String getDefeats() {
		return "null";
	}

	@Override
	public String getPlayedTime() {
		return playedTimeElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getKills() {
		return killsElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getDeaths() {
		return deathsElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getBedsDestroy() {
		return "null";
	}

	@Override
	public String getTop1() {
		return top1Element.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getDamage() {
		return "null";
	}

	@Override
	public String getNexusDamage() {
		return "null";
	}

	@Override
	public String getLeaderBoardLastMonth() {
		return leaderBoardElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getPointsLastMonth() {
		return pointsElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getGamesLastMonth() {
		return gamesElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getVictoriesLastMonth() {
		return "null";
	}

	@Override
	public String getDefeatsLastMonth() {
		return "null";
	}

	@Override
	public String getPlayedTimeLastMonth() {
		return playedTimeElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getKillsLastMonth() {
		return killsElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getDeathsLastMonth() {
		return deathsElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getBedsDestroyLastMonth() {
		return "null";
	}

	@Override
	public String getTop1LastMonth() {
		return top1Element.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getDamageLastMonth() {
		return "null";
	}

	@Override
	public String getNexusDamageLastMonth() {
		return "null";
	}
}
