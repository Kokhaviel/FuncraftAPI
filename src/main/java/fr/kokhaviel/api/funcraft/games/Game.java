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

public abstract class Game {
	/**
	 * Get Game Name
	 */
	public abstract String getGameName();

	/**
	 * Get Leaderboard Points
	 */
	public abstract String getLeaderBoard();

	/**
	 * Get Game Points
	 */
	public abstract String getPoints();

	/**
	 * Get Games Played
	 */
	public abstract String getGames();

	/**
	 * Get Total Victories
	 */
	public abstract String getVictories();

	/**
	 * Get Total Defeats
	 */
	public abstract String getDefeats();

	/**
	 * Get Game Played Time
	 */
	public abstract String getPlayedTime();

	/**
	 * Get Total Kills
	 */
	public abstract String getKills();

	/**
	 * Get Total Deaths
	 */
	public abstract String getDeaths();

	/**
	 * Get Total Beds Destroyed
	 */
	public abstract String getBedsDestroy();

	/**
	 * Get Total Top 1
	 */
	public abstract String getTop1();

	/**
	 * Get Total Damage Dealt
	 */
	public abstract String getDamage();

	/**
	 * Get Total Nexus Damage Dealt
	 */
	public abstract String getNexusDamage();

	/**
	 * Get Last Month Leaderboard Point
	 */
	public abstract String getLeaderBoardLastMonth();

	/**
	 * Get Last Month Points
	 */
	public abstract String getPointsLastMonth();

	/**
	 * Get Last Month Games Played
	 */
	public abstract String getGamesLastMonth();

	/**
	 * Get Last Month Victories
	 */
	public abstract String getVictoriesLastMonth();


	/**
	 * Get Last Month Defeats
	 */
	public abstract String getDefeatsLastMonth();

	/**
	 * Get Last Month Played Time
	 */
	public abstract String getPlayedTimeLastMonth();

	/**
	 * Get Last Month Kills
	 */
	public abstract String getKillsLastMonth();

	/**
	 * Get Last Month Deaths
	 */
	public abstract String getDeathsLastMonth();

	/**
	 * Get Last Month Beds Destroyed
	 */
	public abstract String getBedsDestroyLastMonth();

	/**
	 * Get Last Month Top 1
	 */
	public abstract String getTop1LastMonth();

	/**
	 * Get Last Month Damage Dealt
	 */
	public abstract String getDamageLastMonth();

	/**
	 * Get Last Month Nexus Damage Dealt
	 */
	public abstract String getNexusDamageLastMonth();

	/**
	 * Replace "-" by "0" in Stats
	 */
	public static String replaceDashByZero(String sToReplace) {
		if(sToReplace.equals("-")) {
			return "0";
		} else {
			return sToReplace;
		}
	}
}
