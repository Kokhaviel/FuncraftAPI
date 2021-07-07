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
 * Funcraft Rush MDT Statistics
 * @author Kokhaviel
 * @since 1.0
 */
public class RushMDT extends Game {

	public RushMDT(Element rushMDTElement) {
		final Element playerStats = rushMDTElement.getElementsByClass("player-stats-game").first();
		final Element playerStatsInfo = playerStats.getElementsByClass("player-stats-info").get(0);
		this.setGameName(playerStats.getElementsByClass("name game-border-rush").first().text());
		setStats(playerStatsInfo);
	}

}
