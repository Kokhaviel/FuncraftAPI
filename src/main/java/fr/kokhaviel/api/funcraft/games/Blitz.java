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
 * Funcraft Blitz Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Blitz extends Game {
	final Element playerStats;

	final Element leaderBoardElement;
	final Element pointsElement;
	final Element gamesElement;
	final Element victoriesElement;
	final Element defeatsElement;
	final Element playedTimeElement;
	final Element killsElement;
	final Element deathsElement;
	final Element nexusDamageElement;


	public Blitz(Element blitzElement) {
		this.playerStats = blitzElement.getElementsByClass("player-stats-game").first();
		final Element playerStatsInfo = playerStats.getElementsByClass("player-stats-info").first();

		leaderBoardElement = playerStatsInfo.getElementsByClass("stats-entry").get(0);
		pointsElement = playerStatsInfo.getElementsByClass("stats-entry").get(1);
		gamesElement = playerStatsInfo.getElementsByClass("stats-entry").get(2);
		victoriesElement = playerStatsInfo.getElementsByClass("stats-entry").get(3);
		defeatsElement = playerStatsInfo.getElementsByClass("stats-entry").get(4);
		playedTimeElement = playerStatsInfo.getElementsByClass("stats-entry").get(5);
		killsElement = playerStatsInfo.getElementsByClass("stats-entry").get(6);
		deathsElement = playerStatsInfo.getElementsByClass("stats-entry").get(7);
		nexusDamageElement = playerStatsInfo.getElementsByClass("stats-entry").get(8);
	}

	@Override
	public String getGameName() {
		return playerStats.getElementsByClass("name game-border-blitz").first().text();
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
		return victoriesElement.getElementsByClass("stats-value stats-value-daily").first().text();
	}

	@Override
	public String getDefeats() {
		return defeatsElement.getElementsByClass("stats-value stats-value-daily").first().text();
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
		return "null";
	}

	@Override
	public String getDamage() {
		return "null";
	}

	@Override
	public String getNexusDamage() {
		return nexusDamageElement.getElementsByClass("stats-value stats-value-daily").first().text();
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
		return victoriesElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}

	@Override
	public String getDefeatsLastMonth() {
		return defeatsElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
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
		return "null";
	}

	@Override
	public String getDamageLastMonth() {
		return "null";
	}

	@Override
	public String getNexusDamageLastMonth() {
		return nexusDamageElement.getElementsByClass("stats-value stats-value-monthly").first()
				.getElementsByClass("player-stats-periodval").first().text();
	}
}
