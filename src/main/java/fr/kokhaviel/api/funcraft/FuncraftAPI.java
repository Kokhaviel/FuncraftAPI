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
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class FuncraftAPI {

	public FuncraftAPI() {
	}

	public RushRetro getRushRetroStats(String player) throws IOException {
		return new RushRetro(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.first());
	}

	public RushMDT getRushMDTStats(String player) throws IOException {
		return new RushMDT(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(1));
	}

	public Hikabrain getHikabrainStats(String player) throws IOException {
		return new Hikabrain(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(2));
	}

	public Skywars getSkywarsStats(String player) throws IOException {
		return new Skywars(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(3));
	}

	public Octogone getOctogoneStats(String player) throws IOException {
		return new Octogone(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(4));
	}

	public ShootCraft getShootCraftStats(String player) throws IOException {
		return new ShootCraft(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(5));
	}

	public Infected getInfectedStats(String player) throws IOException {
		return new Infected(this.getStats(player)
				.getElementsByClass("row")
				.get(2).getElementsByClass("col-md-4 col-sm-6")
				.get(6));
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


//TODO : INSCRIPTION, LAST CONNECTION, HEAD, GLORIES, PLAYED PARTY, RANK :
//
//new FuncraftAPI().get("Kokhaviel")
//				.selectFirst("html")
//				.selectFirst("body")
//				.getElementById("main-layout")
//				.getElementsByClass("container player-banner-margin-top").first()
//				.getElementsByClass("box").first();