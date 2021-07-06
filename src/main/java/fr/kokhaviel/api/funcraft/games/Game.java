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

public class Game {

	String gameName = ""; 			//Available in all Games

	protected void setGameName(String name) {
		this.gameName = name;
	}

	public String getGameName() {
		return gameName;
	}

	String leaderBoard = "";	//Available in all Games
	String points = ""; 		//Available in all Games
	String games = "";			//Available in all Games
	String victories = "";		//Available in Rush Retro, Rush MDT, HikaBrain, Infected, Blitz & LandRush
	String defeats = "";		//Available in Rush Retro, Rush MDT, HikaBrain, Blitz & LandRush
	String playedTime = "";		//Available in all Games
	String kills = "";			//Available in all Games
	String deaths = "";			//Available in all Games
	String bedsDestroy = "";	//Available in Rush Retro, Rush MDT & LandRush
	String top1 = "";			//Available in Skywars, Octagon, ShootCraft, Survival & PvpSmash
	String damage = "";			//Available in Octagon & PvpSmash
	String nexusDamage = "";	//Available in Blitz


	protected void setLeaderBoard(String leaderBoard) {
		this.leaderBoard = leaderBoard;
	}

	protected void setPoints(String points) {
		this.points = points;
	}

	protected void setGames(String games) {
		this.games = games;
	}

	protected void setVictories(String victories) {
		this.victories = victories;
	}

	protected void setDefeats(String defeats) {
		this.defeats = defeats;
	}

	protected void setPlayedTime(String playedTime) {
		this.playedTime = playedTime;
	}

	protected void setKills(String kills) {
		this.kills = kills;
	}

	protected void setDeaths(String deaths) {
		this.deaths = deaths;
	}

	protected void setBedsDestroy(String bedsDestroy) {
		this.bedsDestroy = bedsDestroy;
	}

	protected void setTop1(String top1) {
		this.top1 = top1;
	}

	protected void setDamage(String damage) {
		this.damage = damage;
	}

	protected void setNexusDamage(String nexusDamage) {
		this.nexusDamage = nexusDamage;
	}

	public String getLeaderBoard() {
		return leaderBoard;
	}

	public String getPoints() {
		return points;
	}

	public String getGames() {
		return games;
	}

	public String getVictories() {
		return victories;
	}

	public String getDefeats() {
		return defeats;
	}

	public String getPlayedTime() {
		return playedTime;
	}

	public String getKills() {
		return kills;
	}

	public String getDeaths() {
		return deaths;
	}

	public String getBedsDestroy() {
		return bedsDestroy;
	}

	public String getTop1() {
		return top1;
	}

	public String getDamage() {
		return damage;
	}

	public String getNexusDamage() {
		return nexusDamage;
	}


	String leaderBoardLastMonth = "";		//Available in all Games
	String pointsLastMonth = ""; 			//Available in all Games
	String gamesLastMonth = "";				//Available in all Games
	String victoriesLastMonth = "";			//Available in Rush Retro, Rush MDT, HikaBrain, Infected, Blitz & LandRush
	String defeatsLastMonth = "";			//Available in Rush Retro, Rush MDT, HikaBrain, Blitz & LandRush
	String playedTimeLastMonth = "";		//Available in all Games
	String killsLastMonth = "";				//Available in all Games
	String deathsLastMonth = "";			//Available in all Games
	String bedsDestroyLastMonth = "";		//Available in Rush Retro, Rush MDT & LandRush
	String top1LastMonth = "";				//Available in Skywars, Octagon, ShootCraft, Survival & PvpSmash
	String damageLastMonth = "";			//Available in Octagon & PvpSmash
	String nexusDamageLastMonth = "";		//Available in Blitz

	protected void setLeaderBoardLastMonth(String leaderBoardLastMonth) {
		this.leaderBoardLastMonth = leaderBoardLastMonth;
	}

	protected void setPointsLastMonth(String pointsLastMonth) {
		this.pointsLastMonth = pointsLastMonth;
	}

	protected void setGamesLastMonth(String gamesLastMonth) {
		this.gamesLastMonth = gamesLastMonth;
	}

	protected void setVictoriesLastMonth(String victoriesLastMonth) {
		this.victoriesLastMonth = victoriesLastMonth;
	}

	protected void setDefeatsLastMonth(String defeatsLastMonth) {
		this.defeatsLastMonth = defeatsLastMonth;
	}

	protected void setPlayedTimeLastMonth(String playedTimeLastMonth) {
		this.playedTimeLastMonth = playedTimeLastMonth;
	}

	protected void setKillsLastMonth(String killsLastMonth) {
		this.killsLastMonth = killsLastMonth;
	}

	protected void setDeathsLastMonth(String deathsLastMonth) {
		this.deathsLastMonth = deathsLastMonth;
	}

	protected void setBedsDestroyLastMonth(String bedsDestroyLastMonth) {
		this.bedsDestroyLastMonth = bedsDestroyLastMonth;
	}

	protected void setTop1LastMonth(String top1LastMonth) {
		this.top1LastMonth = top1LastMonth;
	}

	protected void setDamageLastMonth(String damageLastMonth) {
		this.damageLastMonth = damageLastMonth;
	}

	protected void setNexusDamageLastMonth(String nexusDamageLastMonth) {
		this.nexusDamageLastMonth = nexusDamageLastMonth;
	}

	public String getLeaderBoardLastMonth() {
		return leaderBoardLastMonth;
	}

	public String getPointsLastMonth() {
		return pointsLastMonth;
	}

	public String getGamesLastMonth() {
		return gamesLastMonth;
	}

	public String getVictoriesLastMonth() {
		return victoriesLastMonth;
	}

	public String getDefeatsLastMonth() {
		return defeatsLastMonth;
	}

	public String getPlayedTimeLastMonth() {
		return playedTimeLastMonth;
	}

	public String getKillsLastMonth() {
		return killsLastMonth;
	}

	public String getDeathsLastMonth() {
		return deathsLastMonth;
	}

	public String getBedsDestroyLastMonth() {
		return bedsDestroyLastMonth;
	}

	public String getTop1LastMonth() {
		return top1LastMonth;
	}

	public String getDamageLastMonth() {
		return damageLastMonth;
	}

	public String getNexusDamageLastMonth() {
		return nexusDamageLastMonth;
	}

	public void setStats(Element playerStatsElement) {

		//Only For Rush Retro & MDT Stats
		//Override Method for Other Games
		final Element leaderBoardElement = playerStatsElement.getElementsByClass("stats-entry").get(0);
		final Element pointsElement = playerStatsElement.getElementsByClass("stats-entry").get(1);
		final Element gamesElement = playerStatsElement.getElementsByClass("stats-entry").get(2);
		final Element victoriesElement = playerStatsElement.getElementsByClass("stats-entry").get(3);
		final Element defeatsElement = playerStatsElement.getElementsByClass("stats-entry").get(4);
		final Element playedTimeElement = playerStatsElement.getElementsByClass("stats-entry").get(5);
		final Element killsElement = playerStatsElement.getElementsByClass("stats-entry").get(6);
		final Element deathsElement = playerStatsElement.getElementsByClass("stats-entry").get(7);
		final Element bedsDestroyElement = playerStatsElement.getElementsByClass("stats-entry").get(8);

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
		this.setBedsDestroy(replaceDashByZero(
				bedsDestroyElement.getElementsByClass("stats-value stats-value-daily").first().text()));
		this.setBedsDestroyLastMonth(replaceDashByZero(
				bedsDestroyElement.getElementsByClass("stats-value stats-value-monthly").first()
						.getElementsByClass("player-stats-periodval").first().text()));
	}


	public static String replaceDashByZero(String sToReplace) {
		if(sToReplace.equals("-")) {
			return "0";
		} else {
			return sToReplace;
		}
	}
}
